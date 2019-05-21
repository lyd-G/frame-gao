/**
 * Copyright Plus(c) 2011-2016, hubin Plus(jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 Plus(the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.frame.common.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.toolkit.*;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.frame.common.base.component.ApplicationContextComponent;
import com.frame.common.base.constant.BaseDataConstant;
import com.frame.common.base.exception.GlobalErrorException;
import com.frame.common.base.knowledge.FrameMessageEnum;
import com.frame.common.base.model.BaseEntity;
import com.frame.common.base.model.Convert;
import com.frame.common.base.service.IBaseService;
import com.frame.common.base.shiro.ShiroUser;
import com.frame.common.base.util.BeanConverterUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 重写 com.baomidou.mybatisplus.service.impl.BaseServiceImpl
 * 特殊处理了 修改 添加 删除失败的全局异常处理
 * <p>
 * IBaseService 实现类（ 泛型：M 是 mapper 对象，T 是实体 ， PK 是主键泛型 ）
 * </p>
 *
 * @author hubin
 * @Date 2016-04-20
 */
@Slf4j
@Transactional(rollbackFor = {Exception.class, Error.class})
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> implements IBaseService<T> {
    /**
     * 获取当前登录用户account
     *
     * @return 账户
     */
    protected String getCurrentAccount() {
        return ShiroUser.getCurrentUser().getAccount();
    }


    /**
     * 获取当前登录用户ShiroUser信息
     *
     * @return 账户
     */
    protected ShiroUser getCurrentUser() {
        return ShiroUser.getCurrentUser();
    }

    @Autowired
    protected M baseMapper;

    /**
     * <p>
     * 判断数据库操作是否成功
     * </p>
     * <p>
     * 注意！！ 该方法为 Integer 判断，不可传入 int 基本类型
     * </p>
     *
     * @param result 数据库操作返回影响条数
     * @return boolean
     */
    protected boolean retBool(Integer result) {
        return SqlHelper.retBool(result);
    }

    @SuppressWarnings("unchecked")
    protected Class<T> currentModelClass() {
        return ReflectionKit.getSuperClassGenericType(getClass(), 1);
    }

    /**
     * <p>
     * 批量操作 SqlSession
     * </p>
     */
    protected SqlSession sqlSessionBatch() {
        return SqlHelper.sqlSessionBatch(currentModelClass());
    }

    /**
     * 释放sqlSession
     *
     * @param sqlSession session
     */
    protected void closeSqlSession(SqlSession sqlSession) {
        SqlSessionUtils.closeSqlSession(sqlSession, GlobalConfigUtils.currentSessionFactory(currentModelClass()));
    }

    /**
     * 获取SqlStatement
     *
     * @param sqlMethod
     * @return
     */
    protected String sqlStatement(SqlMethod sqlMethod) {
        return SqlHelper.table(currentModelClass()).getSqlStatement(sqlMethod.getMethod());
    }

    /**
     * 插入数据处理
     *
     * @param num 插入结果
     * @return
     */
    private boolean saveResult(Integer num) {
        if (retBool(num)) {
            return Boolean.TRUE;
        } else {
            throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
        }
    }

    @Override
    public boolean save(T entity) {
        return this.saveResult(baseMapper.insert(entity));
    }


    /**
     * 批量插入
     *
     * @param entityList
     * @param batchSize
     * @return
     */

    @Override
    public boolean saveBatch(Collection<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            log.error("Error: saveBatch entityList must not be empty");
            throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
        }

        int i = 0;
        String sqlStatement = sqlStatement(SqlMethod.INSERT_ONE);
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            for (T anEntityList : entityList) {
                batchSqlSession.insert(sqlStatement, anEntityList);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        } catch (Throwable e) {
            log.error("Error: Cannot execute saveBatch Method. Cause", e);
            throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
        }
        return true;
    }

    /**
     * <p>
     * TableId 注解存在更新记录，否插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return boolean
     */
    @Override
    public boolean saveOrUpdate(T entity, boolean throwEx) {
        if (null != entity) {
            Class<?> cls = entity.getClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(cls);
            if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                Object idVal = ReflectionKit.getMethodValue(cls, entity, tableInfo.getKeyProperty());
                if (StringUtils.checkValNull(idVal)) {
                    return save(entity);
                } else {
                    /*
                     * 根据主键查询,有则更新，无插入逻辑
                     * TODO 更新的时候 比较版本号，如果版本号大于1，则理解是做更新操作，如果更新失败则抛错
                     */
                    Object versionVal = ReflectionKit.getMethodValue(entity, BaseEntity.VERSION_NUM_FILED);
                    if (versionVal != null && (Integer) versionVal != null) {
                        return this.updateById(entity, throwEx);
                    }
                    return retBool(baseMapper.updateById(entity)) || save(entity);
                }
            } else {

                log.error("Error:  Can not execute. Could not find @TableId.");
                throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
            }
        }
        return false;
    }


    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
        }
        Class<?> cls = null;
        TableInfo tableInfo = null;
        int i = 0;
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            for (T anEntityList : entityList) {
                if (i == 0) {
                    cls = anEntityList.getClass();
                    tableInfo = TableInfoHelper.getTableInfo(cls);
                }

                if (null != tableInfo && StringUtils.isNotEmpty(tableInfo.getKeyProperty())) {
                    Object idVal = ReflectionKit.getMethodValue(cls, anEntityList, tableInfo.getKeyProperty());
                    if (StringUtils.checkValNull(idVal)) {
                        String sqlStatement = sqlStatement(SqlMethod.INSERT_ONE);
                        batchSqlSession.insert(sqlStatement, anEntityList);
                    } else {
                        String sqlStatement = sqlStatement(SqlMethod.UPDATE_BY_ID);
                        MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                        param.put(Constants.ENTITY, anEntityList);
                        batchSqlSession.update(sqlStatement, param);
                        //不知道以后会不会有人说更新失败了还要执行插入
                    }
                    if (i >= 1 && i % batchSize == 0) {
                        batchSqlSession.flushStatements();
                    }
                    i++;
                } else {
                    throw new GlobalErrorException(FrameMessageEnum.INSERT_ERROR);
                }
                batchSqlSession.flushStatements();
            }
        }
        return true;

    }

    /**
     * 删除据处理
     *
     * @param num 删除结果
     * @return
     */
    private boolean removeResult(Integer num, boolean throwEx) {
        if (SqlHelper.delBool(num)) {
            return Boolean.TRUE;
        } else {
            if (throwEx) {
                throw new GlobalErrorException(FrameMessageEnum.DELETE_ERROR);
            } else {
                return Boolean.FALSE;
            }
        }
    }

    @Override
    public boolean removeById(Serializable id, boolean throwEx) {
        return this.removeResult(baseMapper.deleteById(id), throwEx);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap, boolean throwEx) {
        if (ObjectUtils.isEmpty(columnMap)) {
            log.error("removeByMap columnMap is empty.");
            throw new GlobalErrorException(FrameMessageEnum.DELETE_ERROR);
        }
        return this.removeResult(baseMapper.deleteByMap(columnMap), throwEx);
    }


    /**
     * <p>
     * 根据 entity 条件，删除记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param throwEx      没有删除数据 是否抛出异常
     * @return
     */
    @Override
    public boolean remove(Wrapper<T> queryWrapper, boolean throwEx) {
        return this.removeResult(baseMapper.delete(queryWrapper), throwEx);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList, boolean throwEx) {
        return this.removeResult(baseMapper.deleteBatchIds(idList), throwEx);
    }


    /**
     * 更新处理
     *
     * @param num 更新结果
     * @return
     */
    private boolean updateResult(Integer num, boolean throwEx) {
        if (SqlHelper.retBool(num)) {
            return Boolean.TRUE;
        } else {
            if (throwEx) {
                throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);
            } else {
                return Boolean.FALSE;
            }
        }
    }


    @Override
    public boolean updateById(T entity, boolean throwEx) {
        //先更新
        boolean result = this.updateResult(baseMapper.updateById(entity), false);
        if (result) {
            return Boolean.TRUE;
        } else {
            if (!throwEx) {
                return Boolean.FALSE;

            }
            //更新失败，先判断是否有ID
            Object idVal = ReflectionKit.getMethodValue(entity, BaseEntity.ID_FILED);

            //无ID
            if (StringUtils.checkValNull(idVal)) {
                throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);

            }
            //无数据更新
            BaseEntity baseEntity = this.getById(idVal.toString());
            if (baseEntity == null) {
                throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);
            }
            //判断版本号
            Object versionVal = ReflectionKit.getMethodValue(entity, BaseEntity.VERSION_NUM_FILED);
            //是否有传入版本号,有则进行错误控制
            if (versionVal != null && (Integer) versionVal != null) {
                if (baseEntity.getVersionNum() != null && baseEntity.getVersionNum().equals(versionVal)) {
                    //版本号一致
                } else {
                    //版本号一致
                    throw new GlobalErrorException(FrameMessageEnum.UPDATE_VERSION_ERROR);
                }
            }
            // 兜底
            throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);
        }


    }

    @Override
    public boolean update(T entity, Wrapper<T> updateWrapper, boolean throwEx) {
        //TODO 要解决updateWrapper 不要含有版本号，才能判断，要不查询条件里也有版本号

        return this.updateResult(baseMapper.update(entity, updateWrapper), throwEx);


    }


    @Override
    public boolean updateBatchById(Collection<T> entityList) {
        return updateBatchById(entityList, 1000);
    }


    @Override
    public boolean updateBatchById(Collection<T> entityList, int batchSize) {
        if (CollectionUtils.isEmpty(entityList)) {
            log.error("Error: updateBatchById entityList must not be empty");
            throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);
        }
        int i = 0;
        String sqlStatement = sqlStatement(SqlMethod.UPDATE_BY_ID);
        try (SqlSession batchSqlSession = sqlSessionBatch()) {
            for (T anEntityList : entityList) {
                MapperMethod.ParamMap<T> param = new MapperMethod.ParamMap<>();
                param.put(Constants.ENTITY, anEntityList);
                batchSqlSession.update(sqlStatement, param);
                if (i >= 1 && i % batchSize == 0) {
                    batchSqlSession.flushStatements();
                }
                i++;
            }
            batchSqlSession.flushStatements();
        } catch (Throwable e) {
            log.error("Error: Cannot execute updateBatchById Method. Cause", e);
            throw new GlobalErrorException(FrameMessageEnum.UPDATE_ERROR);
        }
        return true;
    }

    @Override
    public T getById(Serializable id) {
        return baseMapper.selectById(id);
    }

    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id  主键ID
     * @param cls
     * @return T
     */
    @Override
    public <E extends Convert> E getById(Serializable id, Class<E> cls) {
        E entityDto = null;
        T t = (T) getById(id);
        if (Objects.nonNull(t)) {
            entityDto = t.convert(cls);
        }
        return entityDto;
    }

    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> idList) {
        return baseMapper.selectBatchIds(idList);
    }

    /**
     * <p>
     * 查询（根据ID 批量查询）
     * </p>
     *
     * @param idList 主键ID列表
     * @param cls
     * @return Collection<T>
     */
    @Override
    public <E extends Convert> Collection<E> listByIds(Collection<? extends Serializable> idList, Class<E> cls) {

        List<E> entityDtoList = Collections.emptyList();
        List<T> list = (List) listByIds(idList);
        if (CollectionUtils.isNotEmpty(list)) {
            entityDtoList = BeanConverterUtil.convert(list, cls);
        }
        return entityDtoList;
    }

    @Override
    public Collection<T> listByMap(Map<String, Object> columnMap) {
        return baseMapper.selectByMap(columnMap);
    }

    @Override
    public T getOne(Wrapper<T> queryWrapper, boolean throwEx) {
        if (throwEx) {
            return baseMapper.selectOne(queryWrapper);
        }
        return SqlHelper.getObject(baseMapper.selectList(queryWrapper));
    }

    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param throwEx      有多个 result 是否抛出异常
     * @param cls
     * @return
     */
    @Override
    public <E extends Convert> E getOne(Wrapper<T> queryWrapper, boolean throwEx, Class<E> cls) {
        E entityDto = null;
        T t = (T) getOne(queryWrapper, throwEx);
        if (Objects.nonNull(t)) {
            entityDto = t.convert(cls);
        }
        return entityDto;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<T> queryWrapper) {
        return SqlHelper.getObject(baseMapper.selectMaps(queryWrapper));
    }

    @Override
    public Object getObj(Wrapper<T> queryWrapper) {
        return SqlHelper.getObject(baseMapper.selectObjs(queryWrapper));
    }

    @Override
    public int count(Wrapper<T> queryWrapper) {
        return SqlHelper.retCount(baseMapper.selectCount(queryWrapper));
    }

    /**
     * <p>
     * 查询列表
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param cls
     * @return
     */
    @Override
    public <E extends Convert> List<E> list(Wrapper<T> queryWrapper, Class<E> cls) {
        List<E> entityDtoList = Collections.emptyList();
        List<T> list = list(queryWrapper);
        if (CollectionUtils.isNotEmpty(list)) {
            entityDtoList = BeanConverterUtil.convert(list, cls);
        }
        return entityDtoList;
    }

    @Override
    public List<T> list(Wrapper<T> queryWrapper) {
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }

    /**
     * <p>
     * 翻页查询
     * </p>
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link QueryWrapper}
     * @param cls
     * @return
     */
    @Override
    public <E> IPage<E> page(IPage page, Wrapper queryWrapper, Class<E> cls) {
        this.page(page, queryWrapper);
        page.setRecords(BeanConverterUtil.convert(page.getRecords(), cls));
        return page;

    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper) {
        return baseMapper.selectMaps(queryWrapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<T> queryWrapper) {
        return baseMapper.selectObjs(queryWrapper).stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper) {
        return baseMapper.selectMapsPage(page, queryWrapper);
    }
    
    /**
     * 批量保存列表数据，删除要删除的数据，保存新添加和修改的数据
     *
     * @param entityList   提交的页面数据
     * @param queryWrapper 要取得所有操作数据的查询条件
     */
    @Override
    public void setBatch(Collection<T> entityList, Wrapper<T> queryWrapper) {
        this.setBatchOnlyDelete(entityList, queryWrapper);
        if (CollectionUtils.isNotEmpty(entityList)) {
            //更新变化数据
            this.saveOrUpdateBatch(entityList);
        }
    }


    /**
     * 批量保存列表数据，删除要删除的数据，
     *
     * @param entityList   提交的页面数据
     * @param queryWrapper 要取得所有操作数据的查询条件
     */
    @Override
    public void setBatchOnlyDelete(Collection<T> entityList, Wrapper<T> queryWrapper) {
        //先查询数据库当前信息
        List<T> objsList = this.list(queryWrapper);
        //删除数据
        //处理要删除的数据
        if (CollectionUtils.isNotEmpty(objsList)) {
            Set<String> objDbMap = new HashSet<>(objsList.size());
            for (T obj : objsList) {
                objDbMap.add(obj.getId());
            }
            //去掉已操作数据
            for (T obj : entityList) {
                if (StringUtils.isNotEmpty(obj.getId())) {
                    objDbMap.remove(obj.getId());
                }
            }
            //删除数据
            if (!objDbMap.isEmpty()) {
                this.removeByIds(objDbMap);
            }
        }
    }

    /**
     * 批量保存变更单数据到原始单据，删除原始单据多余的数据
     *
     * @param modList      变更单数据
     * @param originalList 原始单数据
     */
    @Override
    public void setModBatch(List<T> modList, List<T> originalList) {
        //变更单据数量
        int modSize = CollectionUtils.isNotEmpty(modList) ? modList.size() : 0;
        //原单据数量
        int originalSize = CollectionUtils.isNotEmpty(originalList) ? originalList.size() : 0;
        //变更单据、原始单据最小数量
        int minSize = modSize > originalSize ? originalSize : modSize;
        for (int i = 0; i < minSize; i++) {
            modList.get(i).setId(originalList.get(i).getId());
            modList.get(i).setVersionNum(originalList.get(i).getVersionNum());
        }
        //变更单数据多情况
        if (modSize > minSize) {
            for (int j = minSize; j < modSize; j++) {
                modList.get(j).setId(null);
                modList.get(j).setVersionNum(null);
            }
        }
        this.saveOrUpdateBatch(modList);
        //原单据数据多情况
        List<String> originalIdList = new ArrayList<>();
        if (originalSize > minSize) {
            for (int k = minSize; k < originalSize; k++) {
                originalIdList.add(originalList.get(k).getId());
            }
            this.removeByIds(originalIdList);
        }
    }

}
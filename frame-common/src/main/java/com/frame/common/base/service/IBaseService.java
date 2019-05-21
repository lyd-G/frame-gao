/**
 * Copyright (c) 2011-2016, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
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
package com.frame.common.base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.frame.common.base.model.BaseEntity;
import com.frame.common.base.model.Convert;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 顶级 Service
 * </p>
 *
 * @author ly
 * @Date 2019-04-20
 */
public interface IBaseService<T extends BaseEntity> {

    /**
     * <p>
     * 插入一条记录（选择字段，策略插入）
     * </p>
     *
     * @param entity 实体对象
     * @return boolean
     */
    boolean save(T entity);


    /**
     * <p>
     * 插入（批量）
     * </p>
     *
     * @param entityList 实体对象集合
     * @return boolean
     */
    default boolean saveBatch(Collection<T> entityList) {
        return saveBatch(entityList, 1000);
    }

    /**
     * <p>
     * 插入（批量）
     * </p>
     *
     * @param entityList 实体对象集合
     * @param batchSize  插入批次数量
     * @return boolean
     */
    boolean saveBatch(Collection<T> entityList, int batchSize);

    /**
     * <p>
     * 批量修改插入
     * </p>
     *
     * @param entityList 实体对象集合
     * @return boolean
     */
    default boolean saveOrUpdateBatch(Collection<T> entityList) {
        return saveOrUpdateBatch(entityList, 1000);
    }


    /**
     * <p>
     * 批量修改插入
     * </p>
     *
     * @param entityList 实体对象集合
     * @param batchSize  每次的数量
     * @return boolean
     */
    boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize);

    /**
     * <p>
     * 根据 ID 删除,没有删除数据 抛出异常
     * </p>
     *
     * @param id 主键ID
     * @return boolean
     */
    default boolean removeById(Serializable id) {
        return this.removeById(id, Boolean.TRUE);
    }

    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id      主键ID
     * @param throwEx 没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean removeById(Serializable id, boolean throwEx);


    /**
     * <p>
     * 根据 columnMap 条件，删除记录,没有删除数据 抛出异常
     * </p>
     *
     * @param columnMap 表字段 map 对象
     * @return boolean
     */
    default boolean removeByMap(Map<String, Object> columnMap) {
        return this.removeByMap(columnMap, Boolean.TRUE);
    }


    /**
     * <p>
     * 根据 columnMap 条件，删除记录
     * </p>
     *
     * @param columnMap 表字段 map 对象
     * @param throwEx   没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean removeByMap(Map<String, Object> columnMap, boolean throwEx);

    /**
     * <p>
     * 根据 entity 条件，删除记录,没有删除数据 抛出异常
     * </p>
     *
     * @param queryWrapper 实体包装类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return boolean
     */
    default boolean remove(Wrapper<T> queryWrapper) {
        return this.remove(queryWrapper, Boolean.TRUE);
    }


    /**
     * <p>
     * 根据 entity 条件，删除记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @param throwEx      没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean remove(Wrapper<T> queryWrapper, boolean throwEx);


    /**
     * <p>
     * 删除（根据ID 批量删除）
     * </p>
     *
     * @param idList  主键ID列表
     * @param throwEx 没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean removeByIds(Collection<? extends Serializable> idList, boolean throwEx);

    /**
     * <p>
     * 删除（根据ID 批量删除）
     * </p>
     *
     * @param idList 主键ID列表
     * @return boolean
     */
    default boolean removeByIds(Collection<? extends Serializable> idList) {
        return this.removeByIds(idList, Boolean.TRUE);
    }

    /**
     * <p>
     * 根据 ID 选择修改,没有更新数据 抛出异常
     * </p>
     *
     * @param entity 实体对象
     * @return boolean
     */
    default boolean updateById(T entity) {
        return this.updateById(entity, Boolean.TRUE);
    }

    /**
     * <p>
     * 根据 ID 选择修改
     * </p>
     *
     * @param entity  实体对象
     * @param throwEx 没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean updateById(T entity, boolean throwEx);

    /**
     * <p>
     * 根据 whereEntity 条件，更新记录,没有更新数据 抛出异常
     * </p>
     *
     * @param entity        实体对象
     * @param updateWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper}
     * @return boolean
     */
    default boolean update(T entity, Wrapper<T> updateWrapper) {
        return this.update(entity, updateWrapper, Boolean.TRUE);
    }


    /**
     * <p>
     * 根据 whereEntity 条件，更新记录
     * </p>
     *
     * @param entity        实体对象
     * @param updateWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper}
     * @param throwEx       没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean update(T entity, Wrapper<T> updateWrapper, boolean throwEx);

    /**
     * <p>
     * 根据ID 批量更新
     * </p>
     *
     * @param entityList 实体对象集合
     * @return boolean
     */

    default boolean updateBatchById(Collection<T> entityList) {
        return updateBatchById(entityList, 1000);
    }

    /**
     * <p>
     * 根据ID 批量更新
     * </p>
     *
     * @param entityList 实体对象集合
     * @param batchSize  更新批次数量
     * @return boolean
     */
    boolean updateBatchById(Collection<T> entityList, int batchSize);


    /**
     * <p>
     * 根据ID 批量更新
     * </p>
     *
     * @param entity 实体对象
     * @return boolean
     */
    default boolean saveOrUpdate(T entity) {
        return saveOrUpdate(entity, true);
    }


    /**
     * <p>
     * 根据ID 批量更新
     * </p>
     *
     * @param entity  实体对象
     * @param throwEx 没有删除数据 是否抛出异常
     * @return boolean
     */
    boolean saveOrUpdate(T entity, boolean throwEx);

    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id 主键ID
     * @return T
     */
    T getById(Serializable id);


    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id  主键ID
     * @param cls 转换对象
     * @param <E> 转换类
     * @return
     */
    <E extends Convert> E getById(Serializable id, Class<E> cls);


    /**
     * <p>
     * 查询（根据ID 批量查询）
     * </p>
     *
     * @param idList 主键ID列表
     * @return Collection<T>
     */
    Collection<T> listByIds(Collection<? extends Serializable> idList);


    /**
     * <p>
     * 查询（根据ID 批量查询）
     * </p>
     *
     * @param idList 主键ID列表
     * @param idList
     * @param cls
     * @param <E>
     * @return Collection<T>
     */
    <E extends Convert> Collection<E> listByIds(Collection<? extends Serializable> idList, Class<E> cls);

    /**
     * <p>
     * 查询（根据 columnMap 条件）
     * </p>
     *
     * @param columnMap 表字段 map 对象
     * @return Collection<T>
     */
    Collection<T> listByMap(Map<String, Object> columnMap);

    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    default T getOne(Wrapper<T> queryWrapper) {
        return getOne(queryWrapper, false);
    }


    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @param cls
     * @return
     */
    default <E extends Convert> E getOne(Wrapper<T> queryWrapper, Class<E> cls) {
        return getOne(queryWrapper, false, cls);
    }

    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @param throwEx      有多个 result 是否抛出异常
     * @return
     */
    T getOne(Wrapper<T> queryWrapper, boolean throwEx);


    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @param throwEx      有多个 result 是否抛出异常
     * @return
     */
    <E extends Convert> E getOne(Wrapper<T> queryWrapper, boolean throwEx, Class<E> cls);

    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return map
     */
    Map<String, Object> getMap(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 根据 Wrapper，查询一条记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return object
     */
    Object getObj(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 根据 Wrapper 条件，查询总记录数
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return int
     */
    int count(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 查询列表
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    <E extends Convert> List<E> list(Wrapper<T> queryWrapper, Class<E> cls);


    /**
     * <p>
     * 查询列表
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    List<T> list(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 翻页查询
     * </p>
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper);


    /**
     * <p>
     * 翻页查询
     * </p>
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    <E> IPage<E> page(IPage page, Wrapper queryWrapper, Class<E> cls);

    /**
     * <p>
     * 查询列表
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return
     */
    List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 根据 Wrapper 条件，查询全部记录
     * </p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return list
     */
    List<Object> listObjs(Wrapper<T> queryWrapper);

    /**
     * <p>
     * 翻页查询
     * </p>
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     * @return page
     */
    IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper);

    /**
     * 批量保存列表数据，删除要删除的数据，保存新添加和修改的数据
     *
     * @param entityList   提交的页面数据
     * @param queryWrapper 要取得所有操作数据的查询条件
     */
    void setBatch(Collection<T> entityList, Wrapper<T> queryWrapper);


    /**
     * 批量保存列表数据，删除要删除的数据，
     *
     * @param entityList   提交的页面数据
     * @param queryWrapper 要取得所有操作数据的查询条件
     */
    void setBatchOnlyDelete(Collection<T> entityList, Wrapper<T> queryWrapper);

    /**
     * 批量保存变更单数据到原始单据，删除原始单据多余的数据
     *
     * @param modList      变更单数据
     * @param originalList 原始单数据
     */
    void setModBatch(List<T> modList, List<T> originalList);

}

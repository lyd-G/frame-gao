package com.frame.quartz.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.frame.common.base.model.ParamTable;
import com.frame.common.base.model.ResultTable;
import com.frame.common.base.service.impl.BaseServiceImpl;
import com.frame.quartz.config.ConfigQuartz;
import com.frame.quartz.dto.JobTaskLogDto;
import com.frame.quartz.entity.JobTaskLog;
import com.frame.quartz.mapper.JobTaskLogMapper;
import com.frame.quartz.service.IJobTaskLogService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

/**
 * <p>
 * job任务表日志表 服务实现类
 * </p>
 *
 * @author gaoly
 * @since 2018-04-23
 */
@Service
@ConditionalOnBean(ConfigQuartz.class)
public class JobTaskLogServiceImpl extends BaseServiceImpl<JobTaskLogMapper, JobTaskLog> implements IJobTaskLogService {
    /**
     * 分页查询
     *
     * @param paramTable 分页查询信息
     * @return 包含分面信息的查询结果
     */
    @Override
    public ResultTable<JobTaskLogDto> listJobTaskLog(ParamTable<JobTaskDto> paramTable) {
        Page page = paramTable.toPageInfo();
        page.setRecords(super.baseMapper.selectJobTaskLog(page, paramTable.getData()));
        return new ResultTable(page);
    }

    /**
     * Job日志删除
     *
     * @param jobTaskDto
     * @return
     */
    @Override
    public Boolean removeLog(JobTaskDto jobTaskDto) {
        return SqlHelper.retBool(super.baseMapper.deleteLog(jobTaskDto.getJobName(), jobTaskDto.getJobGroup()));
    }


}

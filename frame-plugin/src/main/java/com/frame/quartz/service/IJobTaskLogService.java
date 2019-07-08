package com.frame.quartz.service;

import com.frame.common.base.model.ParamTable;
import com.frame.common.base.model.ResultTable;
import com.frame.common.base.service.IBaseService;
import com.frame.quartz.dto.JobTaskDto;
import com.frame.quartz.dto.JobTaskLogDto;
import com.frame.quartz.entity.JobTaskLog;

/**
 * <p>
 * job任务表日志表 服务类
 * </p>
 *
 * @author gaoly
 * @since 2018-04-23
 */
public interface IJobTaskLogService extends IBaseService<JobTaskLog> {
    /**
     * 分页查询
     *
     * @param paramTable 分页查询信息
     * @return 包含分面信息的查询结果
     */
    ResultTable<JobTaskLogDto> listJobTaskLog(ParamTable<JobTaskDto> paramTable);


    /**
     * 删除操作日志
     *
     * @param jobTaskDto
     * @return
     */
    Boolean removeLog(JobTaskDto jobTaskDto);

}

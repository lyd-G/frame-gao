package com.frame.quartz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frame.quartz.dto.JobTaskDto;
import com.frame.quartz.dto.JobTaskLogDto;
import com.frame.quartz.entity.JobTaskLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * job任务表日志表 Mapper 接口
 * </p>
 *
 * @author gaoly
 * @since 2018-04-23
 */
public interface JobTaskLogMapper extends BaseMapper<JobTaskLog> {

    /**
     * 分布查询系统日志信息
     *
     * @param page 分面信息
     * @return 查询结果
     */
    List<JobTaskLogDto> selectJobTaskLog(Page<JobTaskDto> page, @Param("condition") JobTaskDto jobTaskDto);



    /**
     * 删除job执行日志信息
     *
     * @param name
     * @param group
     * @return
     */
    @Delete("delete from ST_TBL_JOB_TASK_LOG   WHERE  JOB_NAME =  #{name} and  JOB_GROUP =  #{group}")
    int deleteLog(@Param("name") String name, @Param("group") String group);
}


package com.frame.quartz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frame.quartz.dto.JobTaskDto;
import com.frame.quartz.dto.JobTaskLogDto;
import com.frame.quartz.entity.JobTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by EalenXie on 2018/6/4 14:27
 */
public interface JobTaskMapper extends BaseMapper<JobTask> {
    /**
     * 分布查询系统日志信息
     *
     * @param page 分面信息
     * @return 查询结果
     */
    List<JobTaskDto> selectJobTask(Page<JobTaskDto> page, @Param("condition") JobTaskDto jobTaskDto);

}

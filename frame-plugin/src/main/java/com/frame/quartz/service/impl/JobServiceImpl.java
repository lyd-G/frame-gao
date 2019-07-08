package com.frame.quartz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.frame.quartz.mapper.JobTaskMapper;
import com.frame.quartz.entity.JobTask;
import com.frame.quartz.job.DynamicJobTest;
import com.frame.quartz.service.IJobService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EalenXie on 2018/6/4 14:25
 */
@Service
public class JobServiceImpl implements IJobService {

    @Autowired
    private JobTaskMapper jobTaskMapper;

    //通过Id获取Job
    public JobTask getJobEntityById(Integer id) {
        return jobTaskMapper.selectById(id);
    }

    //从数据库中加载获取到所有Job
    public List<JobTask> loadJobs() {
        List<JobTask> list = new ArrayList<>();
        QueryWrapper<JobTask> queryWrapper=new QueryWrapper<>();
        jobTaskMapper.selectList(queryWrapper).forEach(list::add);
        return list;
    }

    //获取JobDataMap.(Job参数对象)
    public JobDataMap getJobDataMap(JobTask job) {
        JobDataMap map = new JobDataMap();
        map.put("name", job.getName());
        map.put("jobGroup", job.getJobGroup());
        map.put("cronExpression", job.getCron());
        map.put("parameter", job.getParameter());
        map.put("jobDescription", job.getDescription());
        map.put("vmParam", job.getVmParam());
        map.put("jarPath", job.getJarPath());
        map.put("status", job.getStatus());
        return map;
    }

    //获取JobDetail,JobDetail是任务的定义,而Job是任务的执行逻辑,JobDetail里会引用一个Job Class来定义
    public JobDetail getJobDetail(JobKey jobKey, String description, JobDataMap map) {
        return JobBuilder.newJob(DynamicJobTest.class)
                .withIdentity(jobKey)
                .withDescription(description)
                .setJobData(map)
                .storeDurably()
                .build();
    }
    //获取Trigger (Job的触发器,执行规则)
    public Trigger getTrigger(JobTask job) {
        return TriggerBuilder.newTrigger()
                .withIdentity(job.getName(), job.getJobGroup())
                .withSchedule(CronScheduleBuilder.cronSchedule(job.getCron()))
                .build();
    }

    //获取JobKey,包含Name和Group
    public JobKey getJobKey(JobTask job) {
        return JobKey.jobKey(job.getName(), job.getJobGroup());
    }

    public int save(JobTask job) {
        return jobTaskMapper.insert(job);
    }
}

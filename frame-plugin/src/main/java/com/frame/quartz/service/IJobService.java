package com.frame.quartz.service;

import com.frame.quartz.entity.JobTask;
import org.quartz.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ly
 * @since 2019-05-08
 */
@Service
public interface IJobService{

    //通过Id获取Job
    public JobTask getJobEntityById(Integer id);
    //从数据库中加载获取到所有Job
    public List<JobTask> loadJobs();


    //获取JobDetail,JobDetail是任务的定义,而Job是任务的执行逻辑,JobDetail里会引用一个Job Class来定义
    public JobDetail getJobDetail(JobKey jobKey, String description, JobDataMap map);
    //获取Trigger (Job的触发器,执行规则)
    public Trigger getTrigger(JobTask job);

    //获取JobKey,包含Name和Group
    public JobKey getJobKey(JobTask job);

    public int save(JobTask job);
}

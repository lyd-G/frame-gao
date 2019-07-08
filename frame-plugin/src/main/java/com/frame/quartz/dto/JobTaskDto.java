package com.frame.quartz.dto;

import com.frame.common.base.model.BaseEntityDto;
import com.frame.common.base.model.validation.group.UpdateGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by EalenXie on 2018/6/4 14:09
 * 这里个人示例,可自定义相关属性
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class JobTaskDto extends BaseEntityDto {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull(message = "the job id cannot be null",groups = {UpdateGroup.class})
    private Integer id;

    @NotNull(message = "the job id cannot be null",groups = {UpdateGroup.class})
    private String name;          //job名称

    private String jobGroup;      //job组名

    @NotNull(message = "the job id cannot be null",groups = {UpdateGroup.class})
    private String cron;          //执行的cron

    private String parameter;     //job的参数

    private String description;   //job描述信息

    private String vmParam;       //vm参数

    private String jarPath;       //job的jar路径

    private String status;        //job的执行状态,这里我设置为OPEN/CLOSE且只有该值为OPEN才会执行该Job
}

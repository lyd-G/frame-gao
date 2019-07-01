package com.frame.common.base.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author ly
 * @version V1.0
 * @Description: 所有根据Entity生成的DTO
 * @date
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class BaseEntityDto extends Convert {

    private String id;

    /**
     * 版本号
     */
    //@NotNull(message = "{BaseEntityDto.versionNum.NotNull}", groups = UpdateGroup.class)
    private Integer versionNum;
    /**
     * 逻辑删除标识
     */
    private String deleteFlag;

    /**
     * 创建者
     */
    protected String createUser;

    /**
     * 创建日期
     */
    protected LocalDateTime createDate;

    /**
     * 更新者
     */
    protected String updateUser;

    /**
     * 更新日期
     */
    protected LocalDateTime updateDate;

}

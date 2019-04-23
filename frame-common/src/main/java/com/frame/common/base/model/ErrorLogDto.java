package com.frame.common.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统日志表
 * </p>
 *
 * @author qmgf
 * @since 2018-08-31
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "错误日志")
public class ErrorLogDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 请求参数
     */
    @ApiModelProperty(value = "请求参数")
    private String requestParam;
    /**
     * IP地址
     */
    @ApiModelProperty(value = "IP地址")
    private String ipAddress;

    /**
     * 是否异常:1:是; 0:否
     */
    @ApiModelProperty(value = "是否异常:1:是; 0:否")
    private String isException;
    /**
     * 异常信息
     */
    @ApiModelProperty(value = "异常信息")
    private String exceptionInfo;

    /**
     * 请求URL
     */
    @ApiModelProperty(value = "请求URL")
    private String apiUrl;

    /**
     * 操作账号
     */
    @ApiModelProperty(value = "操作账号")
    private String account;


}

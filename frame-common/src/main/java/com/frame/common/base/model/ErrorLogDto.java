package com.frame.common.base.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统日志表
 * </p>
 *
 * @author ly
 * @since 2018-08-31
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class ErrorLogDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 请求参数
     */
    //"请求参数")
    private String requestParam;
    /**
     * IP地址
     */
    //"IP地址")
    private String ipAddress;

    /**
     * 是否异常:1:是; 0:否
     */
    //"是否异常:1:是; 0:否")
    private String isException;
    /**
     * 异常信息
     */
    //"异常信息")
    private String exceptionInfo;

    /**
     * 请求URL
     */
    //"请求URL")
    private String apiUrl;

    /**
     * 操作账号
     */
    //"操作账号")
    private String account;


}

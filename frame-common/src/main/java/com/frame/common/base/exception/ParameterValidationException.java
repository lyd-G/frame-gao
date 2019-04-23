package com.frame.common.base.exception;

import com.frame.common.base.knowledge.FrameMessageEnum;

/**
 * @author ly
 * @version V1.0
 * @Title: ParameterValidationException.java
 * @Package cn.com.cits.common.exception
 * @Description: 参数异常
 * @date 2014-6-25 下午5:18:03
 */

public class ParameterValidationException extends BaseErrorException {


    private String parameterValidationInfo;


    public ParameterValidationException(String parameterValidationInfo) {
        super(parameterValidationInfo);
        this.parameterValidationInfo = parameterValidationInfo;

    }

    /**
     * 返回枚举对应的消息内容(中文)
     *
     * @return 消息内容(中文)
     */
    @Override
    public String getMessage() {

        return super.getMessage() + parameterValidationInfo;
    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        return FrameMessageEnum.PARAMETER_ERROR.getId();
    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public Object[] getArgs() {
        return new Object[0];
    }
}

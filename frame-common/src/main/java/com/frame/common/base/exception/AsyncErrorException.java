package com.frame.common.base.exception;

/**
 * @author ly
 */
public class AsyncErrorException extends BaseErrorException {
    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        return null;
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

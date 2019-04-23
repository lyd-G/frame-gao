package com.frame.common.base.exception;

import com.frame.common.base.knowledge.IMessageEnum;

/**
 * @author SONGYANG
 */
public class ActivitiErrorException extends BaseErrorException {
    private IMessageEnum messageEnum;

    private Object[] args;


    public ActivitiErrorException(IMessageEnum messageEnum, Object[] args) {
        super(messageEnum.getMessage());
        this.args = args;
        this.messageEnum = messageEnum;

    }

    public ActivitiErrorException(IMessageEnum messageEnum) {
        this(messageEnum, null);

    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        return this.messageEnum.getId();
    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public Object[] getArgs() {
        return this.args;
    }
}

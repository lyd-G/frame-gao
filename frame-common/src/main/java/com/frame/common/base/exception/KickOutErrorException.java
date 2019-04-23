package com.frame.common.base.exception;


import com.frame.common.base.knowledge.IMessageEnum;

/**
 * @author ly
 * @version V1.0
 * @Title: KickOutErrorException
 * @Package com.frame.common.base.exception
 * @Description: 登陆用户人数超限制
 * @date 2014-6-25 下午5:18:03
 */

public class KickOutErrorException extends BaseErrorException {


    private IMessageEnum messageEnum;

    private Object[] args;


    public KickOutErrorException(IMessageEnum messageEnum, Object[] args) {
        super(messageEnum.getMessage());
        this.args = args;
        this.messageEnum = messageEnum;

    }

    public KickOutErrorException(IMessageEnum messageEnum) {
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

/**
 *
 */
package com.frame.common.base.exception;

import com.frame.common.base.knowledge.FrameMessageEnum;

/**
 * 用于处理系统内部的异常
 *
 * @author ly
 */
public class FunctionErrorException extends BaseErrorException {


    public FunctionErrorException(Exception e) {
        super(e);
    }


    public FunctionErrorException(Throwable e) {
        super(e);
    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        return FrameMessageEnum.SYSTEM_ERROR.getId();
    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public Object[] getArgs() {
        return null;
    }


}

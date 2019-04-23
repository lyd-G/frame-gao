package com.frame.common.base.exception;


import com.frame.common.base.knowledge.FrameMessageEnum;

/**
 * @author ly
 * @version V1.0
 * @Title: UpdateErrorException.java
 * @Package com.frame.common.base.exception
 * @Description: 数据没有更新成功异常
 * @date 2018-4-27 下午5:18:03
 */

public class UpdateErrorException extends BaseErrorException {


    public UpdateErrorException() {

    }

    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        return FrameMessageEnum.UPDATE_VERSION_ERROR.getId();
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

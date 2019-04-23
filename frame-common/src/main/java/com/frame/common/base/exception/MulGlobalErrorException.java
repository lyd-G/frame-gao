package com.frame.common.base.exception;

import com.frame.common.base.util.LocaleMessageSourceUtil;
import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ly
 * @version V1.0
 * @Title: MulGlobalErrorException.java
 * @Package com.frame.common.base.exception
 * @Description: 多错误信息全局异常
 * @date 2014-6-25 下午5:18:03
 */

public class MulGlobalErrorException extends GlobalErrorException {


    private Map<String, Object[]> message;

    private MulGlobalErrorException() {

    }

    public MulGlobalErrorException(Map<String, Object[]> message) {
        this.message = message;
    }


    /**
     * 返回枚举对应的消息ID
     *
     * @return 消息ID
     */
    @Override
    public String getId() {
        StringBuilder messageTemplateBuilder = new StringBuilder();
        if (message != null) {
            message.forEach((k, v) -> {
                if (StringUtils.isNotEmpty(k)) {
                    messageTemplateBuilder.append(k).append(", ");
                }
            });
        }
        return messageTemplateBuilder.toString();
    }

    /**
     * 返回枚举对应的消息内容(中文)
     *
     * @return 消息内容(中文)
     */
    @Override
    public String getMessage() {
        String messageText = "";
        if (message != null) {
            List<String> messageList = new ArrayList<>();
            message.forEach((k, v) -> {
                String messageTemplate = LocaleMessageSourceUtil.getMessage(k);
                if (StringUtils.isNotEmpty(messageTemplate) && v != null && v.length > 0) {
                    messageTemplate = MessageFormat.format(messageTemplate, v);
                }
                messageList.add(messageTemplate);
            });
            messageText = Joiner.on(",").skipNulls().join(messageList);
        }
        return messageText;

    }

}

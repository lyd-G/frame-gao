package com.frame.common.base.model;

import com.frame.common.base.util.BeanConverterUtil;

import java.io.Serializable;


/**
 * <p>
 * 普通实体父类
 * </p>
 *
 * @author Caratacus
 */
public class Convert implements Serializable {

    /**
     * 获取自动转换后的JavaBean对象
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T convert(Class<T> clazz) {
        return BeanConverterUtil.convert(this, clazz);
    }
}
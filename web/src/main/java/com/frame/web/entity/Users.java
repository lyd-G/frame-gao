package com.frame.web.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.frame.common.base.model.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * <p>
 *
 * @author ly
 * @since 2019-05-08
 */
@Data
@Accessors(chain = true)
@TableName("frame_users")
@KeySequence(value = "frame_users", clazz = String.class)
public class Users extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String account;
    private String name;
    private String password;
    private String email;
    private String mobile;
    private String details;
    private String roleId;
    private String description;
    private String usingFlag;
    @TableField("salt")
    private String salt;


    public static final String ACCOUNT = "account";

    public static final String NAME = "name";

    public static final String PASSWORD = "password";

    public static final String EMAIL = "email";

    public static final String MOBILE = "mobile";

    public static final String DETAILS = "details";

    public static final String ROLE_ID = "role_id";

    public static final String USING_FLAG = "using_flag";

    public static final String DESCRIPTION = "description";

    /**
     * ��־�ռ���Ĭ�����ݽṹ
     */
    public static Map<String, String> getDataPropertyMap() {
        Map<String, String> dataPropertyMap = com.google.common.collect.Maps.newHashMapWithExpectedSize(14);
        return dataPropertyMap;
    }
}
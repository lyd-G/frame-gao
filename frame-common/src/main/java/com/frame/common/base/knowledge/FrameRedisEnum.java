package com.frame.common.base.knowledge;


import com.frame.common.base.constant.CacheConstant;

/**
 * redis缓存时间
 *
 * @author ly
 */
public enum FrameRedisEnum {

    /**
     * 要进行kickOut处理的token列表,3600S
     */
    KICK_OUT_DEQUE(CacheConstant.SHIRO_KICK_OUT_DEQUE, 60 * 60),

    /**
     * kickOut处理过的token,7200S要和超时时间相一致
     */
    KICKED_TOKEN(CacheConstant.SHIRO_KICKED_TOKEN, 2 * 60 * 60),

    /**
     * logout退出的token,7200S要和超时时间相一致
     */
    LOGOUT_TOKEN(CacheConstant.SHIRO_LOGOUT_TOKEN, 2 * 60 * 60),

    /**
     * PasswdRealm.authorization 授权缓存2 * 60 * 60
     */
    PASSWD_REALM_AUTHORIZATION(CacheConstant.SHIRO_PASS_REALM_AUTHORIZATION, 60),

    /**
     * JwtRealm.authorization 授权缓存 2 * 60 * 60
     */
    JWT_REALM_AUTHORIZATION(CacheConstant.SHIRO_JWT_REALM_AUTHORIZATION, 60),

    /**
     * passwordRetry 密码重试限制缓存 10 * 60
     */
    PASSWORD_RETRY(CacheConstant.SHIRO_PASS_RETRY, 10 * 60),;


    /**
     * 成员变量
     */
    private final String value;
    /**
     * 过期时间
     */
    private final long expiresTime;

    /**
     * 构造方法
     */
    FrameRedisEnum(String value, long expiresTime) {
        this.value = value;
        this.expiresTime = expiresTime;
    }


    public String getValue() {
        return this.value;
    }

    public long getExpiresTime() {
        return this.expiresTime;
    }

    public static long getExpiresTime(String value) {
        for (FrameRedisEnum c : FrameRedisEnum.values()) {
            if (value.equals(c.getValue())) {
                return c.expiresTime;
            }
        }
        return 600;
    }
}

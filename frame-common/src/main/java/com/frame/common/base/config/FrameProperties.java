package com.frame.common.base.config;

import com.frame.common.base.knowledge.FrameKnowledge;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ly
 */
@ConfigurationProperties(prefix = "frame")
@Component
@Data
@NoArgsConstructor
public class FrameProperties {
    /**
     * Api账户信息
     */
    private FrameProperties.Config config;

    /**
     * 权限模块控制
     */
    private FrameProperties.Auth auth;

    /**
     * 文件
     */
    private FilePath file;

    /**
     * 线路池配置
     */
    private Async async;


    /**
     * quartz配置
     */
    private Quartz quartz;


    /**
     * 系统模块控制
     */
    @Data
    @NoArgsConstructor
    public static class Config {
        /**
         * 是否启动加密 默认为False
         */
        private boolean encryptEnable = false;

        /**
         * 是否启动swagger 默认为False
         */
        private boolean swaggerEnable = false;

        /**
         * RSA 私有key
         */
        private String rsaPrivateKey = "";

        /**
         * 是否使用桥接的BPM
         */
        private boolean bridgeBpmEnable = true;

        /**
         * 是否使用桥接的现货
         */
        private boolean bridgeCtSpotEnable = true;
        /**
         * 要额外控制缓存时间的bean 实现 IRedisExpiresService
         */
        private String[] redisExpiresBeanNames;

        /**
         * 要额外控制缓错误类型的bean 实现 IErrorFilterService
         */
        private String[] errorFilterBeanNames;
        /**
         * cors 的访问来源
         */
        private String[] apiAllowedOrigins = {"*"};
        /**
         * 日志有效期
         */
        private int logValidity = 30;

        /**
         * redis默认超时时间
         */
        private long redisDefaultExpiration = 300L;

        /**
         * 测试账户
         */
        private String testAccount = "admin";

        /**
         * 测试平台
         */
        private String testTerminal = FrameKnowledge.FrameTerminalEnum.PC.getValue();


    }

    /**
     * 权限模块控制
     */
    @Data
    @NoArgsConstructor
    public static class Auth {
        /**
         * 超级管理员
         */
        private String adminAccount = "";

        /**
         * jwtRealm isPermitted全局属性
         */
        private boolean requiresPermissions = true;

        /**
         * 密码重试次数
         */
        private int passwordRetryLimit = 5;
        /**
         * 是否执行kickout
         */
        private boolean kickOutValid = false;
        /**
         * 踢出之前登录的或者 之后登录的用户 默认(false)踢出之前登录的用户
         */
        private boolean kickOutAfter = false;
        /**
         * 同一个帐号最大会话数 默认1
         */
        private int kickOutMaxSession = 1;

        /**
         * 不要权限限制的url
         */
        private String[] ignoreUrl;
        /**
         * jwt密码信息
         */
        private String jwtSecret;
        /**
         * 默认10小时
         */
        private long jwtExpireTime = 10 * 60 * 60 * 1000L;


    }

    /**
     * 文件相关
     *
     * @author zhaoqiwei
     */
    @Data
    @NoArgsConstructor
    public static class FilePath {
        /**
         * 正式文件的位置
         */
        private String savePath;

        /**
         * 临时文件的位置
         */
        private String tempPath;

        /**
         * 临时文件保留日数
         */
        private Integer tempHoldDays;

        /**
         * 回收站文件保留日数
         */
        private Integer recycleHoldDays;
    }


    /**
     * quartz配置
     *
     * @author ly
     */
    @Data
    @NoArgsConstructor
    public static class Quartz {

        /**
         * 是否启动quartz
         */
        private boolean enable = false;
        /**
         * 包含的job group,多个数组 ，优先处理include ，include有值不处理exclude
         */
        private String[] includeJobGroup;
        /**
         * 不排除的job group,多个数组
         */
        private String[] excludeJobGroup;
    }

    /**
     * 文件相关
     *
     * @author zhaoqiwei
     */
    @Data
    @NoArgsConstructor
    public static class Async {
        /**
         * 线程池的大小
         */
        private int corePoolSize = 5;
        /**
         * 最大线程数
         */
        private int maxPoolSize = 20;
        /**
         * 排队队列长度
         */
        private int queueCapacity = 100;
        /**
         * 线程保活时间（单位秒）
         */
        private int keepAliveSeconds = 120;
        /**
         * 设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住
         */
        private int awaitTerminationSeconds = 60;
    }
}

package com.frame.common.base.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统模块
 *
 * @author ly
 */
public class FrameModelConstant {

    private FrameModelConstant() {
    }

    /**
     * 交易管理模块
     */
    public static final String CT = "CT";

    /**
     * 风险管理模块
     */
    public static final String RM = "RM";

    /**
     * 数据字典模块
     */
    public static final String DATA = "DATA";

    /**
     * 消息中心模块
     */
    public static final String SYS = "SYS";

    /**
     * 消息中心模块
     */
    public static final String MSG = "MSG";

    /**
     * 业务流程模块
     */
    public static final String BPM = "BPM";
    /**
     * 设置中心模块
     */
    public static final String SET = "SET";

    /**
     * 设置组织职能模块
     */
    public static final String FUN = "FUN";

    /**
     * 财务模块
     */
    public static final String FIN = "FIN";

    /**
     * 衍生品模块
     */
    public static final String DVT = "DVT";

    /**
     * 策略中心
     */
    public static final String STRG = "STRG";

    /**
     * 客户资源
     */
    public static final String CST = "CST";

    /**
     * 仓储物流
     */
    public static final String STORE = "STORE";

    /**
     * 现货业务模块
     */
    public static final String SPOT = "SPOT";

    public static final Map<String, String> FRAME_MODEL_INFO = new HashMap<>();

    static {
        FRAME_MODEL_INFO.put(DATA, "数据字典模块");
        FRAME_MODEL_INFO.put(SYS, "系统管理模块");
        FRAME_MODEL_INFO.put(MSG, "消息管理模块");
        FRAME_MODEL_INFO.put(BPM, "业务流程模块");
        FRAME_MODEL_INFO.put(SET, "设置管理模块");
        FRAME_MODEL_INFO.put(FUN, "组织职能模块");
        FRAME_MODEL_INFO.put(FIN, "财务管理模块");
        FRAME_MODEL_INFO.put(DVT, "衍生品业务模块");
        FRAME_MODEL_INFO.put(STRG, "策略中心模块");
        FRAME_MODEL_INFO.put(CST, "客户资源模块");
        FRAME_MODEL_INFO.put(STORE, "仓储物流模块");
        FRAME_MODEL_INFO.put(SPOT, "现货业务模块");
    }

}

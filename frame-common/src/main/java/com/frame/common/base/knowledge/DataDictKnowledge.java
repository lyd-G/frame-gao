package com.frame.common.base.knowledge;

/**
 * 字典码表常量
 *
 * @author 自动生成工具
 */
public class DataDictKnowledge {

    private DataDictKnowledge() {
    }

    /**
     * 是否标志
     */
    public enum YesNoEnum implements IDataDictEnum {
        /**
         * 是
         */
        YES("1", "是"),
        /**
         * 否
         */
        NO("0", "否");

        private static final String DATA_DICT_CODE = "YES_NO";
        private String dataCode;
        private String dataText;

        private YesNoEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 根据布尔型取得字符串
         *
         * @param flg
         * @return
         */
        public static String changeDataCode(boolean flg) {
            if (flg) {
                return YesNoEnum.YES.dataCode;
            } else {
                return YesNoEnum.NO.dataCode;

            }

        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static YesNoEnum forCode(String code) {
            YesNoEnum item = null;
            YesNoEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息发送状态
     */
    public enum MsgSendStatEnum implements IDataDictEnum {
        /**
         * 等待发送
         */
        WAIT_SEND("1", "等待发送"),
        /**
         * 发送中
         */
        SENDDING("2", "发送中"),
        /**
         * 发送成功
         */
        SEND_SUCCESS("3", "发送成功"),
        /**
         * 发送失败
         */
        SEND_FAIL("4", "发送失败"),
        /**
         * 状态确认失败
         */
        CHECK_STAT_FAIL("5", "状态确认失败"),
        /**
         * 用户取消
         */
        USER_CANCEL("6", "用户取消");

        private static final String DATA_DICT_CODE = "MSG_SEND_STAT";
        private String dataCode;
        private String dataText;

        private MsgSendStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgSendStatEnum forCode(String code) {
            MsgSendStatEnum item = null;
            MsgSendStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息功能类型
     */
    public enum MsgFuncTypeEnum implements IDataDictEnum {
        /**
         * 定向消息
         */
        DIRECT("1", "定向消息"),
        /**
         * 订阅消息
         */
        SUBSCRIBE("2", "订阅消息");

        private static final String DATA_DICT_CODE = "MSG_FUNC_TYPE";
        private String dataCode;
        private String dataText;

        private MsgFuncTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgFuncTypeEnum forCode(String code) {
            MsgFuncTypeEnum item = null;
            MsgFuncTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息收信账户类型
     */
    public enum MsgRecipientTypeEnum implements IDataDictEnum {
        /**
         * 系统账户
         */
        SYS_ACCOUNT("SYSACCOUNT", "系统账户"),
        /**
         * 手机号
         */
        MOBILE("MOBILE", "手机号"),
        /**
         * 邮箱
         */
        MAIL("MAIL", "邮箱"),
        /**
         * 传真
         */
        FAX("FAX", "传真"),
        /**
         * 微信
         */
        WEIXIN("WEIXIN", "微信"),
        /**
         * 钉钉
         */
        DING("DING", "钉钉"),
        /**
         * QQ
         */
        QQ("QQ", "QQ"),
        /**
         * 其他账户1
         */
        OTHER_ACCOUNT1("OTHER1", "其他账户1"),
        /**
         * 其他账户2
         */
        OTHER_ACCOUNT2("OTHER2", "其他账户2"),
        /**
         * 其他账户3
         */
        OTHER_ACCOUNT3("OTHER3", "其他账户3"),
        /**
         * 其他账户4
         */
        OTHER_ACCOUNT4("OTHER4", "其他账户4"),
        /**
         * 其他账户5
         */
        OTHER_ACCOUNT5("OTHER5", "其他账户5");

        private static final String DATA_DICT_CODE = "MSG_RECIPIENT_TYPE";
        private String dataCode;
        private String dataText;

        private MsgRecipientTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgRecipientTypeEnum forCode(String code) {
            MsgRecipientTypeEnum item = null;
            MsgRecipientTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息确认状态方式
     */
    public enum MsgCheckStatTypeEnum implements IDataDictEnum {
        /**
         * 单条
         */
        SINGLE("1", "单条"),
        /**
         * 批量
         */
        BATCH("2", "批量");

        private static final String DATA_DICT_CODE = "MSG_CHECK_STAT_TYPE";
        private String dataCode;
        private String dataText;

        private MsgCheckStatTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgCheckStatTypeEnum forCode(String code) {
            MsgCheckStatTypeEnum item = null;
            MsgCheckStatTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 系统语言区分
     */
    public enum LanguageTypeEnum implements IDataDictEnum {
        /**
         * 汉语
         */
        LANGUAGE_CHINESE("zh", "汉语"),
        /**
         * 英语
         */
        LANGUAGE_ENGLISH("en", "英语"),
        /**
         * 日语
         */
        LANGUAGE_JAPAN("jp", "日语");

        private static final String DATA_DICT_CODE = "LANGUAGE_TYPE";
        private String dataCode;
        private String dataText;

        private LanguageTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static LanguageTypeEnum forCode(String code) {
            LanguageTypeEnum item = null;
            LanguageTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息级别
     */
    public enum MsgClassTypeEnum implements IDataDictEnum {
        /**
         * 普通消息
         */
        NOMAL("1", "普通消息"),
        /**
         * 提示消息
         */
        TIP("2", "提示消息"),
        /**
         * 重要消息
         */
        IMPORTANT("3", "重要消息");

        private static final String DATA_DICT_CODE = "MSG_CLASS_TYPE";
        private String dataCode;
        private String dataText;

        private MsgClassTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgClassTypeEnum forCode(String code) {
            MsgClassTypeEnum item = null;
            MsgClassTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 邮件发送协议
     */
    public enum SendMailProtocolEnum implements IDataDictEnum {
        /**
         * SMTP
         */
        SMTP("SMTP", "SMTP"),
        /**
         * SMTPS
         */
        SMTPS("SMTPS", "SMTPS");

        private static final String DATA_DICT_CODE = "SEND_MAIL_PROTOCOL";
        private String dataCode;
        private String dataText;

        private SendMailProtocolEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SendMailProtocolEnum forCode(String code) {
            SendMailProtocolEnum item = null;
            SendMailProtocolEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息参数类型
     */
    public enum MsgParamTypeEnum implements IDataDictEnum {
        /**
         * 任意类型
         */
        ANY("ANY", "任意类型"),
        /**
         * 文本
         */
        STRING("STRING", "文本"),
        /**
         * 数值
         */
        NUMBER("NUMBER", "数值"),
        /**
         * 日期
         */
        DATE("DATE", "日期"),
        /**
         * 时间
         */
        TIME("TIME", "时间"),
        /**
         * 日期时间
         */
        DATETIME("DATETIME", "日期时间");

        private static final String DATA_DICT_CODE = "MSG_PARAM_TYPE";
        private String dataCode;
        private String dataText;

        private MsgParamTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgParamTypeEnum forCode(String code) {
            MsgParamTypeEnum item = null;
            MsgParamTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息处理状态
     */
    public enum MsgOperateStatEnum implements IDataDictEnum {
        /**
         * 未处理
         */
        UNDISPOSED("1", "未处理"),
        /**
         * 处理中
         */
        IN_PROGRESS("2", "处理中"),
        /**
         * 已处理
         */
        DISPOSED("3", "已处理");

        private static final String DATA_DICT_CODE = "MSG_OPERATE_STAT";
        private String dataCode;
        private String dataText;

        private MsgOperateStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MsgOperateStatEnum forCode(String code) {
            MsgOperateStatEnum item = null;
            MsgOperateStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 画面操作区分
     */
    public enum DataTableHandleTypeEnum implements IDataDictEnum {
        /**
         * 新增
         */
        ADDITION("ADD", "新增"),
        /**
         * 更新
         */
        UPDATE("UPDATE", "更新"),
        /**
         * 删除
         */
        DELETE("DEL", "删除"),
        /**
         * 查询
         */
        SEARCH("SEARCH", "查询");

        private static final String DATA_DICT_CODE = "DATA_TABLE_HANDLE_TYPE";
        private String dataCode;
        private String dataText;

        private DataTableHandleTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataTableHandleTypeEnum forCode(String code) {
            DataTableHandleTypeEnum item = null;
            DataTableHandleTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 邮件格式区分
     */
    public enum MailFormatTypeEnum implements IDataDictEnum {
        /**
         * 纯文本
         */
        TEXT("TEXT", "纯文本"),
        /**
         * HTML
         */
        HTML("HTML", "HTML");

        private static final String DATA_DICT_CODE = "MAIL_FORMAT_TYPE";
        private String dataCode;
        private String dataText;

        private MailFormatTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MailFormatTypeEnum forCode(String code) {
            MailFormatTypeEnum item = null;
            MailFormatTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 自定义表是否分页区分
     */
    public enum DataTablePagingTypeEnum implements IDataDictEnum {
        /**
         * 分页
         */
        PAGE_USE("PAGE_USE", "分页"),
        /**
         * 不分页
         */
        PAGE_UMUSE("PAGE_UMUSE", "不分页");

        private static final String DATA_DICT_CODE = "DATA_TABLE_PAGING_TYPE";
        private String dataCode;
        private String dataText;

        private DataTablePagingTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataTablePagingTypeEnum forCode(String code) {
            DataTablePagingTypeEnum item = null;
            DataTablePagingTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 自动序号区分
     */
    public enum AutoNumTypeEnum implements IDataDictEnum {
        /**
         * 消息任务号
         */
        MSG_TASK_NO("MSG_TASK_NO", "消息任务号"),

        /**
         * 期货价格调整单号
         */
        FUTURES_ADJUST_NO("FUTURES_ADJUST_NO", "期货价格调整单号"),

        /**
         * 现货价格调整单号
         */
        SPOT_ADJUST_NO("SPOT_ADJUST_NO", "现货价格调整单号"),

        /**
         * 入库单号
         */
        STORE_IN_BILL_NO("STORE_IN_BILL_NO", "入库单号"),

        /**
         * 出库单号
         */
        STORE_OUT_BILL_NO("STORE_OUT_BILL_NO", "出库单号"),

        /**
         * 期权数据导入记录
         */
        OPTION_RECORD_IMPORT("OPTION_RECORD_IMPORT", "期权数据导入记录"),
        /**
         * 期货数据导入记录
         */
        DVT_IMP_FUTURE_NO("DVT_IMP_FUTURE_NO", "期货数据导入记录"),
        /**
         * 期权数据导入记录
         */
        DVT_IMP_OPTION_NO("DVT_IMP_OPTION_NO", "期权数据导入记录");

        private static final String DATA_DICT_CODE = "AUTO_NUM_TYPE";
        private String dataCode;
        private String dataText;

        private AutoNumTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AutoNumTypeEnum forCode(String code) {
            AutoNumTypeEnum item = null;
            AutoNumTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 交易所类别
     */
    public enum DataExchangeTypeEnum implements IDataDictEnum {
        /**
         * 外盘
         */
        OUT_EXCHANGE("1", "外盘"),
        /**
         * 电子盘
         */
        ELECTRIC_EXCHANGE("2", "电子盘"),
        /**
         * 内盘
         */
        IN_EXCHANGE("3", "内盘");

        private static final String DATA_DICT_CODE = "DATA_EXCHANGE_TYPE";
        private String dataCode;
        private String dataText;

        private DataExchangeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataExchangeTypeEnum forCode(String code) {
            DataExchangeTypeEnum item = null;
            DataExchangeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否过期区分
     */
    public enum DataDueFlagEnum implements IDataDictEnum {
        /**
         * 未过期
         */
        NO_OVERDUE("0", "未过期"),
        /**
         * 已过期
         */
        EXPIRED("1", "已过期");

        private static final String DATA_DICT_CODE = "DATA_DUE_FLAG";
        private String dataCode;
        private String dataText;

        private DataDueFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataDueFlagEnum forCode(String code) {
            DataDueFlagEnum item = null;
            DataDueFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否含税区分
     */
    public enum DataContainTaxEnum implements IDataDictEnum {
        /**
         * 不含税
         */
        NO_TAX("0", "不含税"),
        /**
         * 含税
         */
        TAX("1", "含税");

        private static final String DATA_DICT_CODE = "DATA_CONTAIN_TAX";
        private String dataCode;
        private String dataText;

        private DataContainTaxEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataContainTaxEnum forCode(String code) {
            DataContainTaxEnum item = null;
            DataContainTaxEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否外国区分
     */
    public enum DataForeignFlagEnum implements IDataDictEnum {
        /**
         * 否
         */
        THEIR_OWN("0", "否"),
        /**
         * 是
         */
        FOREIGN("1", "是");

        private static final String DATA_DICT_CODE = "DATA_FOREIGN_FLAG";
        private String dataCode;
        private String dataText;

        private DataForeignFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataForeignFlagEnum forCode(String code) {
            DataForeignFlagEnum item = null;
            DataForeignFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 分也不分页区分
     */
    public enum DataPagingFlagEnum implements IDataDictEnum {
        /**
         * 分页
         */
        PAGE_USE("PAGE_USE", "分页"),
        /**
         * 不分页
         */
        PAGE_UMUSE("PAGE_UMUSE", "不分页");

        private static final String DATA_DICT_CODE = "DATA_PAGING_FLAG";
        private String dataCode;
        private String dataText;

        private DataPagingFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataPagingFlagEnum forCode(String code) {
            DataPagingFlagEnum item = null;
            DataPagingFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 显示不显示区分
     */
    public enum DataShowFlagEnum implements IDataDictEnum {
        /**
         * 不显示
         */
        UNSHOW("0", "不显示"),
        /**
         * 显示
         */
        SHOW("1", "显示");

        private static final String DATA_DICT_CODE = "DATA_SHOW_FLAG";
        private String dataCode;
        private String dataText;

        private DataShowFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataShowFlagEnum forCode(String code) {
            DataShowFlagEnum item = null;
            DataShowFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 唯一性验证区分
     */
    public enum DataMajorkeyFlagEnum implements IDataDictEnum {
        /**
         * 唯一验证
         */
        ONLY("1", "唯一验证"),
        /**
         * 不验证
         */
        MORE("0", "不验证");

        private static final String DATA_DICT_CODE = "DATA_MAJORKEY_FLAG";
        private String dataCode;
        private String dataText;

        private DataMajorkeyFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataMajorkeyFlagEnum forCode(String code) {
            DataMajorkeyFlagEnum item = null;
            DataMajorkeyFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否为空区分
     */
    public enum DataNullFlagEnum implements IDataDictEnum {
        /**
         * 可为空
         */
        NULL("Y", "可为空"),
        /**
         * 不为空
         */
        NOT_NULL("N", "不为空");

        private static final String DATA_DICT_CODE = "DATA_NULL_FLAG";
        private String dataCode;
        private String dataText;

        private DataNullFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataNullFlagEnum forCode(String code) {
            DataNullFlagEnum item = null;
            DataNullFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 画面风格
     */
    public enum DataTablestyleFlagEnum implements IDataDictEnum {
        /**
         * 风格1
         */
        STYLE1("1", "风格1"),
        /**
         * 风格2
         */
        STYLE2("0", "风格2");

        private static final String DATA_DICT_CODE = "DATA_TABLESTYLE_FLAG";
        private String dataCode;
        private String dataText;

        private DataTablestyleFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataTablestyleFlagEnum forCode(String code) {
            DataTablestyleFlagEnum item = null;
            DataTablestyleFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否显示复选框
     */
    public enum DataCheckboxtypeFlagEnum implements IDataDictEnum {
        /**
         * 显示复选框
         */
        HAVE_CHECKBOX("1", "显示复选框"),
        /**
         * 不显示复选框
         */
        NO_CHECKBOX("0", "不显示复选框");

        private static final String DATA_DICT_CODE = "DATA_CHECKBOXTYPE_FLAG";
        private String dataCode;
        private String dataText;

        private DataCheckboxtypeFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataCheckboxtypeFlagEnum forCode(String code) {
            DataCheckboxtypeFlagEnum item = null;
            DataCheckboxtypeFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 画面显示
     */
    public enum DataTableshowtypeFlagEnum implements IDataDictEnum {
        /**
         * 表单显示
         */
        FORM("1", "表单显示"),
        /**
         * 列表显示
         */
        TABLE("0", "列表显示");

        private static final String DATA_DICT_CODE = "DATA_TABLESHOWTYPE_FLAG";
        private String dataCode;
        private String dataText;

        private DataTableshowtypeFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataTableshowtypeFlagEnum forCode(String code) {
            DataTableshowtypeFlagEnum item = null;
            DataTableshowtypeFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 画面定义
     */
    public enum DataManueflagFlagEnum implements IDataDictEnum {
        /**
         * 标准页面
         */
        NORM("1", "标准页面"),
        /**
         * 自定义画面
         */
        USERHAVE("0", "自定义画面");

        private static final String DATA_DICT_CODE = "DATA_MANUEFLAG_FLAG";
        private String dataCode;
        private String dataText;

        private DataManueflagFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataManueflagFlagEnum forCode(String code) {
            DataManueflagFlagEnum item = null;
            DataManueflagFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 画面属性
     */
    public enum DataControltypeFlagEnum implements IDataDictEnum {
        /**
         * 输入框
         */
        TEXT("text", "输入框"),
        /**
         * 下拉框
         */
        SELECT("select", "下拉框"),
        /**
         * 日期
         */
        DATE("date", "日期"),
        /**
         * 日期时间
         */
        DATETIME("datetime", "日期时间"),
        /**
         * 月份
         */
        MONTH("month", "月份"),
        /**
         * 单选框
         */
        RADIO("radio", "单选框"),
        /**
         * 文本域
         */
        TEXTAREA("textarea", "文本域");

        private static final String DATA_DICT_CODE = "DATA_CONTROLTYPE_FLAG";
        private String dataCode;
        private String dataText;

        private DataControltypeFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataControltypeFlagEnum forCode(String code) {
            DataControltypeFlagEnum item = null;
            DataControltypeFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 是否查询条件
     */
    public enum DataSearchflagFlagEnum implements IDataDictEnum {
        /**
         * 是查询条件
         */
        SEARCH("1", "是查询条件"),
        /**
         * 非查询条件
         */
        NOSEARCH("0", "非查询条件");

        private static final String DATA_DICT_CODE = "DATA_SEARCHFLAG_FLAG";
        private String dataCode;
        private String dataText;

        private DataSearchflagFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataSearchflagFlagEnum forCode(String code) {
            DataSearchflagFlagEnum item = null;
            DataSearchflagFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 查询方式
     */
    public enum DataSearchtypeTypeEnum implements IDataDictEnum {
        /**
         * 等于
         */
        EQUALS("=", "等于"),
        /**
         * 不等于
         */
        NOTEQUALS("<>", "不等于"),
        /**
         * 大于
         */
        GREATER(">", "大于"),
        /**
         * 小于
         */
        LESS("<", "小于"),
        /**
         * 大于等于
         */
        GREATER_EQUALS(">=", "大于等于"),
        /**
         * 小于等于
         */
        LESS_EQUALS("<=", "小于等于"),
        /**
         * 后模糊查询
         */
        AFTER_LIKE("like1", "后模糊查询"),
        /**
         * 前模糊查询
         */
        BEFOR_LIKE("like2", "前模糊查询"),
        /**
         * 全模糊查询
         */
        ALL_LIKE("like3", "全模糊查询"),
        /**
         * 区间
         */
        BETWEEN("between", "区间");

        private static final String DATA_DICT_CODE = "DATA_SEARCHTYPE_TYPE";
        private String dataCode;
        private String dataText;

        private DataSearchtypeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataSearchtypeTypeEnum forCode(String code) {
            DataSearchtypeTypeEnum item = null;
            DataSearchtypeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 启用标识
     */
    public enum UsingFlagEnum implements IDataDictEnum {
        /**
         * 启用
         */
        USE("1", "启用"),
        /**
         * 停用
         */
        UNUSE("0", "停用");

        private static final String DATA_DICT_CODE = "USING_FLAG";
        private String dataCode;
        private String dataText;

        private UsingFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static UsingFlagEnum forCode(String code) {
            UsingFlagEnum item = null;
            UsingFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 仓库类型
     */
    public enum WarehouseTypeEnum implements IDataDictEnum {
        /**
         * 普通库
         */
        GENERAL_LIBRARY("1", "普通库"),
        /**
         * 交割库
         */
        DELIVERY_LIBRARY("2", "交割库"),
        /**
         * 保税库
         */
        BONDED_LIBRARY("3", "保税库");

        private static final String DATA_DICT_CODE = "WAREHOUSE_TYPE";
        private String dataCode;
        private String dataText;

        private WarehouseTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static WarehouseTypeEnum forCode(String code) {
            WarehouseTypeEnum item = null;
            WarehouseTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 级别
     */
    public enum WarehouseLevelEnum implements IDataDictEnum {
        /**
         * 一星
         */
        STAR1("1", "一星"),
        /**
         * 二星
         */
        STAR2("2", "二星"),
        /**
         * 三星
         */
        STAR3("3", "三星"),
        /**
         * 四星
         */
        STAR4("4", "四星"),
        /**
         * 五星
         */
        STAR5("5", "五星");

        private static final String DATA_DICT_CODE = "WAREHOUSE_LEVEL";
        private String dataCode;
        private String dataText;

        private WarehouseLevelEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static WarehouseLevelEnum forCode(String code) {
            WarehouseLevelEnum item = null;
            WarehouseLevelEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 币种
     */
    public enum CurrencyEnum implements IDataDictEnum {
        /**
         * 人民币
         */
        CNY("1", "人民币"),
        /**
         * 美元
         */
        USD("2", "美元");

        private static final String DATA_DICT_CODE = "CURRENCY";
        private String dataCode;
        private String dataText;

        private CurrencyEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CurrencyEnum forCode(String code) {
            CurrencyEnum item = null;
            CurrencyEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 包装单位
     */
    public enum MeasurementUnitEnum implements IDataDictEnum {
        /**
         * 吨
         */
        T("1", "吨"),
        /**
         * 千克
         */
        KG("2", "千克"),
        /**
         * 克
         */
        G("3", "克"),
        /**
         * 盎司
         */
        OZ("4", "盎司"),
        /**
         * 件
         */
        PIECE("5", "件"),
        /**
         * 捆
         */
        BALE("6", "捆"),
        /**
         * 箱
         */
        BOX("7", "箱"),
        /**
         * 袋
         */
        BAG("8", "袋");

        private static final String DATA_DICT_CODE = "MEASUREMENT_UNIT";
        private String dataCode;
        private String dataText;

        private MeasurementUnitEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MeasurementUnitEnum forCode(String code) {
            MeasurementUnitEnum item = null;
            MeasurementUnitEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 单位（溢短装）
     */
    public enum UnitMoreLessEnum implements IDataDictEnum {
        /**
         * 百分比
         */
        PERCENT("1", "百分比"),
        /**
         * 合同数量单位
         */
        CONTRACT_UNIT("2", "合同数量单位");

        private static final String DATA_DICT_CODE = "UNIT_MORE_LESS";
        private String dataCode;
        private String dataText;

        private UnitMoreLessEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static UnitMoreLessEnum forCode(String code) {
            UnitMoreLessEnum item = null;
            UnitMoreLessEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 作价方类型
     */
    public enum PricePartyEnum implements IDataDictEnum {
        /**
         * 我方
         */
        SELF("1", "我方"),
        /**
         * 对方
         */
        OPPOSITE("2", "对方"),
        /**
         * 双方
         */
        BOTH("3", "双方");

        private static final String DATA_DICT_CODE = "PRICE_PARTY";
        private String dataCode;
        private String dataText;

        private PricePartyEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PricePartyEnum forCode(String code) {
            PricePartyEnum item = null;
            PricePartyEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 发票约定
     */
    public enum InvoiceAgreementEnum implements IDataDictEnum {
        /**
         * 专票
         */
        SPECIAL_TICKET("1", "专票"),
        /**
         * 普票
         */
        UNIVERSAL_TICKET("2", "普票");

        private static final String DATA_DICT_CODE = "INVOICE_AGREEMENT";
        private String dataCode;
        private String dataText;

        private InvoiceAgreementEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static InvoiceAgreementEnum forCode(String code) {
            InvoiceAgreementEnum item = null;
            InvoiceAgreementEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 合同类型
     */
    public enum ContractTypeEnum implements IDataDictEnum {
        /**
         * 临单
         */
        TEMPORARY_CONTRACT("1", "临单"),
        /**
         * 长单
         */
        LONG_CONTRACT("2", "长单");

        private static final String DATA_DICT_CODE = "CONTRACT_TYPE";
        private String dataCode;
        private String dataText;

        private ContractTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ContractTypeEnum forCode(String code) {
            ContractTypeEnum item = null;
            ContractTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 合同状态
     */
    public enum ContractStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        IN_APPROVAL("2", "审批中"),
        /**
         * 同意
         */
        AGREE("3", "同意"),
        /**
         * 否决
         */
        VETO("4", "否决"),
        /**
         * 货齐
         */
        COMPLETE("5", "货齐"),
        /**
         * 变更中
         */
        MODIFY("6", "变更中");

        private static final String DATA_DICT_CODE = "CONTRACT_STAT";
        private String dataCode;
        private String dataText;

        private ContractStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ContractStatEnum forCode(String code) {
            ContractStatEnum item = null;
            ContractStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 协议状态
     */
    public enum ProtocolStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        IN_APPROVAL("2", "审批中"),
        /**
         * 同意
         */
        AGREE("3", "同意"),
        /**
         * 否决
         */
        VETO("4", "否决"),
        /**
         * 关闭
         */
        CLOSE("5", "关闭"),
        /**
         * 变更中
         */
        MODIFY("6", "变更中");

        private static final String DATA_DICT_CODE = "PROTOCOL_STAT";
        private String dataCode;
        private String dataText;

        private ProtocolStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ProtocolStatEnum forCode(String code) {
            ProtocolStatEnum item = null;
            ProtocolStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 批次状态
     */
    public enum BatchStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        IN_APPROVAL("2", "审批中"),
        /**
         * 同意
         */
        AGREE("3", "同意"),
        /**
         * 否决
         */
        VETO("4", "否决"),
        /**
         * 关闭
         */
        CLOSE("5", "关闭");

        private static final String DATA_DICT_CODE = "BATCH_STAT";
        private String dataCode;
        private String dataText;

        private BatchStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static BatchStatEnum forCode(String code) {
            BatchStatEnum item = null;
            BatchStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 变更状态
     */
    public enum ChangeStatEnum implements IDataDictEnum {
        /**
         * 未变更
         */
        NOT_CHANGED("0", "未变更"),
        /**
         * 变更中
         */
        CHANGE("1", "变更中");

        private static final String DATA_DICT_CODE = "CHANGE_STAT";
        private String dataCode;
        private String dataText;

        private ChangeStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ChangeStatEnum forCode(String code) {
            ChangeStatEnum item = null;
            ChangeStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 符号（左）
     */
    public enum LeftSignEnum implements IDataDictEnum {
        /**
         * 大于
         */
        GREATER_THAN("1", "大于"),
        /**
         * 大于等于
         */
        GREATER_THAN_EQUAL("2", "大于等于");

        private static final String DATA_DICT_CODE = "LEFT_SIGN";
        private String dataCode;
        private String dataText;

        private LeftSignEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static LeftSignEnum forCode(String code) {
            LeftSignEnum item = null;
            LeftSignEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 符号（右）
     */
    public enum RightSignEnum implements IDataDictEnum {
        /**
         * 小于
         */
        LESS_THAN("1", "小于"),
        /**
         * 小于等于
         */
        LESS_THAN_EQUAL("2", "小于等于");

        private static final String DATA_DICT_CODE = "RIGHT_SIGN";
        private String dataCode;
        private String dataText;

        private RightSignEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static RightSignEnum forCode(String code) {
            RightSignEnum item = null;
            RightSignEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 结算依据
     */
    public enum SettlementBasisEnum implements IDataDictEnum {
        /**
         * 实际称重
         */
        ACTUAL_WEIGHING("1", "实际称重"),
        /**
         * 仓单
         */
        WAREHOUSE_RECEIPT("2", "仓单");

        private static final String DATA_DICT_CODE = "SETTLEMENT_BASIS";
        private String dataCode;
        private String dataText;

        private SettlementBasisEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SettlementBasisEnum forCode(String code) {
            SettlementBasisEnum item = null;
            SettlementBasisEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 结算方式
     */
    public enum SettlementMethodEnum implements IDataDictEnum {
        /**
         * 款到发货
         */
        DELIVERY_TO_DELIVERY("1", "款到发货"),
        /**
         * 可预赊销
         */
        CAN_BE_SOLD_ON_CREDIT("2", "可预赊销");

        private static final String DATA_DICT_CODE = "SETTLEMENT_METHOD";
        private String dataCode;
        private String dataText;

        private SettlementMethodEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SettlementMethodEnum forCode(String code) {
            SettlementMethodEnum item = null;
            SettlementMethodEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 购销类型
     */
    public enum PurchaseSaleTypeEnum implements IDataDictEnum {
        /**
         * 采购
         */
        PURCHASE("1", "采购"),
        /**
         * 销售
         */
        SALE("2", "销售");

        private static final String DATA_DICT_CODE = "PURCHASE_SALE_TYPE";
        private String dataCode;
        private String dataText;

        private PurchaseSaleTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PurchaseSaleTypeEnum forCode(String code) {
            PurchaseSaleTypeEnum item = null;
            PurchaseSaleTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 贸易类型
     */
    public enum TradeTypeEnum implements IDataDictEnum {
        /**
         * 内贸
         */
        INTERNAL_TRADE("1", "内贸"),
        /**
         * 外贸
         */
        FOREIGN_TRADE("2", "外贸"),
        /**
         * 转口
         */
        TRANSIT("3", "转口");

        private static final String DATA_DICT_CODE = "TRADE_TYPE";
        private String dataCode;
        private String dataText;

        private TradeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TradeTypeEnum forCode(String code) {
            TradeTypeEnum item = null;
            TradeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 费用发票
     */
    public enum CostInvoiceEnum implements IDataDictEnum {
        /**
         * 单开
         */
        SINGLE_OPENING("1", "单开"),
        /**
         * 不单开
         */
        NOT_ONLY_OPEN("2", "不单开");

        private static final String DATA_DICT_CODE = "COST_INVOICE";
        private String dataCode;
        private String dataText;

        private CostInvoiceEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CostInvoiceEnum forCode(String code) {
            CostInvoiceEnum item = null;
            CostInvoiceEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 运输方式
     */
    public enum TransportTypeEnum implements IDataDictEnum {
        /**
         * 汽运
         */
        STEAM_TRANSPORTATION("1", "汽运"),
        /**
         * 水运
         */
        WATER_TRANSPORT("2", "水运");

        private static final String DATA_DICT_CODE = "TRANSPORT_TYPE";
        private String dataCode;
        private String dataText;

        private TransportTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TransportTypeEnum forCode(String code) {
            TransportTypeEnum item = null;
            TransportTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 锚定日类型
     */
    public enum AnchorDateTypeEnum implements IDataDictEnum {
        /**
         * 入库日期
         */
        DATE_OF_STORAGE("1", "入库日期"),
        /**
         * 到港日期
         */
        DATE_OF_ARRIVAL("2", "到港日期");

        private static final String DATA_DICT_CODE = "ANCHOR_DATE_TYPE";
        private String dataCode;
        private String dataText;

        private AnchorDateTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AnchorDateTypeEnum forCode(String code) {
            AnchorDateTypeEnum item = null;
            AnchorDateTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 我方比例/数量单位
     */
    public enum OurUnitEnum implements IDataDictEnum {
        /**
         * 百分比
         */
        PERCENTAGE("1", "百分比"),
        /**
         * 合同数量单位
         */
        CONTRACT_QUANTITY_UNIT("2", "合同数量单位");

        private static final String DATA_DICT_CODE = "OUR_UNIT";
        private String dataCode;
        private String dataText;

        private OurUnitEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static OurUnitEnum forCode(String code) {
            OurUnitEnum item = null;
            OurUnitEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 定价方式
     */
    public enum PricingModeEnum implements IDataDictEnum {
        /**
         * 点价
         */
        POINT_PRICE("1", "点价"),
        /**
         * 固定价
         */
        FIXED_PRICE("2", "固定价"),
        /**
         * 均价
         */
        AVERAGE_PRICE("3", "均价"),
        /**
         * 点价、均价
         */
        POINT_AVERAGE_PRICE("4", "点价、均价");

        private static final String DATA_DICT_CODE = "PRICING_MODE";
        private String dataCode;
        private String dataText;

        private PricingModeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PricingModeEnum forCode(String code) {
            PricingModeEnum item = null;
            PricingModeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 定价单状态
     */
    public enum PricingStatusEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        IN_APPROVAL("2", "审批中"),
        /**
         * 同意
         */
        AGREE("3", "同意"),
        /**
         * 否决
         */
        VETO("4", "否决"),
        /**
         * 关闭
         */
        CLOSE("5", "关闭");

        private static final String DATA_DICT_CODE = "PRICING_STATUS";
        private String dataCode;
        private String dataText;

        private PricingStatusEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PricingStatusEnum forCode(String code) {
            PricingStatusEnum item = null;
            PricingStatusEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 套保收益方
     */
    public enum HedgingBeneficiaryEnum implements IDataDictEnum {
        /**
         * 对方
         */
        OPPOSITE("1", "对方"),
        /**
         * 我方
         */
        SELF("2", "我方");

        private static final String DATA_DICT_CODE = "HEDGING_BENEFICIARY";
        private String dataCode;
        private String dataText;

        private HedgingBeneficiaryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static HedgingBeneficiaryEnum forCode(String code) {
            HedgingBeneficiaryEnum item = null;
            HedgingBeneficiaryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价选项
     */
    public enum AveragePriceOptionEnum implements IDataDictEnum {
        /**
         * M-3
         */
        M_REDUCE_3("1", "M-3"),
        /**
         * M-2
         */
        M_REDUCE_2("2", "M-2"),
        /**
         * M-1
         */
        M_REDUCE_1("3", "M-1"),
        /**
         * M+0
         */
        M_ADD_0("4", "M+0"),
        /**
         * M+1
         */
        M_ADD_1("5", "M+1"),
        /**
         * M+2
         */
        M_ADD_2("6", "M+2"),
        /**
         * M+3
         */
        M_ADD_3("7", "M+3");

        private static final String DATA_DICT_CODE = "AVERAGE_PRICE_OPTION";
        private String dataCode;
        private String dataText;

        private AveragePriceOptionEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AveragePriceOptionEnum forCode(String code) {
            AveragePriceOptionEnum item = null;
            AveragePriceOptionEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价自锚定日始类型
     */
    public enum AnchorStartTypeEnum implements IDataDictEnum {
        /**
         * 前
         */
        FRONT("1", "前"),
        /**
         * 后
         */
        AFTER("2", "后");

        private static final String DATA_DICT_CODE = "ANCHOR_START_TYPE";
        private String dataCode;
        private String dataText;

        private AnchorStartTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AnchorStartTypeEnum forCode(String code) {
            AnchorStartTypeEnum item = null;
            AnchorStartTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价自锚定日止类型
     */
    public enum AnchorEndTypeEnum implements IDataDictEnum {
        /**
         * 后
         */
        AFTER("1", "后"),
        /**
         * 前
         */
        FRONT("2", "前");

        private static final String DATA_DICT_CODE = "ANCHOR_END_TYPE";
        private String dataCode;
        private String dataText;

        private AnchorEndTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AnchorEndTypeEnum forCode(String code) {
            AnchorEndTypeEnum item = null;
            AnchorEndTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价类型
     */
    public enum AveragePriceTypeEnum implements IDataDictEnum {
        /**
         * M
         */
        MONTH("1", "M"),
        /**
         * D
         */
        DAY("2", "D"),
        /**
         * 自定义
         */
        CUSTOM("3", "自定义");

        private static final String DATA_DICT_CODE = "AVERAGE_PRICE_TYPE";
        private String dataCode;
        private String dataText;

        private AveragePriceTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AveragePriceTypeEnum forCode(String code) {
            AveragePriceTypeEnum item = null;
            AveragePriceTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价月周期自月始类型
     */
    public enum AveragePriceMonthSTypeEnum implements IDataDictEnum {
        /**
         * 上月
         */
        PREV_MONTH("1", "上月"),
        /**
         * 本月
         */
        NEXT_MONTH("2", "本月");

        private static final String DATA_DICT_CODE = "AVERAGE_PRICE_MONTH_S_TYPE";
        private String dataCode;
        private String dataText;

        private AveragePriceMonthSTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AveragePriceMonthSTypeEnum forCode(String code) {
            AveragePriceMonthSTypeEnum item = null;
            AveragePriceMonthSTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 均价月周期自月止类型（
     */
    public enum AveragePriceMonthETypeEnum implements IDataDictEnum {
        /**
         * 本月
         */
        PREV_MONTH("1", "本月"),
        /**
         * 下月
         */
        NEXT_MONTH("2", "下月");

        private static final String DATA_DICT_CODE = "AVERAGE_PRICE_MONTH_E_TYPE";
        private String dataCode;
        private String dataText;

        private AveragePriceMonthETypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AveragePriceMonthETypeEnum forCode(String code) {
            AveragePriceMonthETypeEnum item = null;
            AveragePriceMonthETypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 定价期类型
     */
    public enum BenchmarkTypeEnum implements IDataDictEnum {
        /**
         * 按月周期
         */
        MONTHLY("1", "按月周期"),
        /**
         * 自定义
         */
        CUSTOM("2", "自定义");

        private static final String DATA_DICT_CODE = "BENCHMARK_TYPE";
        private String dataCode;
        private String dataText;

        private BenchmarkTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static BenchmarkTypeEnum forCode(String code) {
            BenchmarkTypeEnum item = null;
            BenchmarkTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 入库单据类型
     */
    public enum StockInDocTypeEnum implements IDataDictEnum {
        /**
         * 提单
         */
        LADING("1", "提单"),
        /**
         * 仓单
         */
        WAREHOUSE("2", "仓单");

        private static final String DATA_DICT_CODE = "STOCK_IN_DOC_TYPE";
        private String dataCode;
        private String dataText;

        private StockInDocTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StockInDocTypeEnum forCode(String code) {
            StockInDocTypeEnum item = null;
            StockInDocTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 出库单据类型
     */
    public enum StockOutDocTypeEnum implements IDataDictEnum {
        /**
         * 提单
         */
        LADING("1", "提单"),
        /**
         * 仓单
         */
        WAREHOUSE("2", "仓单");

        private static final String DATA_DICT_CODE = "STOCK_OUT_DOC_TYPE";
        private String dataCode;
        private String dataText;

        private StockOutDocTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StockOutDocTypeEnum forCode(String code) {
            StockOutDocTypeEnum item = null;
            StockOutDocTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 入库类型
     */
    public enum StockInTypeEnum implements IDataDictEnum {
        /**
         * 期初入库
         */
        INITIAL("1", "期初入库"),
        /**
         * 采购入库
         */
        PURCHASE("2", "采购入库"),
        /**
         * 盘盈入库
         */
        SURPLUS("3", "盘盈入库");

        private static final String DATA_DICT_CODE = "STOCK_IN_TYPE";
        private String dataCode;
        private String dataText;

        private StockInTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StockInTypeEnum forCode(String code) {
            StockInTypeEnum item = null;
            StockInTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 出库类型
     */
    public enum StockOutTypeEnum implements IDataDictEnum {
        /**
         * 期初出库
         */
        INITIAL("1", "期初出库"),
        /**
         * 销售出库
         */
        SALE("2", "销售出库"),
        /**
         * 盘亏出库
         */
        LOSSES("3", "盘亏出库");

        private static final String DATA_DICT_CODE = "STOCK_OUT_TYPE";
        private String dataCode;
        private String dataText;

        private StockOutTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StockOutTypeEnum forCode(String code) {
            StockOutTypeEnum item = null;
            StockOutTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 盘点处理状态
     */
    public enum InvProcessStatEnum implements IDataDictEnum {
        /**
         * 未生成
         */
        NO("0", "未生成"),
        /**
         * 已生成
         */
        YES("1", "已生成"),
        /**
         * 关闭
         */
        CLOSE("2", "关闭");

        private static final String DATA_DICT_CODE = "INV_PROCESS_STAT";
        private String dataCode;
        private String dataText;

        private InvProcessStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static InvProcessStatEnum forCode(String code) {
            InvProcessStatEnum item = null;
            InvProcessStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 单据状态
     */
    public enum DocumentStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        APPROVING("2", "审批中"),
        /**
         * 审批通过
         */
        APPROVED("3", "审批通过"),
        /**
         * 拒绝
         */
        REJECT("4", "拒绝");

        private static final String DATA_DICT_CODE = "DOCUMENT_STAT";
        private String dataCode;
        private String dataText;

        private DocumentStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DocumentStatEnum forCode(String code) {
            DocumentStatEnum item = null;
            DocumentStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 货权状态
     */
    public enum OwnershipStatEnum implements IDataDictEnum {
        /**  */
        BLANK("0", ""),
        /**
         * 已转
         */
        TRANSFERRED("1", "已转");

        private static final String DATA_DICT_CODE = "OWNERSHIP_STAT";
        private String dataCode;
        private String dataText;

        private OwnershipStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static OwnershipStatEnum forCode(String code) {
            OwnershipStatEnum item = null;
            OwnershipStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 提货方式
     */
    public enum DeliveryTypeEnum implements IDataDictEnum {
        /**
         * 自提
         */
        SELF_LIFTING("1", "自提"),
        /**
         * 送货
         */
        DELIVERY("2", "送货");

        private static final String DATA_DICT_CODE = "DELIVERY_TYPE";
        private String dataCode;
        private String dataText;

        private DeliveryTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DeliveryTypeEnum forCode(String code) {
            DeliveryTypeEnum item = null;
            DeliveryTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 款项类型
     */
    public enum FundTypeEnum implements IDataDictEnum {
        /**
         * 预付款
         */
        ADVANCE("1", "预付款"),
        /**
         * 结算款
         */
        SETTLEMENT("2", "结算款");

        private static final String DATA_DICT_CODE = "FUND_TYPE";
        private String dataCode;
        private String dataText;

        private FundTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FundTypeEnum forCode(String code) {
            FundTypeEnum item = null;
            FundTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 计量单位组类型
     */
    public enum UnitGroupTypeEnum implements IDataDictEnum {
        /**
         * 固定换算率
         */
        FIX_RATE("1", "固定换算率"),
        /**
         * 浮动换算率
         */
        FLOAT_RATE("2", "浮动换算率");

        private static final String DATA_DICT_CODE = "UNIT_GROUP_TYPE";
        private String dataCode;
        private String dataText;

        private UnitGroupTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static UnitGroupTypeEnum forCode(String code) {
            UnitGroupTypeEnum item = null;
            UnitGroupTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 运算符
     */
    public enum OperatorEnum implements IDataDictEnum {
        /**
         * ×
         */
        MULTIPLIED("1", "×"),
        /**
         * ÷
         */
        DIVIDED("2", "÷");

        private static final String DATA_DICT_CODE = "OPERATOR";
        private String dataCode;
        private String dataText;

        private OperatorEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static OperatorEnum forCode(String code) {
            OperatorEnum item = null;
            OperatorEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 属性
     */
    public enum AttrEnum implements IDataDictEnum {
        /**
         * 市场
         */
        MARKET("1", "市场"),
        /**
         * 地区
         */
        REGION("2", "地区"),
        /**
         * 产地
         */
        PLACE_ORGIN("3", "产地"),
        /**
         * 钢厂
         */
        STEEL_MILL("4", "钢厂"),
        /**
         * 品牌
         */
        BRAND("5", "品牌"),
        /**
         * 品质
         */
        QUALITY("6", "品质"),
        /**
         * 品味
         */
        TASTE("7", "品味"),
        /**
         * 品级
         */
        GRADE("8", "品级"),
        /**
         * 材质
         */
        MATERIAL_QUALITY("9", "材质"),
        /**
         * 规格
         */
        STANDARD("10", "规格"),
        /**
         * 牌号
         */
        BRAND_NUM("11", "牌号"),
        /**
         * 马克隆值
         */
        MICRONAIRE("12", "马克隆值"),
        /**
         * 发热量
         */
        CALORIFIC_VALUE("13", "发热量"),
        /**
         * 力度
         */
        POTENCY_DIMENSION("14", "力度");

        private static final String DATA_DICT_CODE = "ATTR";
        private String dataCode;
        private String dataText;

        private AttrEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AttrEnum forCode(String code) {
            AttrEnum item = null;
            AttrEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息提醒状态
     */
    public enum MessageRemindingStatEnum implements IDataDictEnum {
        /**
         * 未读
         */
        UNREAD("1", "未读"),
        /**
         * 已读
         */
        READ("2", "已读");

        private static final String DATA_DICT_CODE = "MESSAGE_REMINDING_STAT";
        private String dataCode;
        private String dataText;

        private MessageRemindingStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MessageRemindingStatEnum forCode(String code) {
            MessageRemindingStatEnum item = null;
            MessageRemindingStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 消息提醒类型
     */
    public enum MessageRemindingTypeEnum implements IDataDictEnum {
        /**
         * 提醒
         */
        REMIND("1", "提醒"),
        /**
         * 警告
         */
        WARNING("2", "警告");

        private static final String DATA_DICT_CODE = "MESSAGE_REMINDING_TYPE";
        private String dataCode;
        private String dataText;

        private MessageRemindingTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MessageRemindingTypeEnum forCode(String code) {
            MessageRemindingTypeEnum item = null;
            MessageRemindingTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 发票类别
     */
    public enum InvoiceCategoryEnum implements IDataDictEnum {
        /**
         * 采购
         */
        PURCHASE("1", "采购"),
        /**
         * 销售
         */
        SALES("2", "销售"),
        /**
         * 费用
         */
        COST("3", "费用");

        private static final String DATA_DICT_CODE = "INVOICE_CATEGORY";
        private String dataCode;
        private String dataText;

        private InvoiceCategoryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static InvoiceCategoryEnum forCode(String code) {
            InvoiceCategoryEnum item = null;
            InvoiceCategoryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 发票类型
     */
    public enum InvoiceTypeEnum implements IDataDictEnum {
        /**
         * 专用发票
         */
        INDIVIDUAL("1", "专用发票"),
        /**
         * 普通发票
         */
        NORMAL("2", "普通发票");

        private static final String DATA_DICT_CODE = "INVOICE_TYPE";
        private String dataCode;
        private String dataText;

        private InvoiceTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static InvoiceTypeEnum forCode(String code) {
            InvoiceTypeEnum item = null;
            InvoiceTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 费用类别
     */
    public enum CostCategoryEnum implements IDataDictEnum {
        /**
         * 运杂费
         */
        FREIGHT("1", "运杂费"),
        /**
         * 装卸费
         */
        LOADING("2", "装卸费"),
        /**
         * 仓储费
         */
        WAREHOUSING("3", "仓储费"),
        /**
         * 交割费
         */
        DELIVERY("4", "交割费");

        private static final String DATA_DICT_CODE = "COST_CATEGORY";
        private String dataCode;
        private String dataText;

        private CostCategoryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CostCategoryEnum forCode(String code) {
            CostCategoryEnum item = null;
            CostCategoryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 合同类别
     */
    public enum ContractCategoryEnum implements IDataDictEnum {
        /**
         * 采购合同
         */
        PURCHASE_CONTRACT("1", "采购合同"),
        /**
         * 销售合同
         */
        SALES_CONTRACT("3", "销售合同"),
        /**
         * 物流合同
         */
        LOGISTICS_CONTRACT("5", "物流合同"),
        /**
         * 仓储合同
         */
        WAREHOUSING_CONTRACT("6", "仓储合同");

        private static final String DATA_DICT_CODE = "CONTRACT_CATEGORY";
        private String dataCode;
        private String dataText;

        private ContractCategoryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ContractCategoryEnum forCode(String code) {
            ContractCategoryEnum item = null;
            ContractCategoryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 结算标识
     */
    public enum SettlementSignEnum implements IDataDictEnum {
        /**
         * 完结
         */
        YES("1", "完结"),
        /**
         * 未完结
         */
        NO("0", "未完结");

        private static final String DATA_DICT_CODE = "SETTLEMENT_SIGN";
        private String dataCode;
        private String dataText;

        private SettlementSignEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SettlementSignEnum forCode(String code) {
            SettlementSignEnum item = null;
            SettlementSignEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期初标志
     */
    public enum PreliminaryFlagEnum implements IDataDictEnum {
        /**
         * Y
         */
        Y("1", "Y"),
        /**
         * N
         */
        N("0", "N");

        private static final String DATA_DICT_CODE = "PRELIMINARY_FLAG";
        private String dataCode;
        private String dataText;

        private PreliminaryFlagEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PreliminaryFlagEnum forCode(String code) {
            PreliminaryFlagEnum item = null;
            PreliminaryFlagEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 参数类型
     */
    public enum SysParamTypeEnum implements IDataDictEnum {
        /**
         * 文本
         */
        STRING("1", "文本"),
        /**
         * 数值
         */
        NUMBER("2", "数值"),
        /**
         * 日期
         */
        DATE("3", "日期"),
        /**
         * 布尔值
         */
        BOOLEAN("4", "布尔值");

        private static final String DATA_DICT_CODE = "SYS_PARAM_TYPE";
        private String dataCode;
        private String dataText;

        private SysParamTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SysParamTypeEnum forCode(String code) {
            SysParamTypeEnum item = null;
            SysParamTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 参数属性
     */
    public enum SysParamAttrEnum implements IDataDictEnum {
        /**
         * 系统
         */
        SYSTEM("1", "系统"),
        /**
         * 自定义
         */
        USER_DEFINED("2", "自定义");

        private static final String DATA_DICT_CODE = "SYS_PARAM_ATTR";
        private String dataCode;
        private String dataText;

        private SysParamAttrEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static SysParamAttrEnum forCode(String code) {
            SysParamAttrEnum item = null;
            SysParamAttrEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 交易所类别
     */
    public enum ExchangeTypeEnum implements IDataDictEnum {
        /**
         * 期货内盘
         */
        FUTURES_INSIDER("1", "期货内盘"),
        /**
         * 期货外盘
         */
        OTHER_DISC("2", "期货外盘");

        private static final String DATA_DICT_CODE = "EXCHANGE_TYPE";
        private String dataCode;
        private String dataText;

        private ExchangeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ExchangeTypeEnum forCode(String code) {
            ExchangeTypeEnum item = null;
            ExchangeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 行权方式
     */
    public enum ExerciseWayEnum implements IDataDictEnum {
        /**
         * 欧式
         */
        EUROPEAN("1", "欧式"),
        /**
         * 美式
         */
        AMERICAN("2", "美式");

        private static final String DATA_DICT_CODE = "EXERCISE_WAY";
        private String dataCode;
        private String dataText;

        private ExerciseWayEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ExerciseWayEnum forCode(String code) {
            ExerciseWayEnum item = null;
            ExerciseWayEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 数据属性
     */
    public enum DataAttrEnum implements IDataDictEnum {
        /**
         * 同步
         */
        SYNC("1", "同步"),
        /**
         * 新增
         */
        ADD("2", "新增");

        private static final String DATA_DICT_CODE = "DATA_ATTR";
        private String dataCode;
        private String dataText;

        private DataAttrEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataAttrEnum forCode(String code) {
            DataAttrEnum item = null;
            DataAttrEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品类型
     */
    public enum DerivativeTypeEnum implements IDataDictEnum {
        /**
         * 期货
         */
        FUTURES("1", "期货"),
        /**
         * 期权
         */
        OPTIONS("2", "期权");

        private static final String DATA_DICT_CODE = "DERIVATIVE_TYPE";
        private String dataCode;
        private String dataText;

        private DerivativeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DerivativeTypeEnum forCode(String code) {
            DerivativeTypeEnum item = null;
            DerivativeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品账号类型
     */
    public enum DerivativeAccountTypeEnum implements IDataDictEnum {
        /**
         * 个人账号
         */
        PERSONAL("1", "个人账号"),
        /**
         * 企业账号
         */
        BUSINESS("2", "企业账号");

        private static final String DATA_DICT_CODE = "DERIVATIVE_ACCOUNT_TYPE";
        private String dataCode;
        private String dataText;

        private DerivativeAccountTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DerivativeAccountTypeEnum forCode(String code) {
            DerivativeAccountTypeEnum item = null;
            DerivativeAccountTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 员工类别
     */
    public enum StaffTypeEnum implements IDataDictEnum {
        /**
         * 正式工
         */
        FORMAL_WORK("1", "正式工"),
        /**
         * 合同工
         */
        CONTRACT_WORK("2", "合同工"),
        /**
         * 临时工
         */
        TEMPOARY_WORK("3", "临时工");

        private static final String DATA_DICT_CODE = "STAFF_TYPE";
        private String dataCode;
        private String dataText;

        private StaffTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StaffTypeEnum forCode(String code) {
            StaffTypeEnum item = null;
            StaffTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 性别
     */
    public enum GenderEnum implements IDataDictEnum {
        /**
         * 男
         */
        MAN("1", "男"),
        /**
         * 女
         */
        WOMAN("2", "女");

        private static final String DATA_DICT_CODE = "GENDER";
        private String dataCode;
        private String dataText;

        private GenderEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static GenderEnum forCode(String code) {
            GenderEnum item = null;
            GenderEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 婚姻状态
     */
    public enum MaritalStatEnum implements IDataDictEnum {
        /**
         * 已婚
         */
        MARRIED("1", "已婚"),
        /**
         * 未婚
         */
        UNMARRIED("0", "未婚");

        private static final String DATA_DICT_CODE = "MARITAL_STAT";
        private String dataCode;
        private String dataText;

        private MaritalStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static MaritalStatEnum forCode(String code) {
            MaritalStatEnum item = null;
            MaritalStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 周期类型
     */
    public enum TriggerTypeEnum implements IDataDictEnum {
        /**
         * 每日
         */
        DAILY("1", "每日"),
        /**
         * 时差
         */
        INTERVAL_TIME("2", "时差");

        private static final String DATA_DICT_CODE = "TRIGGER_TYPE";
        private String dataCode;
        private String dataText;

        private TriggerTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TriggerTypeEnum forCode(String code) {
            TriggerTypeEnum item = null;
            TriggerTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 客户类型
     */
    public enum CustomerTypeOptionsEnum implements IDataDictEnum {
        /**
         * 供应商
         */
        SUPPLIER("1", "供应商"),
        /**
         * 销售客户
         */
        SALES_CUSTOMER("2", "销售客户"),
        /**
         * 仓储公司
         */
        WAREHOUSING_COMPANY("3", "仓储公司"),
        /**
         * 物流公司
         */
        LOGISTICS_COMPANY("4", "物流公司"),
        /**
         * 经纪商
         */
        BROKERS("5", "经纪商"),
        /**
         * 投资银行
         */
        INVESTMENT_BANK("6", "投资银行"),
        /**
         * 银行
         */
        BANK("7", "银行");

        private static final String DATA_DICT_CODE = "CUSTOMER_TYPE_OPTIONS";
        private String dataCode;
        private String dataText;

        private CustomerTypeOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CustomerTypeOptionsEnum forCode(String code) {
            CustomerTypeOptionsEnum item = null;
            CustomerTypeOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 企业类型
     */
    public enum EnterpriseTypeOptionsEnum implements IDataDictEnum {
        /**
         * 民营
         */
        PRIVATELY_OPERATED("1", "民营"),
        /**
         * 国有
         */
        STATE_OWNED("2", "国有");

        private static final String DATA_DICT_CODE = "ENTERPRISE_TYPE_OPTIONS";
        private String dataCode;
        private String dataText;

        private EnterpriseTypeOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static EnterpriseTypeOptionsEnum forCode(String code) {
            EnterpriseTypeOptionsEnum item = null;
            EnterpriseTypeOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 客户来源
     */
    public enum CustomerSourceOptionsEnum implements IDataDictEnum {
        /**
         * 市场开发
         */
        MARKET_DEVELOPMENT("1", "市场开发"),
        /**
         * 其他
         */
        OTHER("2", "其他"),
        /**
         * 客户推荐
         */
        CUSTOMER_RECOMMENDATION("3", "客户推荐");

        private static final String DATA_DICT_CODE = "CUSTOMER_SOURCE_OPTIONS";
        private String dataCode;
        private String dataText;

        private CustomerSourceOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CustomerSourceOptionsEnum forCode(String code) {
            CustomerSourceOptionsEnum item = null;
            CustomerSourceOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 数据类型
     */
    public enum DataTypeEnum implements IDataDictEnum {
        /**
         * 数字
         */
        NUM("NUM", "数字"),
        /**
         * 字符串
         */
        STR("STR", "字符串"),
        /**
         * 日期
         */
        DATE("DATE", "日期"),
        /**
         * 枚举
         */
        ENUM("ENUM", "枚举");

        private static final String DATA_DICT_CODE = "DATA_TYPE";
        private String dataCode;
        private String dataText;

        private DataTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataTypeEnum forCode(String code) {
            DataTypeEnum item = null;
            DataTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 客户状态
     */
    public enum CustomerStatEnum implements IDataDictEnum {
        /**
         * 审核通过
         */
        APPROVED("3", "审核通过"),
        /**
         * 审核中
         */
        REVIEW("2", "审核中"),
        /**
         * 待审核
         */
        TO_AUDIT("1", "待审核"),
        /**
         * 审核未通过
         */
        AUDIT_FAILED("4", "审核未通过");

        private static final String DATA_DICT_CODE = "CUSTOMER_STAT";
        private String dataCode;
        private String dataText;

        private CustomerStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CustomerStatEnum forCode(String code) {
            CustomerStatEnum item = null;
            CustomerStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 额度类型
     */
    public enum AmountTypeOptionsEnum implements IDataDictEnum {
        /**
         * 对方授信
         */
        OTHER_CREDIT("1", "对方授信"),
        /**
         * 我方授信
         */
        OUR_CREDIT("2", "我方授信"),
        /**
         * 业务资金
         */
        BUSINESS_CAPITAL("3", "业务资金");

        private static final String DATA_DICT_CODE = "AMOUNT_TYPE_OPTIONS";
        private String dataCode;
        private String dataText;

        private AmountTypeOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AmountTypeOptionsEnum forCode(String code) {
            AmountTypeOptionsEnum item = null;
            AmountTypeOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期货数据来源
     */
    public enum FutureDataSourceTypeEnum implements IDataDictEnum {
        /**
         * CTP
         */
        CTP("C", "CTP"),
        /**
         * 导入
         */
        IMPORT("I", "导入"),
        /**
         * 虚拟
         */
        VIRTUAL("V", "虚拟");

        private static final String DATA_DICT_CODE = "FUTURE_DATA_SOURCE_TYPE";
        private String dataCode;
        private String dataText;

        private FutureDataSourceTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FutureDataSourceTypeEnum forCode(String code) {
            FutureDataSourceTypeEnum item = null;
            FutureDataSourceTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期货买卖方向类型
     */
    public enum FutureDirectionTypeEnum implements IDataDictEnum {
        /**
         * 买
         */
        BUY("0", "买"),
        /**
         * 卖
         */
        SELL("1", "卖");

        private static final String DATA_DICT_CODE = "FUTURE_DIRECTION_TYPE";
        private String dataCode;
        private String dataText;

        private FutureDirectionTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FutureDirectionTypeEnum forCode(String code) {
            FutureDirectionTypeEnum item = null;
            FutureDirectionTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期货持仓多空方向类型
     */
    public enum FuturePosiDirectionTypeEnum implements IDataDictEnum {
        /**
         * 净
         */
        NET("1", "净"),
        /**
         * 多头
         */
        LONG("2", "多头"),
        /**
         * 空头
         */
        SHORT("3", "空头");

        private static final String DATA_DICT_CODE = "FUTURE_POSI_DIRECTION_TYPE";
        private String dataCode;
        private String dataText;

        private FuturePosiDirectionTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FuturePosiDirectionTypeEnum forCode(String code) {
            FuturePosiDirectionTypeEnum item = null;
            FuturePosiDirectionTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期货投机套保标志类型
     */
    public enum FutureHedgeTypeEnum implements IDataDictEnum {
        /**
         * 投机
         */
        SPECULATION("1", "投机"),
        /**
         * 套利
         */
        ARBITRAGE("2", "套利"),
        /**
         * 套保
         */
        HEDGE("3", "套保"),
        /**
         * 做市商
         */
        MARKETMAKER("5", "做市商");

        private static final String DATA_DICT_CODE = "FUTURE_HEDGE_TYPE";
        private String dataCode;
        private String dataText;

        private FutureHedgeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FutureHedgeTypeEnum forCode(String code) {
            FutureHedgeTypeEnum item = null;
            FutureHedgeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期货开平标志类型
     */
    public enum FutureOffsetTypeEnum implements IDataDictEnum {
        /**
         * 开仓
         */
        OPEN("0", "开仓"),
        /**
         * 平仓
         */
        CLOSE("1", "平仓"),
        /**
         * 强平
         */
        FORCE_CLOSE("2", "强平"),
        /**
         * 平今
         */
        CLOSE_TODAY("3", "平今"),
        /**
         * 平昨
         */
        CLOSE_YESTERDAY("4", "平昨"),
        /**
         * 强减
         */
        FORCE_OFF("5", "强减"),
        /**
         * 本地强平
         */
        LOCAL_FORCE_CLOSE("6", "本地强平");

        private static final String DATA_DICT_CODE = "FUTURE_OFFSET_TYPE";
        private String dataCode;
        private String dataText;

        private FutureOffsetTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static FutureOffsetTypeEnum forCode(String code) {
            FutureOffsetTypeEnum item = null;
            FutureOffsetTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 审核状态
     */
    public enum AuditStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        APPROVING("2", "审批中"),
        /**
         * 审批通过
         */
        APPROVED("3", "审批通过"),
        /**
         * 拒绝
         */
        REJECT("4", "拒绝");

        private static final String DATA_DICT_CODE = "AUDIT_STAT";
        private String dataCode;
        private String dataText;

        private AuditStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AuditStatEnum forCode(String code) {
            AuditStatEnum item = null;
            AuditStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 字典码表类型
     */
    public enum DictTypeEnum implements IDataDictEnum {
        /**
         * 系统
         */
        SYS("1", "系统"),
        /**
         * 业务
         */
        BIZ("2", "业务");

        private static final String DATA_DICT_CODE = "DICT_TYPE";
        private String dataCode;
        private String dataText;

        private DictTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DictTypeEnum forCode(String code) {
            DictTypeEnum item = null;
            DictTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 临时客户类型
     */
    public enum TCustomerTypeOptionsEnum implements IDataDictEnum {
        /**
         * 销售客户
         */
        SALES_CUSTOMER("2", "销售客户"),
        /**
         * 仓储公司
         */
        WAREHOUSING_COMPANY("3", "仓储公司"),
        /**
         * 物流公司
         */
        LOGISTICS_COMPANY("4", "物流公司"),
        /**
         * 经纪商
         */
        BROKERS("5", "经纪商"),
        /**
         * 投资银行
         */
        INVESTMENT_BANK("6", "投资银行");

        private static final String DATA_DICT_CODE = "T_CUSTOMER_TYPE_OPTIONS";
        private String dataCode;
        private String dataText;

        private TCustomerTypeOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TCustomerTypeOptionsEnum forCode(String code) {
            TCustomerTypeOptionsEnum item = null;
            TCustomerTypeOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 投资银行额度类型
     */
    public enum BAmountTypeOptionsEnum implements IDataDictEnum {
        /**
         * 对方授信
         */
        OTHER_CREDIT("1", "对方授信"),
        /**
         * 业务资金
         */
        BUSINESS_CAPITAL("3", "业务资金");

        private static final String DATA_DICT_CODE = "B_AMOUNT_TYPE_OPTIONS";
        private String dataCode;
        private String dataText;

        private BAmountTypeOptionsEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static BAmountTypeOptionsEnum forCode(String code) {
            BAmountTypeOptionsEnum item = null;
            BAmountTypeOptionsEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 指令类型
     */
    public enum InstructionTypeEnum implements IDataDictEnum {
        /**
         * 普通指令
         */
        ORDINARY("1", "普通指令"),
        /**
         * 调整指令
         */
        ADJUST("2", "调整指令"),
        /**
         * 交割指令
         */
        DELIVERY("3", "交割指令"),
        /**
         * 移仓换月指令
         */
        MOVING("4", "移仓换月指令");

        private static final String DATA_DICT_CODE = "INSTRUCTION_TYPE";
        private String dataCode;
        private String dataText;

        private InstructionTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static InstructionTypeEnum forCode(String code) {
            InstructionTypeEnum item = null;
            InstructionTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 策略性质
     */
    public enum StrategyNatureEnum implements IDataDictEnum {
        /**
         * 期现
         */
        PERIOD_NOW("1", "期现"),
        /**
         * 纯盘面
         */
        PURE_DISK("2", "纯盘面"),
        /**
         * 纯现货
         */
        PURE_SPOT("3", "纯现货");

        private static final String DATA_DICT_CODE = "STRATEGY_NATURE";
        private String dataCode;
        private String dataText;

        private StrategyNatureEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StrategyNatureEnum forCode(String code) {
            StrategyNatureEnum item = null;
            StrategyNatureEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 业务类别(附件用)
     */
    public enum BusinessCategoryEnum implements IDataDictEnum {
        /**
         * 入库单
         */
        STORE_IN_BILL("STORE_IN_BILL", "入库单"),
        /**
         * 出库单
         */
        STORE_OUT_BILL("STORE_OUT_BILL", "出库单"),
        /**
         * 采购提货单
         */
        STORE_PURCHASE_BL("STORE_PURCHASE_BL", "采购提货单"),
        /**
         * 销售提货单
         */
        STORE_SALE_BL("STORE_SALE_BL", "销售提货单"),
        /**
         * 仓储合同
         */
        STORE_CONTRACT("STORE_CONTRACT", "仓储合同"),
        /**
         * 物流合同
         */
        STORE_LOGISTIC_CONTRACT("STORE_LOGISTIC_CONTRACT", "物流合同"),
        /**
         * 框架协议
         */
        SPOT_FRAME_PROTOCOL("SPOT_FRAME_PROTOCOL", "框架协议"),
        /**
         * 框架协议变更
         */
        SPOT_FRAME_PROTOCOL_MOD("SPOT_FRAME_PROTOCOL_MOD", "框架协议变更"),
        /**
         * 采购合同
         */
        SPOT_PURCHASE_CONTRACT("SPOT_PURCHASE_CONTRACT", "采购合同"),
        /**
         * 采购合同变更
         */
        SPOT_PURCHASE_CONTRACT_MOD("SPOT_PURCHASE_CONTRACT_MOD", "采购合同变更"),
        /**
         * 销售合同
         */
        SPOT_SALE_CONTRACT("SPOT_SALE_CONTRACT", "销售合同"),
        /**
         * 销售合同变更
         */
        SPOT_SALE_CONTRACT_MOD("SPOT_SALE_CONTRACT_MOD", "销售合同变更"),
        /**
         * 期货数据导入记录
         */
        DVT_IMP_FUTURE("DVT_IMP_FUTURE", "期货数据导入记录"),
        /**
         * 期权数据导入记录
         */
        DVT_IMP_OPTION("DVT_IMP_OPTION", "期权数据导入记录"),
        /**
         * 策略管理
         */
        STRATEGY_MANAGE("STRATEGY_MANAGE", "策略管理"),
        /**
         * 计划管理
         */
        PLAN_MANAGE("PLAN_MANAGE", "计划管理"),
        /**
         * 指令管理
         */
        INSTRUCTION_MANAGE("INSTRUCTION_MANAGE", "指令管理"),
        /**
         * 库存盘点
         */
        STORE_INV_BILL("STORE_INV_BILL", "库存盘点"),
        /**
         * 策略管理变更
         */
        STRATEGY_MANAGE_CHANGE("STRATEGY_MANAGE_CHANGE", "策略管理变更"),
        /**
         * 计划管理变更
         */
        PLAN_MANAGE_CHANGE("PLAN_MANAGE_CHANGE", "计划管理变更"),
        /**
         * 指令管理变更
         */
        INSTRUCTION_MANAGE_CHANGE("INSTRUCTION_MANAGE_CHANGE", "指令管理变更"),
        /**
         * 准入客户管理
         */
        CST_CUSTOMER("CST_CUSTOMER", "准入客户管理");

        private static final String DATA_DICT_CODE = "BUSINESS_CATEGORY";
        private String dataCode;
        private String dataText;

        private BusinessCategoryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static BusinessCategoryEnum forCode(String code) {
            BusinessCategoryEnum item = null;
            BusinessCategoryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 模块类型
     */
    public enum ModuleTypeEnum implements IDataDictEnum {
        /**
         * 工作流
         */
        MODULE_BPM("1", "工作流"),
        /**
         * 页面设置
         */
        MODULE_PAGE("2", "页面设置"),
        /**
         * 功能权限
         */
        MODULE_DATA_AUTH("3", "功能权限"),
        /**
         * 流程页签
         */
        MODULE_TAB("4", "流程页签");

        private static final String DATA_DICT_CODE = "MODULE_TYPE";
        private String dataCode;
        private String dataText;

        private ModuleTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ModuleTypeEnum forCode(String code) {
            ModuleTypeEnum item = null;
            ModuleTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 流程编排模块
     */
    public enum BpmModuleEnum implements IDataDictEnum {
        /**
         * 框架协议
         */
        FRAME_PROTOCOL("FRAME_PROTOCOL", "框架协议"),
        /**
         * 采购合同
         */
        PURCHASE_CONTRACT("PURCHASE_CONTRACT", "采购合同"),
        /**
         * 采购批次
         */
        PURCHASE_BATCH("PURCHASE_BATCH", "采购批次"),
        /**
         * 销售合同
         */
        SALES_CONTRACT("SALES_CONTRACT", "销售合同"),
        /**
         * 销售批次
         */
        SALES_BATCH("SALES_BATCH", "销售批次"),
        /**
         * 定价管理
         */
        PRICING_MANAGE("PRICING_MANAGE", "定价管理"),
        /**
         * 仓储合同
         */
        WAREHOUSE_CONTRACT("WAREHOUSE_CONTRACT", "仓储合同"),
        /**
         * 采购提货单
         */
        PURCHASE_DELIVERY("PURCHASE_DELIVERY", "采购提货单"),
        /**
         * 销售提货单
         */
        SALES_DELIVERY("SALES_DELIVERY", "销售提货单"),
        /**
         * 入库单
         */
        IN_STORE("IN_STORE", "入库单"),
        /**
         * 出库单
         */
        OUT_STORE("OUT_STORE", "出库单"),
        /**
         * 物流合同
         */
        LOGISTICS_CONTRACT("LOGISTICS_CONTRACT", "物流合同"),
        /**
         * 库存盘点
         */
        STOCK_INVENTORY("STOCK_INVENTORY", "库存盘点"),
        /**
         * 策略管理
         */
        STRATEGY_MANAGE("STRATEGY_MANAGE", "策略管理"),
        /**
         * 计划管理
         */
        PLAN_MANAGE("PLAN_MANAGE", "计划管理"),
        /**
         * 指令管理
         */
        INSTRUCTION_MANAGE("INSTRUCTION_MANAGE", "指令管理"),
        /**
         * 现货成交分配
         */
        SPOT_TRADE_ASSIGN("SPOT_TRADE_ASSIGN", "现货成交分配"),
        /**
         * 期货成交分配
         */
        FUTURES_TRADE_ASSIGN("FUTURES_TRADE_ASSIGN", "期货成交分配"),
        /**
         * 采购发票
         */
        PURCHASE_INVOICE("PURCHASE_INVOICE", "采购发票"),
        /**
         * 销售发票
         */
        SALES_INVOICE("SALES_INVOICE", "销售发票"),
        /**
         * 费用发票
         */
        COST_INVOICE("COST_INVOICE", "费用发票"),
        /**
         * 采购合同对账单
         */
        PURCHASE_STATEMENT("PURCHASE_STATEMENT", "采购合同对账单"),
        /**
         * 销售合同对账单
         */
        SALES_STATEMENT("SALES_STATEMENT", "销售合同对账单"),
        /**
         * 收款单
         */
        RECEIPT("RECEIPT", "收款单"),
        /**
         * 付款申请单
         */
        PAY_APPLY("PAY_APPLY", "付款申请单"),
        /**
         * 付款单
         */
        PAY("PAY", "付款单"),
        /**
         * 系统参数
         */
        PARAMETER("PARAMETER", "系统参数"),
        /**
         * 字典
         */
        DICT("DICT", "字典"),
        /**
         * 系统任务
         */
        JOB("JOB", "系统任务"),
        /**
         * 系统日志
         */
        LOG("LOG", "系统日志"),
        /**
         * 消息提醒
         */
        MESSAGE_REMIND("MESSAGE_REMIND", "消息提醒"),
        /**
         * 待办
         */
        TODO("TODO", "待办"),
        /**
         * 客户管理
         */
        CUSTOMER_MANAGE("CUSTOMER_MANAGE", "客户管理"),
        /**
         * 客户授信
         */
        CUSTOMER_CREDIT("CUSTOMER_CREDIT", "客户授信"),
        /**
         * 现货业务台账
         */
        SPOT_LEDGER("SPOT_LEDGER", "现货业务台账"),
        /**
         * 现货PNL统计表
         */
        SPOT_PNL_SUMMARY("SPOT_PNL_SUMMARY", "现货PNL统计表"),
        /**
         * 库存台账
         */
        STOCK_LEDGER("STOCK_LEDGER", "库存台账"),
        /**
         * 收发存汇总表
         */
        STORE_SUMMARY("STORE_SUMMARY", "收发存汇总表"),
        /**
         * 应收总账表
         */
        RECEIVABLE_SUMMARY("RECEIVABLE_SUMMARY", "应收总账表"),
        /**
         * 应收明细表
         */
        RECEIVABLE_DETAIL("RECEIVABLE_DETAIL", "应收明细表"),
        /**
         * 应付总账表
         */
        PAYABLE_SUMMARY("PAYABLE_SUMMARY", "应付总账表"),
        /**
         * 应付明细表
         */
        PAYABLE_DETAIL("PAYABLE_DETAIL", "应付明细表"),
        /**
         * 期货价格管理
         */
        FUTURES_PRICE("FUTURES_PRICE", "期货价格管理"),
        /**
         * 期货价格调整单
         */
        FUTURES_PRICE_ADJUST("FUTURES_PRICE_ADJUST", "期货价格调整单"),
        /**
         * 现货价格管理
         */
        SPOT_PRICE("SPOT_PRICE", "现货价格管理"),
        /**
         * 现货价格调整单
         */
        SPOT_PRICE_ADJUST("SPOT_PRICE_ADJUST", "现货价格调整单"),
        /**
         * 现货价格基础设置
         */
        SPOT_PRICE_SET("SPOT_PRICE_SET", "现货价格基础设置"),
        /**
         * 现货头寸表
         */
        SPOT_POSITION("SPOT_POSITION", "现货头寸表"),
        /**
         * 衍生品头寸表
         */
        DERIVATIVE_POSITION("DERIVATIVE_POSITION", "衍生品头寸表"),
        /**
         * 现货盯市损益表
         */
        SPOT_MTM("SPOT_MTM", "现货盯市损益表"),
        /**
         * 期现基础表
         */
        SPOT_FUTURES_REPORT("SPOT_FUTURES_REPORT", "期现基础表"),
        /**
         * 期货账号成交
         */
        FUTURES_TRADE("FUTURES_TRADE", "期货账号成交"),
        /**
         * 期货账户权益
         */
        FUTURES_ACCOUNT_BALANCE("FUTURES_ACCOUNT_BALANCE", "期货账户权益"),
        /**
         * 期货账户持仓
         */
        FUTURES_POSITION("FUTURES_POSITION", "期货账户持仓"),
        /**
         * 期货数据导入
         */
        FUTURES_DATA_IMPORT("FUTURES_DATA_IMPORT", "期货数据导入"),
        /**
         * 期权账户成交
         */
        OPTION_ACCOUNT_TRADE("OPTION_ACCOUNT_TRADE", "期权账户成交"),
        /**
         * 期权账户持仓
         */
        OPTION_ACCOUNT_POSITION("OPTION_ACCOUNT_POSITION", "期权账户持仓"),
        /**
         * 期权数据导入
         */
        OPTION_DATA_IMPORT("OPTION_DATA_IMPORT", "期权数据导入"),
        /**
         * 预警监控设置
         */
        WARNING_MONITOR("WARNING_MONITOR", "预警监控设置"),
        /**
         * 预警管理
         */
        WARNING("WARNING", "预警管理"),
        /**
         * 商品分类
         */
        PRODUCT_CATEGORY("PRODUCT_CATEGORY", "商品分类"),
        /**
         * 商品档案
         */
        PRODUCT("PRODUCT", "商品档案"),
        /**
         * 属性组档案
         */
        ATTR_GROUP("ATTR_GROUP", "属性组档案"),
        /**
         * 计量单位组
         */
        UNIT_GROUP("UNIT_GROUP", "计量单位组"),
        /**
         * 仓库档案
         */
        WAREHOUSE("WAREHOUSE", "仓库档案"),
        /**
         * 港口档案
         */
        PORT("PORT", "港口档案"),
        /**
         * 地区档案
         */
        AREA("AREA", "地区档案"),
        /**
         * 市场管理
         */
        MARK("MARK", "市场管理"),
        /**
         * 定价基准
         */
        PRICING_BENCHMARK("PRICING_BENCHMARK", "定价基准"),
        /**
         * 估值基准管理
         */
        VALUATION_BENCHMARK("VALUATION_BENCHMARK", "估值基准管理"),
        /**
         * 前置地址管理
         */
        FRONT_ADDRESS("FRONT_ADDRESS", "前置地址管理"),
        /**
         * 交易所管理
         */
        EXCHANGE("EXCHANGE", "交易所管理"),
        /**
         * 衍生品账号管理
         */
        DERIVATIVE_ACCOUNT("DERIVATIVE_ACCOUNT", "衍生品账号管理"),
        /**
         * 衍生品子账号管理
         */
        DERIVATIVE_SUBACCOUNT("DERIVATIVE_SUBACCOUNT", "衍生品子账号管理"),
        /**
         * 期货品种管理
         */
        FUTURES_VARIETIES("FUTURES_VARIETIES", "期货品种管理"),
        /**
         * 期权品种管理
         */
        OPTION_VARIETIES("OPTION_VARIETIES", "期权品种管理"),
        /**
         * 期货合约管理
         */
        FUTURES_CONTRACT("FUTURES_CONTRACT", "期货合约管理"),
        /**
         * 期权合约管理
         */
        OPTION_CONTRACT("OPTION_CONTRACT", "期权合约管理"),
        /**
         * 币种档案
         */
        CURRENCY("CURRENCY", "币种档案"),
        /**
         * 税率档案
         */
        RATE("RATE", "税率档案"),
        /**
         * 结算方式
         */
        SETTLEMENT("SETTLEMENT", "结算方式"),
        /**
         * 类型档案
         */
        STRATEGY_TYPE("STRATEGY_TYPE", "类型档案"),
        /**
         * 项目档案
         */
        PROJECT("PROJECT", "项目档案"),
        /**
         * 机构管理
         */
        ORGAN("ORGAN", "机构管理"),
        /**
         * 部门管理
         */
        DEPARTMENT("DEPARTMENT", "部门管理"),
        /**
         * 员工管理
         */
        STAFF("STAFF", "员工管理"),
        /**
         * 职能管理
         */
        FUNCTION("FUNCTION", "职能管理"),
        /**
         * 业务管理
         */
        BIZ_MANAGE("BIZ_MANAGE", "业务管理"),
        /**
         * 审核管理
         */
        AUDIT_MANAGE("AUDIT_MANAGE", "审核管理"),
        /**
         * 子模块管理
         */
        SUBMODULE_MANAGE("SUBMODULE_MANAGE", "子模块管理"),
        /**
         * 框架协议变更
         */
        FRAME_PROTOCOL_MOD("FRAME_PROTOCOL_MOD", "框架协议变更"),
        /**
         * 销售合同变更
         */
        SALES_CONTRACT_MOD("SALES_CONTRACT_MOD", "销售合同变更"),
        /**
         * 采购合同变更
         */
        PURCHASE_CONTRACT_MOD("PURCHASE_CONTRACT_MOD", "采购合同变更");

        private static final String DATA_DICT_CODE = "BPM_MODULE";
        private String dataCode;
        private String dataText;

        private BpmModuleEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static BpmModuleEnum forCode(String code) {
            BpmModuleEnum item = null;
            BpmModuleEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 仓储物流合同状态
     */
    public enum StoreContractStatEnum implements IDataDictEnum {
        /**
         * 草拟
         */
        DRAFT("1", "草拟"),
        /**
         * 审批中
         */
        IN_APPROVAL("2", "审批中"),
        /**
         * 同意
         */
        AGREE("3", "同意"),
        /**
         * 否决
         */
        VETO("4", "否决"),
        /**
         * 关闭
         */
        CLOSE("5", "关闭");

        private static final String DATA_DICT_CODE = "STORE_CONTRACT_STAT";
        private String dataCode;
        private String dataText;

        private StoreContractStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StoreContractStatEnum forCode(String code) {
            StoreContractStatEnum item = null;
            StoreContractStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 机构性质
     */
    public enum OrganNatureEnum implements IDataDictEnum {
        /**
         * 集团
         */
        ORGANIZATION("1", "集团"),
        /**
         * 子公司
         */
        SUBSIDIARY("2", "子公司");

        private static final String DATA_DICT_CODE = "ORGAN_NATURE";
        private String dataCode;
        private String dataText;

        private OrganNatureEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static OrganNatureEnum forCode(String code) {
            OrganNatureEnum item = null;
            OrganNatureEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 统计报表摘要
     */
    public enum ReportSummaryEnum implements IDataDictEnum {
        /**
         * 期初
         */
        BEGINNING("1", "期初"),
        /**
         * 本期发生
         */
        PERIOD_OCCURS("2", "本期发生"),
        /**
         * 本月合计
         */
        MONTH_SUM("3", "本月合计"),
        /**
         * 合计
         */
        PERIOD_SUM("4", "合计"),
        /**
         * 本年累计
         */
        YEAR_SUM("5", "本年累计");

        private static final String DATA_DICT_CODE = "REPORT_SUMMARY";
        private String dataCode;
        private String dataText;

        private ReportSummaryEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ReportSummaryEnum forCode(String code) {
            ReportSummaryEnum item = null;
            ReportSummaryEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 统计报表业务类型
     */
    public enum ReportBizTypeEnum implements IDataDictEnum {
        /**
         * 应收
         */
        RECEIVABLE("1", "应收"),
        /**
         * 收款
         */
        RECEIPT("2", "收款"),
        /**
         * 应付
         */
        PAYABLE("3", "应付"),
        /**
         * 付款
         */
        PAID("4", "付款");

        private static final String DATA_DICT_CODE = "REPORT_BIZ_TYPE";
        private String dataCode;
        private String dataText;

        private ReportBizTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ReportBizTypeEnum forCode(String code) {
            ReportBizTypeEnum item = null;
            ReportBizTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 任务类型
     */
    public enum JobTypeEnum implements IDataDictEnum {
        /**
         * 单机
         */
        SINGLE_MACHINE("0", "单机"),
        /**
         * 多机
         */
        MULTI_MACHINE("1", "多机");

        private static final String DATA_DICT_CODE = "JOB_TYPE";
        private String dataCode;
        private String dataText;

        private JobTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static JobTypeEnum forCode(String code) {
            JobTypeEnum item = null;
            JobTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 任务状态
     */
    public enum TaskStatusEnum implements IDataDictEnum {
        /**
         * 正常
         */
        NOMAL("1", "正常"),
        /**
         * 暂停
         */
        PAUSE("0", "暂停");

        private static final String DATA_DICT_CODE = "TASK_STATUS";
        private String dataCode;
        private String dataText;

        private TaskStatusEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TaskStatusEnum forCode(String code) {
            TaskStatusEnum item = null;
            TaskStatusEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 升贴水类型
     */
    public enum PremiumTypeEnum implements IDataDictEnum {
        /**
         * 固定
         */
        FIXED("1", "固定"),
        /**
         * 按数量
         */
        BY_QUANTITY("2", "按数量"),
        /**
         * 按比例
         */
        IN_PROPORTION("3", "按比例");

        private static final String DATA_DICT_CODE = "PREMIUM_TYPE";
        private String dataCode;
        private String dataText;

        private PremiumTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PremiumTypeEnum forCode(String code) {
            PremiumTypeEnum item = null;
            PremiumTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 操作类型
     */
    public enum ActTypeEnum implements IDataDictEnum {
        /**
         * 新增
         */
        ADD("A", "新增"),
        /**
         * 修改
         */
        UPD("U", "修改"),
        /**
         * 删除
         */
        DEL("D", "删除");

        private static final String DATA_DICT_CODE = "ACT_TYPE";
        private String dataCode;
        private String dataText;

        private ActTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ActTypeEnum forCode(String code) {
            ActTypeEnum item = null;
            ActTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 入出库类型
     */
    public enum StoreTypeEnum implements IDataDictEnum {
        /**
         * 入库
         */
        IN("1", "入库"),
        /**
         * 出库
         */
        OUT("2", "出库");

        private static final String DATA_DICT_CODE = "STORE_TYPE";
        private String dataCode;
        private String dataText;

        private StoreTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static StoreTypeEnum forCode(String code) {
            StoreTypeEnum item = null;
            StoreTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 检查结果
     */
    public enum CheckResultEnum implements IDataDictEnum {
        /**
         * 正常
         */
        NORMAL("0", "正常"),
        /**
         * 错误
         */
        ERROR("1", "错误"),
        /**
         * 警告
         */
        WARNING("2", "警告");

        private static final String DATA_DICT_CODE = "CHECK_RESULT";
        private String dataCode;
        private String dataText;

        private CheckResultEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static CheckResultEnum forCode(String code) {
            CheckResultEnum item = null;
            CheckResultEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 提货地点类型
     */
    public enum DeliveryPlaceTypeEnum implements IDataDictEnum {
        /**
         * 仓库
         */
        WAREHOUSE("1", "仓库"),
        /**
         * 采购客户
         */
        CUSTOMER("2", "采购客户");

        private static final String DATA_DICT_CODE = "DELIVERY_PLACE_TYPE";
        private String dataCode;
        private String dataText;

        private DeliveryPlaceTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DeliveryPlaceTypeEnum forCode(String code) {
            DeliveryPlaceTypeEnum item = null;
            DeliveryPlaceTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 上级区分
     */
    public enum ParentTypeEnum implements IDataDictEnum {
        /**
         * 策略
         */
        STRATEGY("1", "策略"),
        /**
         * 计划
         */
        PLAN("2", "计划");

        private static final String DATA_DICT_CODE = "PARENT_TYPE";
        private String dataCode;
        private String dataText;

        private ParentTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ParentTypeEnum forCode(String code) {
            ParentTypeEnum item = null;
            ParentTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品开平
     */
    public enum DerivativeOffsetEnum implements IDataDictEnum {
        /**
         * 开仓
         */
        OPEN("0", "开仓"),
        /**
         * 平仓
         */
        CLOSE("1", "平仓");

        private static final String DATA_DICT_CODE = "DERIVATIVE_OFFSET";
        private String dataCode;
        private String dataText;

        private DerivativeOffsetEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DerivativeOffsetEnum forCode(String code) {
            DerivativeOffsetEnum item = null;
            DerivativeOffsetEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品类型
     */
    public enum PlanDerivativeTypeEnum implements IDataDictEnum {
        /**
         * 期货
         */
        FUTURES("0", "期货"),
        /**
         * 看涨
         */
        BULLISH("1", "看涨"),
        /**
         * 看跌
         */
        BEARISH("2", "看跌");

        private static final String DATA_DICT_CODE = "PLAN_DERIVATIVE_TYPE";
        private String dataCode;
        private String dataText;

        private PlanDerivativeTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PlanDerivativeTypeEnum forCode(String code) {
            PlanDerivativeTypeEnum item = null;
            PlanDerivativeTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 数据来源
     */
    public enum DataChannelEnum implements IDataDictEnum {
        /**
         * CTP接口
         */
        CTP("1", "CTP接口"),
        /**
         * 导入
         */
        IMPORT("2", "导入"),
        /**
         * 补录
         */
        ADD("3", "补录");

        private static final String DATA_DICT_CODE = "DATA_CHANNEL";
        private String dataCode;
        private String dataText;

        private DataChannelEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DataChannelEnum forCode(String code) {
            DataChannelEnum item = null;
            DataChannelEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 权限按钮
     */
    public enum AuthButtonEnum implements IDataDictEnum {
        /**
         * 全部
         */
        ALL("all", "全部"),
        /**
         * 查看
         */
        VIEW("view", "查看"),
        /**
         * 新增
         */
        ADD("add", "新增"),
        /**
         * 修改
         */
        EDIT("edit", "修改"),
        /**
         * 查询
         */
        QUERY("query", "查询"),
        /**
         * 详细
         */
        DETAIL("detail", "详细"),
        /**
         * 删除
         */
        REMOVE("remove", "删除"),
        /**
         * 关闭
         */
        CLOSE("close", "关闭"),
        /**
         * 提交
         */
        MODIFY("modify", "提交"),
        /**
         * 变更
         */
        SUBMIT("submit", "变更"),
        /**
         * 附件
         */
        ATTACHMENT("attachment", "附件"),
        /**
         * 原始
         */
        ORIGINAL("original", "原始"),
        /**
         * 重置
         */
        RESET("reset", "重置"),
        /**
         * 重置密码
         */
        RESETPASSWORD("resetPassword", "重置密码"),
        /**
         * 清空
         */
        CLEAR("clear", "清空"),
        /**
         * 设置
         */
        SET("set", "设置"),
        /**
         * 处理
         */
        HANDLE("handle", "处理"),
        /**
         * 复制
         */
        COPY("copy", "复制"),
        /**
         * 审批
         */
        AUDIT("audit", "审批");

        private static final String DATA_DICT_CODE = "AUTH_BUTTON";
        private String dataCode;
        private String dataText;

        private AuthButtonEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AuthButtonEnum forCode(String code) {
            AuthButtonEnum item = null;
            AuthButtonEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 审核流程定义key
     */
    public enum AuditBpmKeyEnum implements IDataDictEnum {
        /**
         * 采购合同新增
         */
        PURCHASE_CONTRACT_ADD_BPM("CTRMApprovePurchaseContractAdd", "采购合同新增"),
        /**
         * 采购合同变更
         */
        PURCHASE_CONTRACT_UPDATE_BPM("CTRMApprovePurchaseContractUpdate", "采购合同变更"),
        /**
         * 采购批次新建
         */
        PURCHASE_BATCH_ADD_BPM("CTRMApprovePurchaseBatchAdd", "采购批次新建"),
        /**
         * 销售合同新增
         */
        SALES_CONTRACT_ADD_BPM("CTRMApproveSaleContractAdd", "销售合同新增"),
        /**
         * 销售合同变更
         */
        SALES_CONTRACT_UPDATE_BPM("CTRMApproveSaleContractUpdate", "销售合同变更"),
        /**
         * 销售批次新增
         */
        SALES_BATCH_ADD_BPM("CTRMApproveSaleBatchAdd", "销售批次新增"),
        /**
         * 付款申请单新增
         */
        PAY_APPLY_ADD_BPM("CTRMApprovePayApplyAdd", "付款申请单新增"),
        /**
         * 采购提货单新增
         */
        PURCHASE_DELIVERY_ADD_BPM("CTRMApprovePurchaseDeliveryAdd", "采购提货单新增"),
        /**
         * 框架协议新增
         */
        FRAME_PROTOCOL_ADD_BPM("CTRMApproveFrameProtocolAdd", "框架协议新增"),
        /**
         * 框架协议变更
         */
        FRAME_PROTOCOL_UPDATE_BPM("CTRMApproveFrameProtocolUpdate", "框架协议变更"),
        /**
         * 入库单新增
         */
        IN_STORAGE_ADD_BPM("CTRMApproveInStorageAdd", "入库单新增"),
        /**
         * 采购发票新增
         */
        PURCHASE_INVOICE_ADD_BPM("CTRMApprovePurchaseInvoiceAdd", "采购发票新增"),
        /**
         * 策略新增
         */
        STRATEGY_ADD_BPM("CTRMApproveStrategyAdd", "策略新增"),
        /**
         * 计划新增
         */
        PLAN_ADD_BPM("CTRMApprovePlanAdd", "计划新增"),
        /**
         * 指令新增
         */
        INSTR_ADD_BPM("CTRMApproveInstrAdd", "指令新增"),
        /**
         * 准入客户管理
         */
        ACCESS_CUSTOMRE_MNG_BPM("CTRMApproveAccessCustomerMng", "准入客户管理"),
        /**
         * 客户授信管理
         */
        CUSTOMER_CREDIT_MNG_BPM("CTRMApproveCustomerCreditMng", "客户授信管理"),
        /**
         * 仓储合同
         */
        WAREHOUSING_CONTRACT_BPM("CTRMApproveWarehousingContract", "仓储合同"),
        /**
         * 物流合同
         */
        LOGISTICS_CONTRACT_BPM("CTRMApproveLogisticsContract", "物流合同"),
        /**
         * 期货价格调整单
         */
        FUTURES_PRICE_ADJUST_SHEET_BPM("CTRMApproveFuturesPriceAdjustSheet", "期货价格调整单"),
        /**
         * 现货价格调整单
         */
        SPOT_PRICE_ADJUST_SHEET_BPM("CTRMApproveSpotPriceAdjustSheet", "现货价格调整单"),
        /**
         * 库存盘点
         */
        STORE_INV_BILL_PROD_BPM("CTRMApproveStoreInvBillProd", "库存盘点"),
        /**
         * 费用发票
         */
        COST_INVOICE_BPM("CTRMApproveCostInvoice", "费用发票"),
        /**
         * 策略变更
         */
        STRATEGY_CHANGE_BPM("CTRMApproveStrategyMod", "策略变更"),
        /**
         * 计划变更
         */
        PLAN_CHANGE_BPM("CTRMApprovePlanMod", "计划变更");

        private static final String DATA_DICT_CODE = "AUDIT_BPM_KEY";
        private String dataCode;
        private String dataText;

        private AuditBpmKeyEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AuditBpmKeyEnum forCode(String code) {
            AuditBpmKeyEnum item = null;
            AuditBpmKeyEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 价格调整类型
     */
    public enum PriceAdjustTypeEnum implements IDataDictEnum {
        /**
         * 价格调整
         */
        PRICE_UPDATE("1", "价格调整"),
        /**
         * 价格补录
         */
        PRICE_ADD("2", "价格补录");

        private static final String DATA_DICT_CODE = "PRICE_ADJUST_TYPE";
        private String dataCode;
        private String dataText;

        private PriceAdjustTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static PriceAdjustTypeEnum forCode(String code) {
            PriceAdjustTypeEnum item = null;
            PriceAdjustTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 现货价格基础设置类型
     */
    public enum ProductTypeEnum implements IDataDictEnum {
        /**
         * 标准品
         */
        STANDARD("1", "标准品"),
        /**
         * 非标准品
         */
        NOSTANDARD("2", "非标准品");

        private static final String DATA_DICT_CODE = "PRODUCT_TYPE";
        private String dataCode;
        private String dataText;

        private ProductTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ProductTypeEnum forCode(String code) {
            ProductTypeEnum item = null;
            ProductTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 期权类型
     */
    public enum OptionsTypeEnum implements IDataDictEnum {
        /**
         * 看涨
         */
        CALL_OPTIONS("1", "看涨"),
        /**
         * 看跌
         */
        PUT_OPTIONS("2", "看跌");

        private static final String DATA_DICT_CODE = "OPTIONS_TYPE";
        private String dataCode;
        private String dataText;

        private OptionsTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static OptionsTypeEnum forCode(String code) {
            OptionsTypeEnum item = null;
            OptionsTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 审批状态
     */
    public enum AgreeFlgEnum implements IDataDictEnum {
        /**
         * 拒绝
         */
        REFUSE("0", "拒绝"),
        /**
         * 通过
         */
        PASS("1", "通过");

        private static final String DATA_DICT_CODE = "AGREE_FLG";
        private String dataCode;
        private String dataText;

        private AgreeFlgEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static AgreeFlgEnum forCode(String code) {
            AgreeFlgEnum item = null;
            AgreeFlgEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 轨迹类型
     */
    public enum TrackTypeEnum implements IDataDictEnum {
        /**
         * 提交
         */
        SUBMIT("0", "提交"),
        /**
         * 审批
         */
        AUDIT("1", "审批");

        private static final String DATA_DICT_CODE = "TRACK_TYPE";
        private String dataCode;
        private String dataText;

        private TrackTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static TrackTypeEnum forCode(String code) {
            TrackTypeEnum item = null;
            TrackTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品任务类型
     */
    public enum DvtTaskTypeEnum implements IDataDictEnum {
        /**
         * 载入CTP期货成交数据
         */
        FETURE_LOAD_CTP_TRADE("1", "载入CTP期货成交数据"),
        /**
         * 载入上传期货成交数据
         */
        FETURE_LOAD_UPLOAD_TRADE("2", "载入上传期货成交数据"),
        /**
         * 期货账号资金报表
         */
        RETURE_REPORT_ACCOUNT("3", "期货账号资金报表"),
        /**
         * 期货子账号资金报表
         */
        RETURE_REPORT_SUB_ACCOUNT("4", "期货子账号资金报表"),
        /**
         * 期货持仓明细报表
         */
        RETURE_REPORT_DTL_POSITION("5", "期货持仓明细报表"),
        /**
         * 期货持仓汇总表白
         */
        RETURE_REPORT_SUM_POSITION("6", "期货持仓汇总表白");

        private static final String DATA_DICT_CODE = "DVT_TASK_TYPE";
        private String dataCode;
        private String dataText;

        private DvtTaskTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DvtTaskTypeEnum forCode(String code) {
            DvtTaskTypeEnum item = null;
            DvtTaskTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 审批状态
     */
    public enum ApproveStatEnum implements IDataDictEnum {
        /**
         * 拒绝
         */
        REFUSE("0", "拒绝"),
        /**
         * 通过
         */
        PASS("1", "通过");

        private static final String DATA_DICT_CODE = "APPROVE_STAT";
        private String dataCode;
        private String dataText;

        private ApproveStatEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static ApproveStatEnum forCode(String code) {
            ApproveStatEnum item = null;
            ApproveStatEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

    /**
     * 衍生品数据所属类型
     */
    public enum DvtDataOwnerTypeEnum implements IDataDictEnum {
        /**
         * 衍生品账号
         */
        DERIVATIVE_ACCOUNT("1", "衍生品账号"),
        /**
         * 已分配子账号
         */
        DIVIDED("2", "已分配子账号"),
        /**
         * 未分配子账号
         */
        UN_DIVIDED("3", "未分配子账号");

        private static final String DATA_DICT_CODE = "DVT_DATA_OWNER_TYPE";
        private String dataCode;
        private String dataText;

        private DvtDataOwnerTypeEnum(String dataCode, String dataText) {
            this.dataCode = dataCode;
            this.dataText = dataText;
        }

        /**
         * 返回字典码表分类代码""""""
         *
         * @return 字典码表分类代码""""""
         */
        public static String getDataDictCode() {
            return DATA_DICT_CODE;
        }

        /**
         * 通过代码找到枚举
         *
         * @param code 代码""""""
         * @return 枚举
         */
        public static DvtDataOwnerTypeEnum forCode(String code) {
            DvtDataOwnerTypeEnum item = null;
            DvtDataOwnerTypeEnum[] allItems = values();
            for (int i = 0; i < allItems.length; i++) {
                if (allItems[i].codeEquals(code)) {
                    item = allItems[i];
                    break;
                }
            }
            return item;
        }

        @Override
        public String getDataCode() {
            return dataCode;
        }

        @Override
        public String getDataText() {
            return dataText;
        }
    }

}

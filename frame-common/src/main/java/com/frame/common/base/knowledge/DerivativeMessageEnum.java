package com.frame.common.base.knowledge;

import lombok.Getter;

/**
 * 消息枚举
 *
 * @author maty
 */
@Getter
public enum DerivativeMessageEnum implements IMessageEnum {
    /**
     * 共通的消息
     */
    EDVT0XXX("EDVT0XXX", "共通的消息"),
    EDVT0001("EDVT0001", "发送系统异常"),
    EDVT0002("EDVT0002", "输入参数不可以为空"),

    EDVT1001("EDVT1001", "衍生品子账号不存在"),
    EDVT1002("EDVT1002", "期货成交记录不存在"),
    EDVT2001("EDVT2001", "上传的文件不存在"),
    EDVT2002("EDVT2002", "导出的文件必须是Excel文件(*.xlsx)"),
    EDVT2003("EDVT2003", "导入文件中，【客户信息及资金情况】工作表不存在"),
    EDVT2004("EDVT2004", "导入文件中，【成交明细】工作表不存在"),
    EDVT2005("EDVT2005", "导入文件中，【持仓明细】工作表不存在"),
    EDVT2006("EDVT2006", "客户期货期权内部资金账户不存在:{0}"),
    EDVT2007("EDVT2007", "合约不存在：{0}"),
    EDVT2008("EDVT2008", "成交明细的合约不存在：{0}"),
    EDVT2009("EDVT2009", "持仓明细的合约不存在：{0}"),
    EDVT2010("EDVT2010", "客户期货期权内部资金账户”不可为空"),
    EDVT2011("EDVT2011", "客户名称”不可为空"),
    EDVT2012("EDVT2012", "上日结存”不可为空"),
    EDVT2013("EDVT2013", "交易日期”不可为空"),
    EDVT2014("EDVT2014", "入金金额”不可为空"),
    EDVT2015("EDVT2015", "出金金额”不可为空"),
    EDVT2016("EDVT2016", "交易日期”不是有效的日期"),
    EDVT2017("EDVT2017", "上日结存”不是数字"),
    EDVT2018("EDVT2018", "入金金额”不是数字"),
    EDVT2019("EDVT2019", "出金金额”不是数字"),
    EDVT2020("EDVT2020", "合约”不可为空"),
    EDVT2021("EDVT2021", "成交时间”不可为空"),
    EDVT2022("EDVT2022", "买/卖”不可为空"),
    EDVT2023("EDVT2023", "投机/套保”不可为空"),
    EDVT2024("EDVT2024", "成交价”不可为空"),
    EDVT2025("EDVT2025", "手数”不可为空"),
    EDVT2026("EDVT2026", "开/平”不可为空"),
    EDVT2027("EDVT2027", "成交时间”不是有效的日期"),
    EDVT2028("EDVT2028", "买/卖”只可以为“买”或者“卖"),
    EDVT2029("EDVT2029", "投机/套保”只可以为“投机”或者“套保"),
    EDVT2030("EDVT2030", "成交价”不是数字"),
    EDVT2031("EDVT2031", "手数”必须为整数"),
    EDVT2032("EDVT2032", "开/平”只可以为“开”或者“平"),
    EDVT2033("EDVT2033", "导入文件中，【客户信息及成交明细】工作表不存在"),
    EDVT2034("EDVT2034", "买持仓”不可为空"),
    EDVT2035("EDVT2035", "买均价”不可为空"),
    EDVT2036("EDVT2036", "卖持仓”不可为空"),
    EDVT2037("EDVT2037", "卖均价”不可为空"),
    EDVT2038("EDVT2038", "昨结算价”不可为空"),
    EDVT2039("EDVT2039", "今结算价”不可为空"),
    EDVT2040("EDVT2040", "品种”不可为空"),
    EDVT2041("EDVT2041", "买持仓”必须为整数"),
    EDVT2042("EDVT2042", "买均价”不是数字"),
    EDVT2043("EDVT2043", "卖持仓”必须为整数"),
    EDVT2044("EDVT2044", "卖均价”不是数字"),
    EDVT2045("EDVT2045", "昨结算价”不是数字"),
    EDVT2046("EDVT2046", "今结算价”不是数字"),
    EDVT2047("EDVT2047", "合约标的”不可为空"),
    EDVT2048("EDVT2048", "行权价”不可为空"),
    EDVT2049("EDVT2049", "权利金”不可为空"),
    EDVT2050("EDVT2050", "合约月份”不可为空"),
    EDVT2051("EDVT2051", "类型”不可为空"),
    EDVT2052("EDVT2052", "方向”不可为空"),
    EDVT2053("EDVT2053", "数量”不可为空"),
    EDVT2054("EDVT2054", "成交价”不可为空"),
    EDVT2055("EDVT2055", "结算价”不可为空"),
    EDVT2056("EDVT2056", "手续费”不可为空"),
    EDVT2057("EDVT2057", "行权价”不是数字"),
    EDVT2058("EDVT2058", "权利金”不是数字"),
    EDVT2059("EDVT2059", "合约月份”不是有效年月"),
    EDVT2060("EDVT2060", "类型”只可以为“看涨”或者“看跌"),
    EDVT2061("EDVT2061", "方向”只可以为“买”或者“卖"),
    EDVT2062("EDVT2062", "数量”必须为整数"),
    EDVT2063("EDVT2063", "成交价”不是数字"),
    EDVT2064("EDVT2064", "结算价”不是数字"),
    EDVT2065("EDVT2065", "手续费”不是数字"),
    EDVT2066("EDVT2007", "品种”不存在：{0}"),
    EDVT2067("EDVT2008", "合约标的”不存在：{0}");


    /**
     * 消息ID
     */
    private final String id;
    /**
     * 消息内容(中文)
     */
    private final String message;

    private DerivativeMessageEnum(String id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return message;
    }


}

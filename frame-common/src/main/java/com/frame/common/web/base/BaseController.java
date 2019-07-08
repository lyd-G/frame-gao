package com.frame.common.web.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frame.common.base.knowledge.IMessageEnum;
import com.frame.common.base.model.Result;
import com.frame.common.base.model.ResultTable;
import com.frame.common.base.shiro.ShiroUser;
import com.frame.common.base.util.LocaleMessageSourceUtil;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 基础 web
 *
 * @author gaoly
 * @date 2017/05/16 14:51
 */
public abstract class BaseController {

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {

        //自动转换日期类型的字段格式
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));

    }


    /**
     * 获取当前登录用户account
     *
     * @return 账户
     */
    protected String getCurrentAccount() {
        return ShiroUser.getCurrentUser().getAccount();
    }


    /**
     * 获取当前登录用户account Name
     *
     * @return 账户
     */
    protected String getAuthName() {
        return ShiroUser.getCurrentUser().getName();
    }

    /**
     * 获取当前登录用户人对应的权限account
     *
     * @return 账户
     */
    protected String getRunAsAccount() {
        return ShiroUser.getCurrentUser().getRunAsAccount();
    }

    /**
     * 获取当前登录用户人对应的权限Terminal
     *
     * @return 终端
     */
    protected String getAccountTerminal() {
        return ShiroUser.getCurrentUser().getTerminal();
    }


    /**
     * 获取当前登录用户人对应的用户ID
     *
     * @return 用户ID
     */
    protected String getAuthId() {
        return ShiroUser.getCurrentUser().getAuthId();
    }


    /**
     * 失败请求
     *
     * @param msgId   失败的消息
     * @param msgText 失败的消息
     * @return Result 通用返回对象
     */
    protected Result renderError(String msgId, String msgText) {
        return Result.builder().status(false).msgId(msgId).msgText(msgText).build();

    }

    /**
     * 失败请求
     *
     * @param msgId 失败的消息
     * @return Result 通用返回对象
     */
    protected Result renderError(IMessageEnum msgId) {
        return Result.builder().status(false).msgId(msgId.getId()).msgText(LocaleMessageSourceUtil.getMessage(msgId.getId())).build();

    }

    /**
     * 成功请求
     *
     * @return Result 通用返回对象
     */
    protected Result renderSuccess() {
        return Result.builder().status(true).data(Boolean.TRUE).build();

    }


    /**
     * 成功请求
     *
     * @param obj 成功时的对象
     * @return Result 通用返回对象
     */
    protected <T> Result<T> renderSuccess(T obj) {
        Result<T> result = new Result<>();
        result.setData(obj);
        return result;
    }


    /**
     * @param page 分页信息
     * @param <T>  过滤条件对象
     * @return ResultTable 通用的分页返回对象
     */
    protected <T> ResultTable<T> renderSuccess(Page<T> page) {
        return new ResultTable<>(page);
    }


}

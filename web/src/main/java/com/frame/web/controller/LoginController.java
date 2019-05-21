package com.frame.web.controller;

import com.frame.common.auth.dto.AccountDto;
import com.frame.common.auth.dto.TokenDto;
import com.frame.common.auth.service.IAuthService;
import com.frame.common.base.knowledge.AuthMessageEnum;
import com.frame.common.base.model.Param;
import com.frame.common.base.model.Result;
import com.frame.common.base.model.UserInfoDto;
import com.frame.common.base.model.validation.group.DataGroup;
import com.frame.common.base.util.FastJsonUtil;
import com.frame.common.base.util.JwtUtil;
import com.frame.common.web.base.BaseController;
import com.frame.event.LogoutEvent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author ly
 */
@RestController
@Slf4j
@RequestMapping("/api")
@Api(
        value = "登陆权限相关接口",
        tags = "登陆权限相关接口API",
        description = "此API主要用于用户登陆取得TOKEN以及用户退出删除TOKEN,同时在修改权限的时候也要进行退出操作，因为API中的权限控制有缓存，可以通过退出删除缓存"
)
public class LoginController extends BaseController {
    /**
     * 权限接口服务
     */
    @Autowired
    IAuthService authService;


    @Resource
    private ApplicationEventPublisher publisher;

    @ApiOperation(
            value = "用户登陆",
            notes = "用户名和密码登陆验证"
    )
    @PostMapping("/login")
    public Result<TokenDto> login(@RequestBody @Validated Param<AccountDto> qmParam) {

        Subject currentUser = SecurityUtils.getSubject();
        AccountDto accountDto = qmParam.getData();
        TokenDto tokenDto = new TokenDto();
        UsernamePasswordToken token = new UsernamePasswordToken(accountDto.getAccount(), accountDto.getPassword());
        try {
            currentUser.login(token);
        } catch (Exception e) {
            log.error("登陆失败", e);
        }
        //验证是否登录成功
        if (currentUser.isAuthenticated()) {
            log.info("用户[" + accountDto.getAccount() + "]登录认证通过");
            tokenDto.setAccessToken(JwtUtil.getAccessToken(accountDto.getAccount(), accountDto.getTerminal()));
            tokenDto.setRefreshToken(JwtUtil.getRefreshToken(accountDto.getAccount(), accountDto.getTerminal()));

            return this.renderSuccess(tokenDto);
        } else {
            token.clear();
            return this.renderError(AuthMessageEnum.FORBIDDEN_ACCOUNT_ERROR);
        }
    }

    @ApiOperation(value = "用户信息取得", notes = "取得用户信息和权限")
    @PostMapping("/user")
    public Result<UserInfoDto> getUser(@RequestBody Param<String> qmParam) {
        // 如果传入“1”则不传出权限信息
        boolean isNoAuth = qmParam.getData() != null && "1".equals(qmParam.getData());
        String account = this.getCurrentAccount();
        String runAsAccount = this.getRunAsAccount();
        UserInfoDto userInfoDto = authService.getUserAndMenu(account, runAsAccount);
        if (isNoAuth) {
            userInfoDto.setMenuButtons(null);
        }
        if (log.isDebugEnabled()) {
            log.debug("用户信息[{}]", FastJsonUtil.toJson(userInfoDto));
        }

        return this.renderSuccess(userInfoDto);
    }

    @ApiOperation(value = "登出", notes = "用户退出")
    @PostMapping("/logout")
    public Result<Boolean> logout() {

        if (log.isDebugEnabled()) {
            log.debug("用户退出:[{}]", this.getCurrentAccount());
        }
        //发送退出消息
        publisher.publishEvent(new LogoutEvent(this.getAuthId()));

        SecurityUtils.getSubject().logout();

        return this.renderSuccess(Boolean.TRUE);
    }

    @ApiOperation(value = "刷新指令", notes = "刷新指令")
    @PostMapping("/refreshToken")
    public Result<String> refreshToken(@RequestBody @Validated({DataGroup.class}) Param<String> qmParam) {
        String account = this.getCurrentAccount();
        String runAsCount = this.getRunAsAccount();
        String terminal = this.getAccountTerminal();


        String refreshToken = qmParam.getData();
        if (log.isDebugEnabled()) {
            log.debug("刷新账户：[{}], TOKEN:[{}]", account, refreshToken);
        }
        if (JwtUtil.verify(qmParam.getData(), account)) {
            if (StringUtils.isNotEmpty(runAsCount)) {
                //如果是runAs 用户，返回runAs规则的 token
                return this.renderSuccess(JwtUtil.getRunAsAccessToken(account, runAsCount, terminal));
            } else {
                return this.renderSuccess(JwtUtil.getAccessToken(account, terminal));
            }
        } else {
            return this.renderError(AuthMessageEnum.REFRESH_TOKEN_ERROR);

        }
    }


}

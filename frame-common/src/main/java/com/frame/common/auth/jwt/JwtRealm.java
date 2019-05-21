package com.frame.common.auth.jwt;

import com.frame.common.auth.service.IAuthService;
import com.frame.common.base.config.FrameProperties;
import com.frame.common.base.shiro.ShiroUser;
import com.frame.common.base.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.HashSet;
import java.util.Set;

import static com.frame.common.base.constant.CacheConstant.SHIRO_LOGOUT_TOKEN;


/**
 * @author ly
 */
@Slf4j
public class JwtRealm extends AuthorizingRealm {

    @Autowired
    @Lazy
    private IAuthService authService;


    @Autowired
    FrameProperties frameProperties;
    /**
     * 已退出用户列表
     */
    private Cache<String, String> logoutCache;

    @Override
    protected void onInit() {
        super.onInit();
        this.logoutCache = this.getCacheManager().getCache(SHIRO_LOGOUT_TOKEN);

    }

    //判断是否拥有权限的方法
    @Override
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        //@RequiresPermissions是否起作用
        if (this.frameProperties.getAuth().isRequiresPermissions()) {
            ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
            String adminAccount = StringUtils.trimToEmpty(this.frameProperties.getAuth().getAdminAccount());
            if (adminAccount.equals(shiroUser.getAccount())) {
                return true;
            } else {
                return super.isPermitted(principals, permission);

            }
        } else {
            return true;
        }
    }

    /**
     * 本real支持的验证规则
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 检测用户权限，此方法调用hasRole,hasPermission
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (log.isDebugEnabled()) {
            log.debug("JWT 授权");
        }
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        //Permission的权限信息
        Set<String> permissionsList = authService.listPermissions(shiroUser.getAccount());

        //Permission的权限信息
        if (CollectionUtils.isEmpty(permissionsList)) {
            permissionsList = new HashSet<>();
        }
        simpleAuthorizationInfo.setStringPermissions(permissionsList);

        //授权登陆
///        if (StringUtils.isNotEmpty(shiroUser.getRunAsAccount())) {
///            permissionsList = authService.listPermissions(shiroUser.getRunAsAccount());
///            //Permission的权限信息
///            if (CollectionUtils.isNotEmpty(permissionsList)) {
///                simpleAuthorizationInfo.addStringPermissions(permissionsList);
///            }
///        }

        return simpleAuthorizationInfo;
    }

    /**
     * 用户验证。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) {
        if (log.isDebugEnabled()) {
            log.debug("JWT 登陆");
        }
        JwtToken jwtAuth = (JwtToken) auth;
        String token = (String) jwtAuth.getCredentials();

        String account = JwtUtil.getAccount(token);
        String id = JwtUtil.getId(token);
        String terminal = JwtUtil.getTerminal(token);


        ShiroUser shiroUser = authService.getShiroUser(account);
        shiroUser.setTerminal(terminal);
        shiroUser.setJwtId(id);


        String runAsAccount = JwtUtil.getRunAsAccount(token);
        //处理runas
        if (StringUtils.isNotBlank(runAsAccount)) {
            shiroUser.setRunAsAccount(runAsAccount);
        }
        return new SimpleAuthenticationInfo(shiroUser, token, getName());
    }


    @Override
    public String getName() {
        return JwtRealm.class.getName();
    }

    @Override
    public void onLogout(PrincipalCollection principals) {
        if (log.isDebugEnabled()) {
            log.debug("logout clear cache");
        }
        super.clearCachedAuthorizationInfo(principals);
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        removeUserCache(shiroUser.getAccount());
        authService.removeUserInfoCache(shiroUser.getAccount());
        //设置已经退出的用户
        this.logoutCache.put(shiroUser.getJwtId(), "1");
    }

    @Override
    protected Object getAuthorizationCacheKey(PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        return shiroUser.toString() + "_auth";
    }

    /**
     * 清除用户权限缓存
     */
    public void removeUserCache(String account) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection();
        principals.add(account, super.getName());
        super.clearCachedAuthenticationInfo(principals);
    }

}

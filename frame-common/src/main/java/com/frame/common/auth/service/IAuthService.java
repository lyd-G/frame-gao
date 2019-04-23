package com.frame.common.auth.service;


import com.frame.common.auth.dto.PassDto;
import com.frame.common.base.model.UserInfoDto;
import com.frame.common.base.shiro.ShiroUser;

import java.util.Set;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qmgf
 * @since 2018-04-10
 */
public interface IAuthService {

    /**
     * 取得要保存到shiro中的用户信息
     * 包含（id,account，name，organId，organName）
     *
     * @param account 账户信息
     * @return 用户信息
     */
    ShiroUser getShiroUser(String account);


    /**
     * 取得用户的密码信息
     * 包含（password，salt,status）
     *
     * @param account 账户信息
     * @return
     */
    PassDto getAccountInfo(String account);


    /**
     * 取得Permission的权限信息
     *
     * @param account 账户信息
     * @return Shiro Permission权限信息
     */
    Set<String> listPermissions(String account);


    /**
     * 取得用户信息以及权限
     *
     * @param account      账户信息
     * @param runAsAccount 模拟用户
     * @return 用户信息，菜单信息
     */

    UserInfoDto getUserAndMenu(String account, String runAsAccount);

    /**
     * 清除用户信息缓存
     *
     * @param account 账号
     */
    void removeUserInfoCache(String account);


}

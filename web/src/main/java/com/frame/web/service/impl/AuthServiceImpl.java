package com.frame.web.service.impl;

import com.frame.common.auth.dto.AccountDto;
import com.frame.common.auth.dto.PassDto;
import com.frame.common.auth.service.IAuthService;
import com.frame.common.base.config.FrameProperties;
import com.frame.common.base.model.MenuDto;
import com.frame.common.base.model.UserInfoDto;
import com.frame.common.base.shiro.ShiroUser;
import com.frame.web.entity.Users;
import com.frame.web.service.IUsersService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * 权限服务实现类
 * </p>
 *
 * @author ly
 * @since 2018-04-18
 */
@Service
@Slf4j
@Transactional(rollbackFor = {Exception.class, Error.class})
public class AuthServiceImpl implements IAuthService {


    @Autowired
    IUsersService usersService;

    @Autowired
    FrameProperties frameProperties;

    /**
     * 取得要保存到shiro中的用户信息
     * 包含（id,account，name，organId，organName）
     *
     * @param account 账户信息
     * @return 用户信息getUserAndMenu
     */
    @Cacheable(
            value = "AuthServiceImpl",
            key = "#account+ '_shiro_user'",
            condition = " #account != null"
    )
    @Override
    public ShiroUser getShiroUser(String account) {
        ShiroUser shiroUser = new ShiroUser();
        shiroUser.setAccount(account);

        Users user = usersService.getByAccount(account);
        shiroUser.setAuthId(user.getId());
        shiroUser.setName(user.getName());

        return shiroUser;
    }

    /**
     * 取得用户信息
     * 包含（password，salt,status）
     *
     * @param account 账户信息
     * @return
     */
    @Override
    public PassDto getAccountInfo(String account) {

        Users user = usersService.getByAccount(account);

        // 返回账号信息
        PassDto passDto = new AccountDto();
        passDto.setPassword(user.getPassword());
        passDto.setSalt(user.getSalt());
        passDto.setStatus(user.getUsingFlag());
        return passDto;
    }

    @Override
    public Set<String> listPermissions(String account) {
        return usersService.listPermissionsByAccount(account);
    }

    /**
     * 取得用户信息以及权限
     *
     * @param account      账户信息
     * @param runAsAccount 模拟用户
     * @return 用户信息，菜单信息
     */
    @Override
    public UserInfoDto getUserAndMenu(String account, String runAsAccount) {
        // 获取用户信息
        Users user = usersService.getByAccount(account);

        // 查询菜单按钮信息
        String adminAccount = StringUtils.trimToEmpty(frameProperties.getAuth().getAdminAccount());
        List<MenuDto> menuList;
        Map<String, String> titleCNameMap = new HashMap<>();
        Map<String, String> titleENameMap = new HashMap<>();

//        if (adminAccount.equals(account)) {
//            menuList = funcModuleService.listMenusByAdmin(titleCNameMap, titleENameMap);
//        } else {
//            menuList = funcModuleService.listMenusByAccount(account, titleCNameMap, titleENameMap);
//
//        }
        // 返回用户数据
        UserInfoDto userDto = new UserInfoDto();
//        userDto.setMenus(menuList);
        userDto.setTitleCNameMap(titleCNameMap);
        userDto.setTitleENameMap(titleENameMap);
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setAccount(account);
        return userDto;
    }

    /**
     * 清除用户信息缓存
     *
     * @param account 账号
     */
    @Override
    @CacheEvict(
            value = "AuthServiceImpl",
            key = "#account+ '_shiro_user'",
            condition = " #account != null"
    )
    public void removeUserInfoCache(String account) {
        if (log.isDebugEnabled()) {
            log.debug("removeUserInfoCache:[{}] ", account);
        }
    }

}
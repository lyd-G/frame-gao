package com.frame.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.frame.common.auth.shiro.PasswordHash;
import com.frame.common.base.service.impl.BaseServiceImpl;
import com.frame.web.dto.UsersDto;
import com.frame.web.entity.Users;
import com.frame.web.mapper.UsersMapper;
import com.frame.web.service.IUsersService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ly
 * @since 2019-05-08
 */
@Service
@Transactional(rollbackFor = {Exception.class, Error.class})
public class UsersServiceImpl extends BaseServiceImpl<UsersMapper,Users> implements IUsersService {


    private static final int SALT_LENGTH = 6;

    @Autowired
    private PasswordHash passwordHash;
    @Autowired
    UsersMapper baseMapper;


    @Override
    public Users getByAccount(String account) {
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq(Users.ACCOUNT, account);
        Users user = baseMapper.selectOne(wrapper);
        System.out.println(user.getPassword());
        return user;
    }

        @Override
    public Boolean save(UsersDto dto) {
        // 插入数据库
        Users user = new Users();

        this.setEnt(user, dto);

        //密码加密
        String password = dto.getPassword();
        String salt = generateSalt(SALT_LENGTH);
        String encrypedPassword = passwordHash.toHex(password, salt);
        user.setSalt(salt);
        user.setPassword(encrypedPassword);

        return super.save(user);
    }

    @Override
    public Set<String> listPermissionsByAccount(String account) {
        return new HashSet<>();
    }

    public static void main(String[] args) {
        UsersServiceImpl i = new UsersServiceImpl();
        String password = "123456";

        String salt = i.generateSalt(SALT_LENGTH);
        String encrypedPassword = new SimpleHash("MD5", password, "k2oB4E", 1).toHex();
        System.out.println(salt + "---" + encrypedPassword);
        // k2oB4E---8c7904789282730e283fd614a6a41f3a
    }


    private void setEnt(Users user, UsersDto dto) {
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setDescription(dto.getDescription());
        user.setDetails(dto.getDetails());
        user.setMobile(dto.getMobile());
        user.setUsingFlag(dto.getUsingFlag());
        user.setAccount(dto.getAccount());
        user.setRoleId(dto.getRoleId());

        user.setCreateDate(dto.getCreateDate());
        user.setCreateUser(dto.getCreateUser());
        user.setUpdateDate(dto.getUpdateDate());
        user.setUpdateUser(dto.getUpdateUser());
        user.setDeleteFlag(dto.getDeleteFlag());
        user.setVersionNum(dto.getVersionNum());
    }

    /**
     * 生成随机密码盐字符串
     *
     * @param length 长度
     * @return 随机密码盐
     */
    private String generateSalt(int length) {
        //随机字符串的随机字符库
        String keyString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        int len = keyString.length();
        for (int i = 0; i < length; i++) {
            sb.append(keyString.charAt(new Random().nextInt(len - 1)));
        }
        return sb.toString();
    }

}

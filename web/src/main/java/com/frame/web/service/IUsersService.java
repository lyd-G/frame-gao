package com.frame.web.service;

import com.frame.common.base.service.IBaseService;
import com.frame.web.dto.UsersDto;
import com.frame.web.entity.Users;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ly
 * @since 2019-05-08
 */
@Service
public interface IUsersService extends IBaseService<Users> {

    Users getByAccount(String account);

    Boolean save(UsersDto dto);

    Set<String> listPermissionsByAccount(String account);
}

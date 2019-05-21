package com.frame.web.controller;

import com.frame.web.entity.Users;
import com.frame.web.service.IUsersService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ly
 * @since 2019-05-08
 */
@RestController
@Slf4j
@Api(
        tags = "管理接口API",
        description = ""
)
@RequestMapping("/test")
public class UsersController {


    @Autowired
    IUsersService usersService;

    @RequestMapping("/user")
    public String getUser(){
        Users user =usersService.getByAccount("admin");
        System.out.println(user.getSalt()+"--"+user.getPassword());
        return "uuuu";
    }

}


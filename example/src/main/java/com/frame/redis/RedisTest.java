package com.frame.redis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/redis")
public class RedisTest {

    @Autowired
    private RedisUtil ru;

    @GetMapping("/set")
    public String api(@RequestParam String name) {

        ru.setKey("user", name, 60);
        System.out.println(ru.getValue("user"));
        return "name : " + name;
    }


}

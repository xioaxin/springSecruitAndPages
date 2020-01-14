package com.example.demo;

import com.example.demo.Mapper.RolesMapper;
import com.example.demo.Pojo.Roles;
import com.example.demo.Pojo.User;
import com.example.demo.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
//        User user = new User(1, "张三", "男", "长春理工", "12345");
//        userService.insertUser(user);
    }

}

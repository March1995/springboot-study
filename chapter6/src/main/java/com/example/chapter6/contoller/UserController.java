package com.example.chapter6.contoller;

import com.example.chapter6.model.UserBean;
import com.example.chapter6.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author: Kunzite
 * @Date: 2018-09-01 17:21
 **/
@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "register")
    public String register(UserBean user) {
        userService.register(user);
        return "注册成功";
    }
}

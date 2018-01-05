package com.example.sbdemo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @ApiOperation(value="删除图书", notes="根据url的id来指定删除图书")
    @RequestMapping(value="login", method= RequestMethod.GET)
    public String login(){
        return "Hello World";
    }

}

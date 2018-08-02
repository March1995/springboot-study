package com.example.sbdemo.controller;

import com.example.chapter5.property.MyPropertyService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private MyPropertyService propertyService;

    @ApiOperation(value="删除图书", notes="根据url的id来指定删除图书")
    @RequestMapping(value="login", method= RequestMethod.GET)
    public String login(){
        return "Hello World";
    }

    @RequestMapping(value="test", method= RequestMethod.GET)
    private String testService(){
        return propertyService.getInfo();
    }
}

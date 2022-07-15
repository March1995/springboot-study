package com.example.sbdemo.controller;

import com.example.chapter5.property.MyPropertyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Marcher丶
 */
@RestController
public class UserController {

    @Resource
    private MyPropertyService propertyService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "Hello World";
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    private String testService() {
        return propertyService.getInfo();
    }
}

package com.example.chapter6.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author: Kunzite
 * @Date: 2018-09-01 16:46
 **/
@RestController
public class TestController {

    @RequestMapping(value = "/cors")
    public String corsIndex(){
        return "跨域测试";
    }
}

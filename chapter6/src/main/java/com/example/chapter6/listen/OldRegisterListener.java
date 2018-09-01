package com.example.chapter6.listen;

import com.example.chapter6.event.UserRegisterEvent;
import com.example.chapter6.model.UserBean;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 原始方式实现用户注册监听
 *
 * @author: Kunzite
 * @Date: 2018-09-01 17:37
 **/
@Component
public class OldRegisterListener implements ApplicationListener<UserRegisterEvent> {

    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        //获取注册用户对象
        UserBean user = event.getUserBean();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("原始方式实现用户注册监听,注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }
}

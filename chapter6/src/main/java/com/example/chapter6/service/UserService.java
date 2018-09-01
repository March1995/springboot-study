package com.example.chapter6.service;

import com.example.chapter6.event.UserRegisterEvent;
import com.example.chapter6.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 事件发布是由ApplicationContext对象管控的，
 * 我们发布事件前需要注入ApplicationContext对象调用publishEvent方法完成事件发布。
 *
 * @author: Kunzite
 * @Date: 2018-09-01 17:17
 **/
@Service
public class UserService {

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 用户注册
     *
     * @param bean
     */
    public void register(UserBean bean) {
        //注册逻辑

        applicationContext.publishEvent(new UserRegisterEvent(this, bean));
    }
}

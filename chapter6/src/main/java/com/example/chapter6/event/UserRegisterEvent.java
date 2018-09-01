package com.example.chapter6.event;

import com.example.chapter6.model.UserBean;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import javax.annotation.Resource;

/**
 * 在Spring内部中有多种方式实现监听如：@EventListener注解、实现ApplicationListener泛型接口、
 * 实现SmartApplicationListener接口等，我们下面来讲解下这三种方式分别如何实现。
 *
 * @author: Kunzite
 * @Date: 2018-09-01 17:12
 **/
@Getter
public class UserRegisterEvent extends ApplicationEvent {

    private UserBean userBean;

    /**
     * 重写构造函数
     * @param source 发生事件的对象
     * @param bean 注册用户对象
     */
    public UserRegisterEvent(Object source, UserBean bean) {
        super(source);
        this.userBean = bean;
    }
}

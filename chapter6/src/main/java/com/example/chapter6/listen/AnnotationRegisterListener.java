package com.example.chapter6.listen;

import com.example.chapter6.event.UserRegisterEvent;
import com.example.chapter6.model.UserBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 注解方式实现监听
 *
 * <p>
 * 我们只需要让我们的监听类被Spring所管理即可，
 * 在我们用户注册监听实现方法上添加@EventListener注解，该注解会根据方法内配置的事件完成监听
 * </p>
 *
 * @author: Kunzite
 * @Date: 2018-09-01 17:25
 **/
@Component
public class AnnotationRegisterListener {

    /**
     * 注册监听方法
     *
     * @param event 需要监听的事件
     */
    @EventListener
    public void register(UserRegisterEvent event) {
        UserBean user = event.getUserBean();
        System.out.printf("@EventListener注册信息，用户名：" + user.getName() + "，密码：" + user.getPassword());
    }
}

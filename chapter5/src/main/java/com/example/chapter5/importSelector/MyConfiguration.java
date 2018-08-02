package com.example.chapter5.importSelector;

import com.example.chapter5.property.Myproperties;
import com.example.chapter5.property.MyPropertyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author Kunzite
 */
//@Configuration
@EnableConfigurationProperties(Myproperties.class)
public class MyConfiguration {

    @Resource
    private Myproperties properties;

    @Bean(name = "bean2")//创建HelloService实体bean
//    @ConditionalOnMissingBean(MyPropertyService.class)//缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    public MyPropertyService helloService() {
        System.out.println(">>>The MyConfiguration Not Found，Execute Create New Bean2.");
        MyPropertyService helloService = new MyPropertyService();
        helloService.setInfo(properties.getName() + properties.getPhone());//设置消息内容
        helloService.setIsShow(false);//设置是否显示
        return helloService;
    }

}

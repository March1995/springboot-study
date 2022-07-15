package com.example.chapter5.condition;

import com.example.chapter5.property.MyPropertyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kunzite
 */
@Configuration
public class DataSourceConfiguration {


    @Bean(name = "dataSource")//创建HelloService实体bean
    @Conditional(DataSourceConfiguredCondition.class)
    public MyPropertyService mysql() {
        System.out.println(">>>The MyConfiguration Not Found，Execute Create New Bean2.");
        MyPropertyService helloService = new MyPropertyService();
        helloService.setIsShow(false);//设置是否显示
        return helloService;
    }

}

package com.example.chapter5.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kunzite
 * 实现自动化配置(提供实体bean的验证以及初始化)
 * @EnableConfigurationProperties 启动配置类 若无此注解 配置类无法注入spring上下文
 * 根据配置文件 生成bean
 */
@Configuration
@EnableConfigurationProperties(Myproperties.class)
@ConditionalOnClass(MyPropertyService.class)//存在HelloService时初始化该配置类
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "my",//存在配置前缀hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )
public class MyPropertyAutoConfiguration {

    //application.properties配置文件映射前缀实体对象
    @Autowired
    private Myproperties properties;

    /**
     * 根据条件判断不存在HelloService时初始化新bean到SpringIoc
     *
     * @return
     */
    @Bean(name = "bean1")//创建HelloService实体bean
//    @ConditionalOnMissingBean(MyPropertyService.class)//缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    public MyPropertyService helloService() {
        System.out.println(">>>The MyConfiguration Not Found，Execute Create New Bean.");
        MyPropertyService helloService = new MyPropertyService();
        helloService.setInfo(properties.getName() + properties.getPhone());//设置消息内容
        helloService.setIsShow(true);//设置是否显示
        return helloService;
    }
}

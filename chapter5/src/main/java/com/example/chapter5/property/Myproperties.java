package com.example.chapter5.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Kunzite
 * 读取配置文件中的属性 配置类
 */
@ConfigurationProperties(prefix = "my")
public class Myproperties {

    private String name;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

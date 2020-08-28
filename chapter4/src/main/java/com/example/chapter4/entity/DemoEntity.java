package com.example.chapter4.entity;

import com.example.chapter4.validator.FlagValidator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @author Kunzite
 */
public class DemoEntity implements Serializable
{
    @NotBlank(groups = Update.class)
    @Length(min = 2,max = 10)
    private String name;

    @Min(value = 1, groups = Update.class)
    private int age;

    @NotBlank(groups = Save.class)
    @Email
    private String mail;

    @FlagValidator(values = "1,2,3", groups = Update.class)
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 保存的时候校验分组
     */
    public interface Save {
    }

    /**
     * 更新的时候校验分组
     */
    public interface Update {
    }
}

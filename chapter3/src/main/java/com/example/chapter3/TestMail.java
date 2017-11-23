package com.example.chapter3;


import com.example.chapter3.core.MailSender;
import com.example.chapter3.enums.MailContentTypeEnum;

import java.util.ArrayList;


public class TestMail {
    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("jnyuqy@dingtalk.com");
                }})
                .send();
    }
}

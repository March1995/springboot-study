package com.example.chapter5.property;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kunzite
 */
public class MyPropertyService {

    private String info;
    private boolean isShow;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(boolean show) {
        isShow = show;
    }

    public static void main(String[] args) {
        int a = 6721;
        int b = 7013;
        int k = 280436;
        int n = 0;
        do {
            a = b+1;
            b = a+292+7*n;
            n++;
            System.out.println(a);
            System.out.println(b);
            System.out.println(292+7*n);
        } while (a<k);
    }
}

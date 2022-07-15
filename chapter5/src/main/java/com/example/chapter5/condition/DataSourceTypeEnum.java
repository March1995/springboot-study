package com.example.chapter5.condition;

/**
 * Description:
 *
 * @author: Marcher丶
 * @Date: 2022-07-14 10:13
 **/
public enum DataSourceTypeEnum {

    MYSQL("mysql"),
    ORACLE("oracle");

    private String type;

    DataSourceTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

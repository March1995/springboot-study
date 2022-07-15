package com.example.chapter5.condition.properties;

import com.example.chapter5.condition.DataSourceTypeEnum;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author: Marcher丶
 * @Date: 2022-07-06 14:35
 **/
public class DataSourceProperty {

    /**
     * 数据源类型
     */
    private Class<? extends DataSource> type;

    /**
     * 数据库类型 mysql oracle
     */
    private DataSourceTypeEnum dbType;
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public Class<? extends DataSource> getType() {
        return type;
    }

    public void setType(Class<? extends DataSource> type) {
        this.type = type;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DataSourceTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DataSourceTypeEnum dbType) {
        this.dbType = dbType;
    }
}

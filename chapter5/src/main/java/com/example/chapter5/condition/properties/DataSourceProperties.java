package com.example.chapter5.condition.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: Marcher丶
 * @Date: 2022-07-12 14:09
 **/
@ConfigurationProperties(prefix = DataSourceProperties.PREFIX)
public class DataSourceProperties {

    public static final String PREFIX = "spring.sinozur";

    private Map<String, DataSourceProperty> datasource = new LinkedHashMap<>();


    public Map<String, DataSourceProperty> getDatasource() {
        return datasource;
    }

    public void setDatasource(Map<String, DataSourceProperty> datasource) {
        this.datasource = datasource;
    }
}

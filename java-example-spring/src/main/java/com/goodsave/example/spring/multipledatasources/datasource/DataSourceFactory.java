package com.goodsave.example.spring.multipledatasources.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * DataSourceFactory
 * Created by Joker on 2017/7/31.
 */
public class DataSourceFactory {

    private static Map<String, DruidDataSource> dataSourcesPool = new HashMap<>();

    public static DruidDataSource createDataSource(String dataSourceName, String driverClassName, String url, String userName, String passWord) throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        dataSourcesPool.put(dataSourceName, dataSource);
        return dataSource;
    }

    public static DruidDataSource createDataSource(String dataSourceName, Map<?, ?> dataSourceConfig) throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        DruidDataSourceFactory.config(dataSource, dataSourceConfig);
        dataSourcesPool.put(dataSourceName, dataSource);
        return dataSource;
    }

    public static DruidDataSource createDataSource(String dataSourceName, Properties dataSourceConfig) throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        DruidDataSourceFactory.config(dataSource, dataSourceConfig);
        dataSourcesPool.put(dataSourceName, dataSource);
        return dataSource;
    }

    public static DruidDataSource getDataSource(String dataSourceName) {
        return dataSourcesPool.get(dataSourceName);
    }

    public static Map<String, DruidDataSource> getDataSourcesPool() {
        return dataSourcesPool;
    }

    public static void setDataSourcesPool(Map<String, DruidDataSource> dataSourcesPool) {
        DataSourceFactory.dataSourcesPool = dataSourcesPool;
    }


    public static void addDataSource(String dataSourceName, DruidDataSource dataSource) {
        dataSourcesPool.put(dataSourceName, dataSource);
    }
}

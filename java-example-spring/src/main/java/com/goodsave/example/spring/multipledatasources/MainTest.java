package com.goodsave.example.spring.multipledatasources;

import com.alibaba.druid.pool.DruidDataSource;
import com.goodsave.example.spring.multipledatasources.datasource.DataSourceFactory;
import com.goodsave.example.spring.multipledatasources.entity.Auth;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MainTest
 * Created by Joker on 2017/7/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MainTest {

    @Test
    public void testUserRepository() {
        //System.out.println(firstDataSourceUserRepository.findAll().size());
        System.out.println("--->");
    }

    @Test
    public void testGetDataSource() throws Exception {
        DataSourceFactory.createDataSource("minsx", "com.mysql.jdbc.Driver", "jdbc:mysql://123.206.133.24:4858/minsx?useUnicode=true&characterEncoding=utf-8&autoReconnect=true", "wssswcom", "Ss123456");
        DruidDataSource dataSource = DataSourceFactory.getDataSource("minsx");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        /*List<Map<String, Object>> result = jdbcTemplate.queryForList("select * from sys_auth");
        result.get(0).forEach((key, value) -> {
            System.out.print(key + "\t\t");
        });
        System.out.println();
        result.forEach(datas -> {
            datas.forEach((key, value) -> System.out.print(value + "\t\t"));
            System.out.println();
        });*/

        List<Auth> userList = jdbcTemplate.query("select * from sys_auth", (ResultSet rs, int rowNum) -> {
            Auth user = new Auth();
            user.setId(rs.getInt("auth_id"));
            user.setType(rs.getString("type"));
            user.setCategory(rs.getString("category"));
            user.setAuthValue(rs.getString("auth_value"));
            user.setDescription(rs.getString("description"));
            return user;
        });

        userList.forEach(user->System.out.println(user.toString()));

    }

    @Test
    public void testGetDataSourceByMap() throws Exception {
        Map<String, String> config = new HashMap<>();
        config.put("driverClassName", "com.mysql.jdbc.Driver");
        config.put("url", "jdbc:mysql://123.206.133.24:4858/minsx?useUnicode=true&characterEncoding=utf-8&autoReconnect=true");
        config.put("username", "wssswcom");
        config.put("password", "Ss123456");
        config.put("initialSize", "5");
        config.put("minIdle", "5");
        config.put("maxActive", "50");
        config.put("maxWait", "60000");
        config.put("timeBetweenEvictionRunsMillis", "60000");
        config.put("minEvictableIdleTimeMillis", "300000");
        config.put("multiStatementAllow", "true");
        config.put("validationQuery", "SELECT 1");
        config.put("testWhileIdle", "true");
        config.put("testOnBorrow", "false");
        config.put("testOnReturn", "false");
        config.put("poolPreparedStatements", "false");
        config.put("maxPoolPreparedStatementPerConnectionSize", "20");
        DruidDataSource dataSource = DataSourceFactory.createDataSource("minsx", config);
        Connection connection = dataSource.getConnection();
        connection.close();

    }

    public void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }


}

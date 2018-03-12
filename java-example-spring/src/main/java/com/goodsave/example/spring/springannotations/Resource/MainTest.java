package com.goodsave.example.spring.springannotations.Resource;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Description
 * Created by Joker on 2017/8/7.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.springannotations.Resource")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainTest.class)
public class MainTest {

    @Primary
    @Bean(name = "HuangXiaoMing", initMethod = "init")
    public Person HuangXiaoMing() {
        return new Person();
    }

    @Bean(name = "angelababy")
    public Person angelababy() {
        return new Person("angelababy");
    }

    @Autowired
    Person personA;

    @Resource(name = "angelababy")
    Person personB;

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(personA));
        System.out.println(JSON.toJSONString(personB));
    }

}

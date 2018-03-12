package com.goodsave.example.spring.springannotations.qualifier;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description
 * Created by Joker on 2017/8/7.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.springannotations.qualifier")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainTest.class)
public class MainTest {

    @Primary
    @Bean(name = "HuangXiaoMing")
    public Person HuangXiaoMing() {
        return new Star("HuangXiaoMing");
    }

    @Bean(name = "Angelababy")
    public Person angelababy() {
        return new Star("Angelababy");
    }

    @Test
    public void test() {
        System.out.println("over");
    }

    @Autowired
    public Person HuangXiaoMing(@Qualifier("HuangXiaoMing") Person person) {
        System.out.println(JSON.toJSONString(person));
        return person;
    }

    @Autowired
    public Person Angelababy(@Qualifier("Angelababy") Person person) {
         System.out.println(JSON.toJSONString(person));
        return person;
    }

}

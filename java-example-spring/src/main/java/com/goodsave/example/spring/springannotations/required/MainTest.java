package com.goodsave.example.spring.springannotations.required;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description
 * Created by Joker on 2017/8/7.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.springannotations.required")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainTest.class)
public class MainTest {

    @Bean
    public Person getPerson(){
        Person persion = new Person();
        persion.setName("XiaoMing");
        return persion;
    }

    @Autowired
    Person person;

    @Test
    public void test(){
        System.out.println(person.getName());
    }

}

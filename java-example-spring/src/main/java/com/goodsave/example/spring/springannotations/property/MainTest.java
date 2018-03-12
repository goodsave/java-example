package com.goodsave.example.spring.springannotations.property;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description
 * Created by Joker on 2017/8/7.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.springannotations.property")
@PropertySource("classpath:application.properties")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainTest.class)
public class MainTest {


    /*相当于XML中：
    <property name="url">
        <value>springannotations.property.url</value>
    </property>*/
    @Value("${springannotations.property.name}")
    private String name;

    //手动指定属性值
    @Bean
    public com.goodsave.example.spring.springannotations.property.Person getPerson() {
        com.goodsave.example.spring.springannotations.property.Person persion = new com.goodsave.example.spring.springannotations.property.Person();
        persion.setName("XiaoMing");
        return persion;
    }

    @Autowired
    com.goodsave.example.spring.springannotations.property.Person person;

    @Test
    public void test() {
        System.out.println(person.getName());
        System.out.println(name);
    }

}

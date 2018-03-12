package com.goodsave.example.spring.iocf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Main
 * Created by Joker on 2017/8/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.goodsave.example.spring.iocf.AppConfig.class)
public class Main {

    @Component
    public static class Person {
        private String name = "goodsave";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Resource(type = Person.class)
    private Person person;

    @Test
    public void test() {
        System.out.println(person.getName());
        System.out.println(person.getClass().getName());
    }


}

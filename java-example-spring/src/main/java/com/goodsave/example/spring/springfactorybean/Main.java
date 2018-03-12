package com.goodsave.example.spring.springfactorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Main
 * Created by Joker on 2017/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.goodsave.example.spring.springfactorybean.AppConfig.class)
public class Main {

    @Autowired
    ApplicationContext context;

    @Test
    public void test(){

        UserRepository userRepository = context.getBean("userRepository",UserRepository.class);
        System.out.println(userRepository.getUserNameById(1));

        userRepository = context.getBean("userRepositoryB",UserRepository.class);
        System.out.println(userRepository.getUserNameById(1));

        ProxyFactoryBean factoryBean  = context.getBean("&userRepositoryB",ProxyFactoryBean.class);
        System.out.println(((UserRepository)factoryBean.getObject()).getUserNameById(1));

        userRepository = context.getBean("userRepository",UserRepository.class);
        System.out.println(userRepository.getUserNameById(1));

    }

}

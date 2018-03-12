package com.goodsave.example.spring.springfactorybean;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 * Created by Joker on 2017/9/19.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.springfactorybean")
public class AppConfig implements ApplicationContextAware {

    @Bean(name = "userRepository")
    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }

    @Bean(name = "userRepositoryB")
    public ProxyFactoryBean proxyFactoryBean() throws ClassNotFoundException {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(new UserRepositoryImpl());
        proxyFactoryBean.setSingleton(false);
        proxyFactoryBean.setProxyInterfaces(new Class[]{UserRepository.class});
        return proxyFactoryBean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }



}

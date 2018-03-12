package com.goodsave.example.spring.jpatemplateb;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 * Created by web on 2017/7/29.
 */
@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.jpatemplateb")
public class AppConfig implements ApplicationContextAware {

    @Autowired
    RepositoryProxyFactory repositoryFactory;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        registerBeans(applicationContext);
    }

    private void registerBeans(ApplicationContext applicationContext) throws BeansException {
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(getUserRepositoryProxy().getClass());
        defaultListableBeanFactory.registerBeanDefinition("userRepository", beanDefinitionBuilder.getBeanDefinition());
    }

    private UserRepository getUserRepositoryProxy() {
        return repositoryFactory.getProxyByClass(UserRepository.class);
    }

}

package com.goodsave.example.spring.javadynamicproxyb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Config
 * Created by Joker on 2017/9/19.
 */
@Configuration
public class Config {

    @Bean
    public UserRepository getUserRepository() {
        return getProxy(UserRepository.class);
    }

    @SuppressWarnings("unchecked")
	<T> T getProxy(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(ProxyImpl.class.getClassLoader(), new Class<?>[] {clazz}, new ProxyImpl());
    }

    class ProxyImpl implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("执行了方法："+method.getName());
            return "goodsave";
        }
    }
}

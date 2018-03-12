package com.goodsave.example.spring.jpatemplateb;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * RepositoryFactory
 * Created by web on 2017/7/29.
 */
@Service
public class RepositoryProxyFactory implements InvocationHandler, Serializable {

    private static final long serialVersionUID = -7968341347497456950L;

    private final Log LOGGER = LogFactory.getLog(this.getClass());

    @SuppressWarnings("unchecked")
	public <T> T getProxyByClass(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class<?>[]{clazz}, new RepositoryProxyFactory());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        LOGGER.info("开始执行方法:" + method.getName());
        if (method.getReturnType().equals(User.class)) {
            if (method.getAnnotation(com.goodsave.example.spring.jpatemplateb.Query.class) != null&&args.length>0&&args[0].equals("goodsave")) {
                String annotationValue = method.getAnnotation(Query.class).value();
                System.out.println("QUERY SQL:"+annotationValue.replace("?",args[0].toString()));
                result = new User(1,"goodsave","Ss123456","goodsave@qq.com");
            }
        }
        LOGGER.info("方法:" + method.getName() + "处理完毕,开始返回数据");
        return result;
        //return method.invoke(this, args);
    }
}

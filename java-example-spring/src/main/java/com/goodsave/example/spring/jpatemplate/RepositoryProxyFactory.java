package com.goodsave.example.spring.jpatemplate;

import com.alibaba.fastjson.JSON;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */
public class RepositoryProxyFactory implements MethodInterceptor {

    public Object getInstance(Class<?> interfaceClass) {
       /* Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(BaseRepositoryImpl.class);
        enhancer.setCallback(this);
        enhancer.setInterfaces(new Class[]{interfaceClass});
        return enhancer.create();*/
        return Enhancer.create(interfaceClass, this);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("[method name] = "+method.getName());
        System.out.println("[parameter] = "+ JSON.toJSONString(args));

        System.out.println("[before]");
        //result = methodProxy.invokeSuper(obj, args);
        System.out.println("[after]");
        //new User(1,"goodsave","Ss123456","goodsave@qq.com")
        return result;
    }


}

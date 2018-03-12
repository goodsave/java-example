package com.goodsave.example.spring.javadynamicproxy;

/**
 * MyInvocationHandlerImpl
 * Created by Joker on 2017/7/27.
 */

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandlerImpl implements InvocationHandler {

    //private Object target;
    private Transaction transaction = new Transaction();

    public MyInvocationHandlerImpl() {
        super();
        //this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (method.getName().equals("savePerson")
                || method.getName().equals("deletePerson")
                || method.getName().equals("updatePerson")) {
            transaction.openTransaction();
            System.out.println("args="+ JSON.toJSONString(args));
            System.out.println(method.getName());
            //result = method.invoke(target, args);//执行目标对象的目标方法
            transaction.commit();
        } else {
           //result = method.invoke(target, args);
        }
        return result;
    }

}

package com.goodsave.example.spring.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectTest
 * Created by Joker on 2017/8/15.
 */
public class ReflectTest {


    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> personClass = classLoader.loadClass("com.springtest.reflect.Person");
        Constructor<?> constructor = personClass.getDeclaredConstructor((Class[])null);
        //通常一般用反射处理业务时，此处的Person都会采用接口，采用读取JAR包的方式获取指定接口的实现
        Person person = (Person) constructor.newInstance();

        Method say = personClass.getMethod("say",String.class);
        say.invoke(person,"你好！");

        Method sayB = personClass.getMethod("say");
        sayB.invoke(person);
    }



}

package com.goodsave.example.spring.javadynamicproxy;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */

import org.junit.Test;

import java.lang.reflect.Proxy;

public class Main {

    @Test
    public void test() {
        MyInvocationHandlerImpl myInvocationHandlerImpl = new MyInvocationHandlerImpl();
        PersonDao personDao = (PersonDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] { PersonDao.class }, myInvocationHandlerImpl);
        personDao.deletePerson("goodsave");
        System.out.println("--------");
        personDao.savePerson();
        System.out.println("--------");
        personDao.updatePerson();
        System.out.println("--------");
    }
}

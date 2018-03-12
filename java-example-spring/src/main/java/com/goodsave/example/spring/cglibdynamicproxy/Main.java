package com.goodsave.example.spring.cglibdynamicproxy;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */
public class Main {

    public static void main(String[] args) {
        // 下面是用cglib的代理
        // 1.支持实现接口的类
        Account account2 = (Account)new AccountCglibProxyFactory().getInstance(new AccountImpl());
        account2.updateAccount();

        // 2.支持未实现接口的类
        Person person = (Person)new AccountCglibProxyFactory().getInstance(new Person());
        System.out.println(person);
        person.show();
    }
}

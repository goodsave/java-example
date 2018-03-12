package com.goodsave.example.spring.cglibdynamicproxy;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */
public class AccountImpl implements Account {

    @Override
    public void queryAccount() {
        System.out.println("查看账户");
    }

    @Override
    public void updateAccount() {
        System.out.println("修改账户");
    }

}
package com.goodsave.example.spring.javadynamicproxy;

/**
 * 模拟事物类
 * Created by Joker on 2017/7/27.
 */
public class Transaction {
    /**
     * 开启事物
     */
    public void openTransaction() {
        System.out.println("openTransaction");
    }

    /**
     * 提交事物
     */
    public void commit() {
        System.out.println("commit");
    }
}

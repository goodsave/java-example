package com.goodsave.basic.threada;

/**
 * Created by Joker on 2017/6/2.
 */
public class ThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadB is running...");
    }
}

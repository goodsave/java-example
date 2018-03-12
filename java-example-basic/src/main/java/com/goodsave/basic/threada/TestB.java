package com.goodsave.basic.threada;

/**
 * Created by Joker on 2017/6/2.
 */
public class TestB {
    public static void main(String args[]) {
        new Thread(new ThreadB()).start();
    }

}

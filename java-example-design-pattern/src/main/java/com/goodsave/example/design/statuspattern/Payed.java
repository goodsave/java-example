package com.goodsave.example.design.statuspattern;

/**
 * Created by Joker on 2017/5/25.
 */
public class Payed implements State{

    @Override
    public void handle() {
        System.out.println("您已付款！");
    }
}

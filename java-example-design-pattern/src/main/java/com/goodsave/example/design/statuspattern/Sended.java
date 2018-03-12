package com.goodsave.example.design.statuspattern;

/**
 * Created by Joker on 2017/5/25.
 */
public class Sended implements State{

    @Override
    public void handle() {
        System.out.println("已发货！");
    }
}

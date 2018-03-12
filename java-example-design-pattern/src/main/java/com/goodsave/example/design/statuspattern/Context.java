package com.goodsave.example.design.statuspattern;

/**
 * Created by Joker on 2017/5/25.
 */
public class Context {

    private State state;

    public Context() {
    }

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        System.out.println("订单信息已更新！");
        this.state = state;
        this.state.handle();
    }

}

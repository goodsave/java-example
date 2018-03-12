package com.goodsave.example.design.statuspattern;

/**
 * Created by Joker on 2017/5/25.
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new Payed());
        context.setState(new Sended());
        context.setState(new Recieved());

    }


}

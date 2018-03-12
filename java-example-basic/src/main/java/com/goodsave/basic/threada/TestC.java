package com.goodsave.basic.threada;

/**
 * Created by Joker on 2017/6/2.
 */
public class TestC {

    public static void main(String args[]){
        try {
            Object result = new ThreadC().call();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

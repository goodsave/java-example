package com.goodsave.basic.Recursion;

/**
 * Created by Joker on 2017/5/27.
 */
public class Recursion {

    private  static  int i,sum = 0;

    public static void main(String[] args){
        sum();
        System.out.println(sum);

    }

    public static void sum(){
        sum+=i;
        i++;
        if (i<=10){
            sum();
        }
    }




}

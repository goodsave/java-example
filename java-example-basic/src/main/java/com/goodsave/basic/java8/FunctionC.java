package com.goodsave.basic.java8;

import org.junit.Test;

import java.util.function.Function;

/**
 * FunctionC
 * Created by Joker on 2017/8/22.
 */
public class FunctionC {

    @Test
    public void test(){
        System.out.println(add(3,a->a+2,a->a*2));
    }

    public Integer add(Integer a,Function<Integer, Integer> functionA,Function<Integer, Integer> functionB){
        return functionA.andThen(functionB).apply(a);
    }



}

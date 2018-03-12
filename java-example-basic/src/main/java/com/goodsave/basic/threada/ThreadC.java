package com.goodsave.basic.threada;

import java.util.concurrent.Callable;

/**
 * Created by Joker on 2017/6/2.
 */
public class ThreadC implements Callable<Object>{
    @Override
    public Object call() throws Exception {
        System.out.println("calculating 1+1 ....");
        return 1+1;
    }
}

package com.goodsave.basic.threada;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadE
 * Created by Joker on 2017/8/23.
 */
public class ThreadE {

    private static Integer value = 0;

    public static synchronized void add() {
        value++;
        System.out.println(value);
    }

    @Test
    public void test() {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.submit(ThreadE::add);
        add();
    }


}

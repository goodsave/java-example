package com.goodsave.basic.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FixedThreadPool
 * Created by web on 2017/7/25.
 */
public class FixedThreadPool {

    public static void main(String args[]) throws Exception {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        fixedThreadPool.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("-----------");
        fixedThreadPool.shutdownNow();


    }

}

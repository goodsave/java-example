package com.goodsave.basic.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadPool
 * Created by web on 2017/7/25.
 */
public class SingleThreadPool {

    public static void main(String args[]) {

        ExecutorService cachedThreadPool = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int index = i;
            cachedThreadPool.execute(() -> {
                System.out.println("--->" + index);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("-----------");

    }
}

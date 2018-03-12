package com.goodsave.basic.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ScheduledThreadPool
 * Created by web on 2017/7/25.
 */
public class ScheduledThreadPool {

    public static void main(String args[]) {

        ExecutorService cachedThreadPool = Executors.newScheduledThreadPool(3);

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

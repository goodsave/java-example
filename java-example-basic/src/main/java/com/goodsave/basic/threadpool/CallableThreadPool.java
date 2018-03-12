package com.goodsave.basic.threadpool;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * CallableThreadPool
 * Created by Joker on 2017/8/8.
 */
public class CallableThreadPool {

    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    @Test
    public void test() throws ExecutionException, InterruptedException {
        Future<Object> result = cachedThreadPool.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("[A]--->" + i);
                    Thread.sleep(1000);
                }
                return "over";
            }
        });
        System.out.println(result.get().toString());
    }


}

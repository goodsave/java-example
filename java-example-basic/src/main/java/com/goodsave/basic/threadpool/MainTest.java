package com.goodsave.basic.threadpool;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * MainTest
 * Created by Joker on 2017/8/8.
 */
public class MainTest {

    private ExecutorService pool = Executors.newCachedThreadPool();

    @Test
    public void test() {
        Set<Future<Object>> tasks = new HashSet<>();

        tasks.add(pool.submit(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("[A]--->" + i);
                Thread.sleep(1000);
            }
            return "A is over";
        }));

        System.out.println("<------------------>");

        tasks.add(pool.submit(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("[B]--->" + i);
                Thread.sleep(1000);
            }
            return "B is over";
        }));

        System.out.println("<------------------>");

        tasks.forEach(task -> {
            try {
                System.out.println(task.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


    }

}

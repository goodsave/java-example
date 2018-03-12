package com.goodsave.basic.map;

import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * HashMapA
 * HashMap是一个最常用的Map，它根据键的hashCode值存储数据，根据键可以直接获取它的值，具有很快的访问速度。
 * HashMap最多只允许一条记录的键为null，不允许多条记录的值为null。HashMap不支持线程的同步，
 * 即任一时刻可以有多个线程同时写HashMap，可能会导致数据的不一致。如果需要同步，
 * 可以用Collections.synchronizedMap(HashMapA map)方法使HashMap具有同步的能力。
 * Created by Joker on 2017/8/24.
 */
public class HashMapA {

    private Map<String, String> map = new java.util.HashMap<>();

    @Test
    public void test() throws InterruptedException {
        //HashMap多线程,线程不安全,此处使用Collections.synchronizedMap使HashMap具有同步能力
        Collections.synchronizedMap(map);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> map.put(null, null));
        executorService.submit(() -> map.put("1", "A"));
        executorService.submit(() -> map.put("2", "B"));
        Thread.sleep(1000);
        for (Map.Entry<String, String> key : map.entrySet()) {
            System.out.println(String.format("[key]=%s\t[value]=%s", key.getKey(), key.getValue()));
        }
    }


}



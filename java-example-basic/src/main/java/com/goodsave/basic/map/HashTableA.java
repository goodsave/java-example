package com.goodsave.basic.map;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * HashTableA
 * Hashtable与HashMap类似，不同的是：它不允许记录的键或者值为空；它支持线程的同步，
 * 即任一时刻只有一个线程能写Hashtable，然而，这也导致了Hashtable在写入时会比较慢
 * Created by Joker on 2017/8/24.
 */
public class HashTableA {

    @Test
    public void test() throws InterruptedException {

        //Hashtable本身就是同步机制,所以比较慢
        Map<String, Object> map = new Hashtable<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        //executorService.execute(() -> map.put(null, null));
        executorService.execute(() -> map.put("1", "A"));
        executorService.execute(() -> map.put("2", "B"));
        Thread.sleep(1000);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> keyValue = it.next();
            System.out.println(String.format("[key]=%s\t[value]=%s", keyValue.getKey(), keyValue.getValue()));
        }

    }

}

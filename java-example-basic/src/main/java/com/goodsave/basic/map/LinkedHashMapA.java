package com.goodsave.basic.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * LinkedHashMapA
 * LinkedHashMap保存了记录的插入顺序，在用Iteraor遍历LinkedHashMap时，
 * 先得到的记录肯定是先插入的。在遍历的时候会比HashMap慢。有HashMap的全部特性。
 * Created by Joker on 2017/8/24.
 */
public class LinkedHashMapA {

    @Test
    public void test() throws InterruptedException {

        //多线程,线程不安全
        Map<String, Object> map = new LinkedHashMap<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            map.put(null, null);
            map.put("1", "A");
            map.put("2", "B");
            map.put("3", "C");
            map.put("4", "D");
            map.put("5", "E");
        });
        Thread.sleep(1000);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> keyValue = it.next();
            System.out.println(String.format("[key]=%s\t[value]=%s", keyValue.getKey(), keyValue.getValue()));
        }

    }

}

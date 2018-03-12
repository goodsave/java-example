package com.goodsave.basic.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TreeMapA
 * TreeMap能够把它保存的记录根据键排序，默认是按升序排序，也可以指定排序的比较器。
 * 当用Iteraor遍历TreeMap时，得到的记录是排过序的。TreeMap的键和值都不能为空。
 * TreeMap取出来的是排序后的键值对。但如果您要按自然顺序或自定义顺序遍历键，那么TreeMap会更好。
 * Created by Joker on 2017/8/24.
 */
public class TreeMapA {

    @Test
    public void test() throws InterruptedException {
        //多线程,线程不安全
        Map<String, Object> map = new TreeMap<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            //map.put(null, null);
            map.put("4", "D");
            map.put("2", "B");
            map.put("3", "C");
            map.put("5", "E");
            map.put("1", "A");
        });
        Thread.sleep(1000);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> keyValue = it.next();
            System.out.println(String.format("[key]=%s\t[value]=%s", keyValue.getKey(), keyValue.getValue()));
        }
    }

}

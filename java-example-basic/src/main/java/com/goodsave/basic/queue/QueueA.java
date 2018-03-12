package com.goodsave.basic.queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QueueA
 * Created by Joker on 2017/8/24.
 */
public class QueueA {

    @Test
    public void test(){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            queue.add(i);
        }
        System.out.println(queue.element());//取第一个元素
        System.out.println(queue.poll());//取第一个元素并删除
        System.out.println(queue.peek());//取第一个元素
    }


}

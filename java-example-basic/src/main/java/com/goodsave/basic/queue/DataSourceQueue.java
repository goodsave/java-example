package com.goodsave.basic.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * DataSourceQueue
 * Created by Joker on 2017/8/24.
 */
public class DataSourceQueue {

    private static Queue<String> queue = new LinkedList<>();

    public void use(String dataSourceName){
        if (queue.size()==2) {
            queue.offer(dataSourceName);
            queue.poll();
        }else{
            queue.offer(dataSourceName);
        }
        System.out.println("you are using "+dataSourceName);
    }

    public String getLast(){
        return queue.peek();
    }

}

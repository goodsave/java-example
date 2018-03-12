package com.goodsave.basic.queue;

import org.junit.Test;

/**
 * QueueB
 * Created by Joker on 2017/8/24.
 */
public class QueueB {

    DataSourceQueue dataSourceQueue = new DataSourceQueue();

    @Test
    public void test() {
        System.out.println(dataSourceQueue.getLast());
        dataSourceQueue.use("SQL Server");
        System.out.println(dataSourceQueue.getLast());
        dataSourceQueue.use("Mysql");
        System.out.println(dataSourceQueue.getLast());
        dataSourceQueue.use("Redis");
        System.out.println(dataSourceQueue.getLast());
    }




}

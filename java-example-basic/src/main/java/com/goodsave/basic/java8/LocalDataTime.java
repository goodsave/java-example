package com.goodsave.basic.java8;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * Description
 * Created by Joker on 2017/8/15.
 */
public class LocalDataTime {

    @Test
    public void test(){
        LocalDateTime ss = LocalDateTime.now();
        ss=ss.withHour(8);
        System.out.println(ss);
    }

}

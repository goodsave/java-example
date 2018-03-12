package com.goodsave.basic.io;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * StringBuilderAndBuffer
 * StringBuilder相比较StringBuffer有更快的速度,但是线程不安全的,而StringBuffer是线程安全的
 * Created by Joker on 2017/8/25.
 */
public class StringBuilderAndBuffer {

    @Test
    public void test() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {
                stringBuilder.append("1");
                Thread.sleep(2);
                stringBuilder.append("2");
                stringBuilder.append("3");
            } catch (InterruptedException e) {
            }
        });
        executorService.execute(() -> {
            try {
                stringBuilder.append("a");
                stringBuilder.append("b");
                Thread.sleep(1);
                stringBuilder.append("c");
            } catch (InterruptedException e) {
            }
        });
        Thread.sleep(1);
        System.out.println("stringBuilder=" + stringBuilder.toString());

        executorService.execute(() -> {
            try {
                stringBuffer.append("1");
                Thread.sleep(2);
                stringBuffer.append("2");
                stringBuffer.append("3");
            } catch (InterruptedException e) {
            }
        });
        executorService.execute(() -> {
            try {
                stringBuffer.append("a");
                stringBuffer.append("b");
                Thread.sleep(1);
                stringBuffer.append("c");
            } catch (InterruptedException e) {
            }
        });
        Thread.sleep(1);
        System.out.println("stringBuffer=" + stringBuffer.toString());

    }


}

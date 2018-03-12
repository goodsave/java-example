package com.goodsave.basic.java8;

import org.junit.Test;

/**
 * Lambda Test
 * Created by Joker on 2017/8/8.
 */
public class LambdaD {

    static class Math implements Executor {

        private Executor executor;

        public Math(Executor executor) {
            this.executor = executor;
        }

        @Override
        public Object execute(Integer... args) {
            return this.executor.execute(args);
        }
    }

    interface Executor {
        Object execute(Integer... args);
    }


    @Test
    public void test() {

        Math math = new Math(args -> {
            Integer sum = 0;
            for (Integer arg : args) {
                sum += arg;
            }
            return sum;
        });

        System.out.println(math.execute(1, 2, 3, 4));


    }


}

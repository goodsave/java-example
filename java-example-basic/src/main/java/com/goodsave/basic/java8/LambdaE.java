package com.goodsave.basic.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Lambda Test
 * Created by Joker on 2017/8/8.
 */
public class LambdaE {

    class CustomerList<T>{
        List<T> listData = new ArrayList<>();

        void add(T t) {
            listData.add(t);
        }

        void forEach(Executor<? super T> action) {
            Objects.requireNonNull(action);
            for (T t : listData) {
                action.runAction(t);
            }
        }
    }

    interface Executor<T> {
        void runAction(T t);
    }


    @Test
    public void test(){
        CustomerList<String> aaa = new CustomerList<String>();
        aaa.add("WuYiFan");
        aaa.add("TFBoys");
        aaa.add("Angelababy");
        aaa.forEach(a->{System.out.println(a);});
    }


}

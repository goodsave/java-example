package com.goodsave.basic.asserta;

import org.junit.Test;

/**
 * AssertA
 * Created by Joker on 2017/8/25.
 */
public class AssertA {

    @Test
    public void test() {
        Integer a = null;
        if (String.valueOf(1).equals("2")) {
            a=1;
        }
        assert a != null;
        System.out.println("a is not null");
    }

}

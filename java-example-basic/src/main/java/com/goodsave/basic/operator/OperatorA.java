package com.goodsave.basic.operator;

import org.junit.Test;

/**
 * OperatorA
 * 准确的说法是每个数位上对应的两数差的绝对值。如0100和1011。
 * 右往左数第一位，|0-1|=1为异或值右往左数第一位。
 * 右往左数第二位，|0-1|=1为异或值右往左数第二位。
 * 右往左数第三位，|1-0|=1为异或值右往左数第三位。
 * 右往左数第四位，|0-1|=1为异或值右往左数第四位。
 * 其实只要你理解什么是异或就好做这类题目得多。
 * 异或是一个判定是否不同的值。
 * 在2进制中，
 * 同一位置所对应数值不同，则异或输出的判定值为真——“1”
 * 如果对应数值相同，则异或输出判定值为假——“0”
 * Created by Joker on 2017/8/24.
 */
public class OperatorA {

    @Test
    public void test() {
        System.out.println(100 ^ 200);
        //10000111110101 --->对应10进制8693
        // 1001011111010 --->对应10进制4858
        //11001100001111 --->对应10进制13071
        System.out.println(8693 ^ 4858);

        System.out.println(Integer.toBinaryString(4858));
        System.out.println(Integer.valueOf("11001100001111",2));
    }


}

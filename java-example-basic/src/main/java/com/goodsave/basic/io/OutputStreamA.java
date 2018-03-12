package com.goodsave.basic.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * OutputStreamA
 * Created by Joker on 2017/8/25.
 */
public class OutputStreamA {

    @Test
    public void test() throws Exception {
        OutputStream outputStream = new FileOutputStream("E:\\document\\测试文档\\a.txt");
        String value = "good";
        byte[] bytes = value.getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }


}

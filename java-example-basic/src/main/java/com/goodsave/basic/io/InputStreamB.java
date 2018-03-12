package com.goodsave.basic.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * InputStreamB
 * 按照给定字节分段读取文件
 * Created by Joker on 2017/8/25.
 */
public class InputStreamB {


    @Test
    public void test() throws Exception {
        InputStream inputStream = new FileInputStream("E:\\document\\Txt文档\\ARIA表顺序.txt");
        StringBuilder stringBuffer = new StringBuilder();
        byte[] bytes = new byte[10240];
        int length;
        while ((length = inputStream.read(bytes))!=-1){
            stringBuffer.append(new String(bytes, 0, length));
        }
        System.out.println(stringBuffer.toString());
        inputStream.close();
    }


}

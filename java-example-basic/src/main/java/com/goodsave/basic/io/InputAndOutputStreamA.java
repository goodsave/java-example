package com.goodsave.basic.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * InputAndOutputStreamA
 * Created by Joker on 2017/8/25.
 */
public class InputAndOutputStreamA {

    @Test
    public void test() throws Exception {
        InputStream inputStream = new FileInputStream("E:\\document\\测试文档\\Spring文档.txt");
        OutputStream outputStream = new FileOutputStream("E:\\document\\测试文档\\Spring文档BAK.txt");
        byte[] bytes = new byte[1024];
        Integer length = 0;
        while ((length=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }
        inputStream.close();
        outputStream.close();
    }

}

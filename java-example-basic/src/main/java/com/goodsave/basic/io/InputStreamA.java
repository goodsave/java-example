package com.goodsave.basic.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * InputStreamA
 * Created by Joker on 2017/8/24.
 */
public class InputStreamA {

    @Test
    public void test() throws Exception {
        InputStream inputStream = getClass().getResourceAsStream("/txt/a.txt");
        System.out.println(inputStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder content = new StringBuilder();
        String lineString;
        while ((lineString = bufferedReader.readLine()) != null) {
            content.append(System.lineSeparator()).append(lineString);
        }
        System.out.println(content.toString());
        inputStream.close();

    }

}

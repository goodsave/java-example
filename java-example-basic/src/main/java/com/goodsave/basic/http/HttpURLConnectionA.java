package com.goodsave.basic.http;

import org.junit.Test;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Description
 * Created by Joker on 2017/8/24.
 */
public class HttpURLConnectionA {

    @Test
    public void test() throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL("http://m.fangliaoyun.com").openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Maxthon;)");
        conn.setRequestProperty("Accept-Encoding", "gzip");
        conn.setRequestProperty("referer", "http://www.xxxxxxxxxx.com");
        conn.setRequestProperty("cookie", "232131");
        InputStream inputStream = conn.getInputStream();
        StringBuffer out = new StringBuffer();
        byte[] bytes = new byte[4096];
        int length = -1;
        while ((length = inputStream.read(bytes)) != -1) {
            out.append(new String(bytes, 0, length));
        }
        inputStream.close();

        System.out.println(out.toString());

    }
}

package com.goodsave.basic.http;

/**
 * Description
 * Created by Joker on 2017/8/24.
 */

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class RemoteServerClientImpl {

    private static final String DEFAULT_ENCODE = "UTF-8";

    private static final String APPLICATION_JSON = "application/json";

    @Test
    public void testPost() throws IOException {
        String ip = "冰箱冰箱冰箱冰箱冰箱冰箱冰箱";
        // 创建HttpClientBuilder
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        // HttpClient
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        // 请求参数
        StringEntity entity = new StringEntity("", DEFAULT_ENCODE);
        entity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
        HttpPost httpPost = new HttpPost("https://m.fangliaoyun.com");
        httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
        //此处区别PC终端类型
        httpPost.addHeader("typeFlg", "9");
        //此处增加浏览器端访问IP
        httpPost.addHeader("x-forwarded-for", ip);
        httpPost.addHeader("Proxy-Client-IP", ip);
        httpPost.addHeader("WL-Proxy-Client-IP", ip);
        httpPost.addHeader("HTTP_CLIENT_IP", ip);
        httpPost.addHeader("X-Real-IP", ip);
        httpPost.addHeader("Host", ip);
        httpPost.setEntity(entity);
        httpPost.setConfig(RequestConfig.DEFAULT);

        HttpResponse httpResponse;
        // post请求
        httpResponse = closeableHttpClient.execute(httpPost);
        HttpEntity httpEntity = httpResponse.getEntity();
        System.out.println(httpEntity.getContent());
        //释放资源
        closeableHttpClient.close();
    }

}

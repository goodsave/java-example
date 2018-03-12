package com.goodsave.basic.jarload;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Main
 * Created by Joker on 2017/8/16.
 */
public class Main {
    @Test
    public void test() throws Exception {

        URL url = new URL("file:E:/JavaJars/OtherJar/runner.jar");
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url}, Thread.currentThread().getContextClassLoader());
        Class<?> clazz = urlClassLoader.loadClass("com.example.Runner");
        //Runnable runnable = (Runnable) clazz.newInstance();
        //runnable.run();
        Method method = clazz.getMethod("run");
        method.invoke(clazz.newInstance());
        urlClassLoader.close();

    }
}


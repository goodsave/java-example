package com.goodsave.example.spring.aopb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.aopb")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}

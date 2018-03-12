package com.goodsave.example.spring.aopannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.minsx.spring.aopannotation")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}

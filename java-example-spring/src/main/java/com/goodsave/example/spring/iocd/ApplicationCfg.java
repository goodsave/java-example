package com.goodsave.example.spring.iocd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.iocd")
public class ApplicationCfg {
	@Bean
	public User getUser() {
		return new User("蔡依林");
	}
}

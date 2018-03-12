package com.goodsave.example.spring.ioce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.goodsave.example.spring.ioce")
public class AppConfig {

	@Bean(name = "StudentDao")
	public StudentDao getStudentDao() {
		return new StudentImpl();
	}

}

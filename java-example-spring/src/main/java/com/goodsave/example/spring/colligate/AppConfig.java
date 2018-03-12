package com.goodsave.example.spring.colligate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= "com.goodsave.example.spring.colligate")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AppConfig {
	
	@Bean
	public CalculationDao getCalculation() {
		return new CalculationImpl();
	}

}

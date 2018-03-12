package com.goodsave.example.spring.iocb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	@SuppressWarnings("resource")
	public void testStoreBook() {
		// 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/goodsave/example/spring/iocb/IOCBeans.xml");
		BookService bookservice = ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第二版》");
	}
}

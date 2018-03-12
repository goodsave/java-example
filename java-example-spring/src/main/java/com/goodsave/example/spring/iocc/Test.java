package com.goodsave.example.spring.iocc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Test {
	@org.junit.Test
	
	public void testStoreBook() {
		// 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/goodsave/example/spring/iocc/IOCBeans.xml");
		BookService bookservice = ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第三版》");
	}
}

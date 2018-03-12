package com.goodsave.example.spring.ioca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookService {
	IBookDAO bookDAO;
	
	 @SuppressWarnings("resource")
	public BookService() {
		// 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/goodsave/example/spring/ioca/IOCBeans.xml");
		// 从容器中获得id为bookdao的bean
		bookDAO = (IBookDAO) ctx.getBean("bookdao");
	}

	public void storeBook(String bookname) {
		System.out.println("图书上货");
		String result = bookDAO.addBook(bookname);
		System.out.println(result);
	}
}

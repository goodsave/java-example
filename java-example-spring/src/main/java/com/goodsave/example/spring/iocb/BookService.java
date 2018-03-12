package com.goodsave.example.spring.iocb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BookService {
	IBookDAO bookDAO;
	@SuppressWarnings("resource")
	public void storeBook(String bookname) {
		// 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/goodsave/example/spring/iocb/IOCBeans.xml");
		// 从容器中获得id为bookdao的bean
		bookDAO = (IBookDAO) ctx.getBean("bookdaoObj");
		System.out.println("图书上货");
		String result = bookDAO.addBook(bookname);
		System.out.println(result);
	}
}

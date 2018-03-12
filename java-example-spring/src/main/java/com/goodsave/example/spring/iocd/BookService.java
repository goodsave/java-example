package com.goodsave.example.spring.iocd;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
	@Resource
	IBookDAO bookDAO;

	 public void storeBook(String bookname){
        System.out.println("图书上货");
        String result=bookDAO.addBook(bookname);
        System.out.println(result);
     }
}

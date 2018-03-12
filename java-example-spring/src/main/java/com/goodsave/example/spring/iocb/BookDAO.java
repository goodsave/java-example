package com.goodsave.example.spring.iocb;

import org.springframework.stereotype.Component;

@Component("bookdaoObj")
public class BookDAO implements IBookDAO {
	public String addBook(String bookname) {
		return "添加图书" + bookname + "成功！";
	}
}

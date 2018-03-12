package com.goodsave.example.spring.iocc;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO implements IBookDAO {
	public String addBook(String bookname) {
		return "添加图书" + bookname + "成功！";
	}
}

package com.goodsave.example.spring.ioce;

public class StudentImpl implements StudentDao{

	@Override
	public void say(String something) {
		System.out.println("A says "+something);
	}

}

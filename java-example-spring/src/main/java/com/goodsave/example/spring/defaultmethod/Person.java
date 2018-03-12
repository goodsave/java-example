package com.goodsave.example.spring.defaultmethod;

public class Person implements Student,Teacher{

	@Override
	public void say(String what) {
		Teacher.super.say(what);
	}

}

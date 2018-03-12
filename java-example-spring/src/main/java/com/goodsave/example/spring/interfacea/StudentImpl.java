package com.goodsave.example.spring.interfacea;

public class StudentImpl implements Student{

	@Override
	public void say(String what) {
		System.out.println("A says "+what);
	}

	@Override
	public void goSchool() {
		System.out.println("A go to school");
	}

}

package com.goodsave.example.spring.defaultmethod;

public interface Teacher {
	
	default void say(String what){
		System.out.println("Teacher say "+what);
	}
	
	default void doWhat(String what){
		System.out.println("Teacher do "+what);
	}

}

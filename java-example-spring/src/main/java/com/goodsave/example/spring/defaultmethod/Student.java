package com.goodsave.example.spring.defaultmethod;

public interface Student {
	default void say(String what){
	      System.out.println("Student say "+what);
	}
}

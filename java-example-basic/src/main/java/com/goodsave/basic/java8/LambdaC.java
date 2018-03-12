package com.goodsave.basic.java8;

import java.util.function.Consumer;


public class LambdaC {
	
	public static void main(String[] args) {
		
		Person persion = new Person("王大路", 11);
		operation(persion,(Person per) ->{System.out.println(per.getName());});
	}
	
	public static <T>  void  operation(T t,Consumer<T> consumer) {
		consumer.accept(t);
	}

}

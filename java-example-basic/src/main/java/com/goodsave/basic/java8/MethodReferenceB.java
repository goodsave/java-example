package com.goodsave.basic.java8;

public class MethodReferenceB {
	
	public static void main(String[] args) {
		Object aaa = 8693;
		test(aaa, String::valueOf);
	}
	
	interface Operation {
		String toString(String what);
	}
	
	public static void test(Object what,Operation operation) {
		System.out.println(what.toString());
	}

}

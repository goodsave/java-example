package com.goodsave.basic.java8;

public class MethodReference {

	public static void main(String[] args) {
		test("Jhon is a ","student",MethodReference::connectStrings);
	}

	public static String connectStrings(String A,String B) {
		return A+B;
	}

	interface Operation {
		Object operate(String A, String B);
	}

	public static void test(String A,String B,Operation operation) {
		Object aaa = operation.operate(A,B);
		System.out.println(aaa);
	}
	
	
}

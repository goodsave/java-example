package com.goodsave.basic.java8;

public class LambdaA {

	public static void main(String[] args) {
		test(1, 2, (int a, int b) -> www(a, b));
	}

	public static int www(int aaa, int bbb) {
		return aaa + bbb;
	}

	interface Operation {
		Object operate(int a, int b);
	}

	public static void test(int A, int B, Operation operation) {
		Object aaa = operation.operate(A, B);
		System.out.println(aaa);
	}
}



package com.goodsave.example.spring.reflect;

@SuppressWarnings("unused")
public class Person {
	public String name = "aaa";
	private int age = 31;
	private static int pwd = 123;

	public Person() {
		System.out.println("Person的无参的构造函数");
	}

	public Person(String name) {
		System.out.println("Person的有参的构造函数，name: " + name);
	}

	public Person(String name, int pwd, int age) {
		System.out.println(name + "," + pwd + "，" + age);
	}

	private Person(int age, String name) {
		System.out.println(name + "," + age);
	}

	public void say() {
		System.out.println("say...");
	}

	public void say(String name) {
		System.out.println("say :" + name);
	}

	private void says(String name) {
		System.out.println("says:" + name);
	}

	public static void sayss() {
		System.out.println("这是个静态的方法");
	}
}

package com.goodsave.example.spring.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	// 反射public Star()构造函数
	
	@Test
	public void test1() throws Exception {
		/*Class<?> clazz = Class.forName("com.springtest.reflect.Person");// 反射类
		Constructor<?> c = clazz.getConstructor(null);// 反射构造函数
		Person pp = (Person) c.newInstance(null);// 创建对象
		System.out.println(pp.name);*/
	}

	// 反射public Star(String name)构造函数
	@Test // JUnit测试
	public void test2() throws Exception {
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");// 反射类
		Constructor<?> c = clazz.getConstructor(String.class);
		Person pp = (Person) c.newInstance("XXXXXXXX");
		System.out.println(pp.name);
	}

	// 反射public Star(String name,int pwd,int age)构造函数
	@Test
	public void test3() throws Exception {
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");// 反射类
		Constructor<?> c = clazz.getConstructor(String.class, int.class, int.class);
		Person pp = (Person) c.newInstance("XXXXXXXX", 123456, 30);
		System.out.println(pp.name);
	}

	// 反射private Star(int age,String name)构造函数
	@Test
	public void test4() throws Exception {
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");// 反射类
		Constructor<?> c = clazz.getDeclaredConstructor(int.class, String.class);// 反射私有的构造函数
		c.setAccessible(true);// 强暴执行
		Person pp = (Person) c.newInstance(30, "XXXXXXXX");// 实例化对象
		System.out.println(pp.name);
	}

	// 反射public void say()方法
	@Test
	public void test5() throws Exception {
		/*Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Method mm = clazz.getMethod("say", null);// 反射方法
		mm.invoke(pp, null);// 执行方法
*/	}

	// 反射public void say(String name)方法
	@Test
	public void test6() throws Exception {
		Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Method mm = clazz.getMethod("say", String.class);
		mm.invoke(pp, "XXXXXX");
	}

	// 反射private void says(String name)方法
	@Test
	public void test7() throws Exception {
		Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Method mm = clazz.getDeclaredMethod("say", String.class);
		mm.setAccessible(true);
		mm.invoke(pp, "XXXXXX");
	}

	// 反射public static void sayss()方法
	@Test
	public void test8() throws Exception {
		/*Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Method mm = clazz.getMethod("sayss", null);
		mm.invoke(null, null);*/
	}

	// 反射public String name="aaa";
	@Test
	public void test9() throws Exception {
		Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Field fl = clazz.getField("name");// 反射字段名称
		System.out.println(fl.get(pp));
	}

	// 反射private int age=31;
	@Test
	public void test10() throws Exception {
		Person pp = new Person();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Field fl = clazz.getDeclaredField("age");// 反射私有字段名称
		fl.setAccessible(true);// 强制执行
		System.out.println(fl.get(pp));
	}

	// 反射private static int pwd=123;
	@Test
	public void test11() throws Exception {
		// Star pp=new Star();
		Class<?> clazz = Class.forName("com.springtest.reflect.Person");
		Field fl = clazz.getDeclaredField("pwd");
		fl.setAccessible(true);// 强制执行
		System.out.println(fl.get(null));// static静态的字段，这里可以field.get(null)
	}

}

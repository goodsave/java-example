package com.goodsave.basic.quote;

/**
 * 引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象；
 * String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象
 * @Author Joker
 * @Date 2017年11月1日
 */
public class RefenceQuote {
	
	public static void main(String[] args) {
		RefenceQuote valueQuote = new RefenceQuote();
		
		Student student = new Student();
		System.out.println("AAA = " + valueQuote.AAA(student));
		System.out.println("aaa = " + student.age);
	}

	public int AAA(Student student) {
		student.age = student.age + 1;
		return student.age;
	}

}

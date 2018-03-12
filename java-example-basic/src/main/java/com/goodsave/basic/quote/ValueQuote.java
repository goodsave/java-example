package com.goodsave.basic.quote;

/**
 * 基本数据类型传值，对形参的修改不会影响实参
 * @Author Joker
 * @Date 2017年11月1日
 */
public class ValueQuote {

	public static void main(String[] args) {
		ValueQuote valueQuote = new ValueQuote();
		
		int aaa = 100;
		System.out.println("AAA = " + valueQuote.AAA(aaa));
		System.out.println("aaa = " + aaa);
	}

	public int AAA(int value) {
		value = value + 1;
		return value;
	}

}

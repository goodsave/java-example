package com.goodsave.example.spring.annotationb;


import org.junit.Test;

public class Main {

	@Test
	public void test() {
		CalculationDao calculat = new CalculationImpl();
		int value = calculat.sum(5, 3);
		System.out.println(value);
		
	}
}

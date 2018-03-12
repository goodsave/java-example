package com.goodsave.example.spring.annotationb;

public interface CalculationDao {
	
	@Add(value=10)
	public int sum(int A, int B);

}

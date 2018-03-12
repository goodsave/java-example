package com.goodsave.example.spring.colligate;

public interface CalculationDao {

	@Add(value = 10)
	public int sum(int A, int B);

}

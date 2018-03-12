package com.goodsave.example.spring.colligate;

public class CalculationImpl implements CalculationDao{

	@Override
	public int sum(int A, int B) {
		return A+B;
	}

}

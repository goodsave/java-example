package com.goodsave.example.spring.annotationb;

import java.lang.reflect.Method;

public class CalculationImpl implements CalculationDao{

	@Override
	public int sum(int A, int B) {
		int C = 0;
		Method[] methods = CalculationDao.class.getDeclaredMethods();
        for (Method method : methods) {
            boolean hasAnnotation = method.isAnnotationPresent(Add.class);
            if(hasAnnotation){
            	Add annotation = method.getAnnotation(Add.class);
            	C = annotation.value();
            }
        }
		return A+B+C;
	}

}

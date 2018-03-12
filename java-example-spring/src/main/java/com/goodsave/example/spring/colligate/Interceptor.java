package com.goodsave.example.spring.colligate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class Interceptor {

	@Pointcut("execution(* com.goodsave.example.spring.colligate.CalculationImpl.*(..))")
	public void declareCutPoint() {
	}
	
	@Around("declareCutPoint()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		Object object = pjp.proceed();
		int C = 0;
		Method[] methods = CalculationDao.class.getDeclaredMethods();
        for (Method method : methods) {
            boolean hasAnnotation = method.isAnnotationPresent(Add.class);
            if(hasAnnotation){
            	Add annotation = method.getAnnotation(Add.class);
            	C = annotation.value();
            }
        }
		return (int)object+C;
	}
	
	
}

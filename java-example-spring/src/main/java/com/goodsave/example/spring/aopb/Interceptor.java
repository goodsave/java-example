package com.goodsave.example.spring.aopb;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor {

	@Pointcut("execution(* com.goodsave.example.spring.aopb.Service.*(..))")
	private void cutPoint() {
	}

	@Before("cutPoint() && args(str)")
	public void doAccessCheck(String str) {
		System.out.println("前置通知 name=" + str);
	}

	@AfterReturning("cutPoint()")
	public void doAfter() {
		System.out.println("后置通知");
	}

	@After("cutPoint()")
	public void last() {
		System.out.println("最终通知");
	}

	@AfterThrowing("cutPoint()")
	public void doAfterThrow() {
		System.out.println("例外通知");
	}

	@Around("cutPoint()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("进入环绕通知");
		Object object = pjp.proceed();// 执行该方法
		System.out.println("退出方法");
		return object;
	}
}

package com.goodsave.example.spring.jpatemplate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * DataSourceAspect
 * Created by web on 2017/7/26.
 */
@Aspect
@Component
public class QueryAspect {

    private final Log LOGGER = LogFactory.getLog(this.getClass());


    /*@Pointcut("execution(* com.springtest.jpatemplate.BaseRepositoryImpl.*(..))")
	public void declareCutPoint() {
	}

	@Around("declareCutPoint()")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		Object object = pjp.proceed();
		Method[] methods = UserRepository.class.getDeclaredMethods();
        for (Method method : methods) {
            boolean hasAnnotation = method.isAnnotationPresent(Query.class);
            if(hasAnnotation){
            	Query annotation = method.getAnnotation(Query.class);
            	System.out.println(annotation.value());
            }
        }
		return new User(1, "goodsave8693", "Ss123456", "goodsave@qq.com");
	}*/

    @Around("within(@com.minsx.spring.jpatemplate.Query *)||@annotation(com.minsx.spring.jpatemplate.Query)")
    public Object handleAnnotation(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------");
        Class<? extends Object> invokeClass = pjp.getTarget().getClass();
        String signatureName = pjp.getSignature().getName();
        Method methods[] = invokeClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(signatureName)) {
                String paramCollection = method.getAnnotation(Query.class).value();
                LOGGER.info(String.format("Query sql is %s", paramCollection));
                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    parameter.getName();
                }
            }
        }
        pjp.proceed();
        return new User(1, "goodsavess", "Ss123456", "goodsave@qq.com");
    }
}

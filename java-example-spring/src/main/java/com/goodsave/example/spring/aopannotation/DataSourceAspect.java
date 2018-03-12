package com.goodsave.example.spring.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * DataSourceAspect
 * Created by web on 2017/7/26.
 */
@Aspect
@Component
public class DataSourceAspect {

    @Around("within(@com.goodsave.example.spring.aopannotation.DataSource *)||@annotation(com.goodsave.example.spring.aopannotation.DataSource)")
    public Object handleAnnotation(ProceedingJoinPoint pjp) throws Throwable {
        Class<? extends Object> invokeClass = pjp.getTarget().getClass();
        String signatureName = pjp.getSignature().getName();
        Method methods[] = invokeClass.getMethods();
        for (Method method : methods) {
            //System.out.println(method.getName());
            if (method.getName().equals(signatureName)) {
                String paramCollection = method.getAnnotation(DataSource.class).name();
                System.out.println("finished switching datasource to "+paramCollection);
            }
        }
        return pjp.proceed();
    }
}

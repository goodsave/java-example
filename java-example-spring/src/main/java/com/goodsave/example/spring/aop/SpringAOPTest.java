package com.goodsave.example.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {  
    
    @Test  
    @SuppressWarnings("resource")
    public void inteceptorTest(){  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/aop/application-config.xml");  
        PersonServer bean = (PersonServer)ctx.getBean("personServiceBean");  
        bean.save("高圆圆");
    }  
      
  
}  
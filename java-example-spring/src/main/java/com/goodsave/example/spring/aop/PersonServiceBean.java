package com.goodsave.example.spring.aop;

public class PersonServiceBean  implements PersonServer{

	@Override
	public void save(String name) {
		 System.out.println("正在执行save()方法");   
		
	}

	@Override
	public void update(String name, Integer id) {
		 System.out.println("正在执行update()方法");  
		
	}

	@Override
	public String getPersonName(Integer id) {
		System.out.println("正在执行getPersonName()方法");  
        return "xxx";  
	}

}

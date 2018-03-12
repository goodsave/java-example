package com.goodsave.example.spring.genericity;

public interface Person<T , V>{
	
	public T getName();
	
	public void setName(T name) ;
	
	public V getAge();
	
	public void setAge(V age) ;

}

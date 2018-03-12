package com.goodsave.example.spring.genericity;

public class GenericityA{
	
	public static void main(String[] args) {
		
		Persion<String,Integer> persionA= new Persion<>();
		persionA.setName("Jone");
		persionA.setAge(12);
		System.out.println(persionA.getName());
		System.out.println(persionA.getAge());
	}
	
	static class Persion<T,V>{
		private T name;
	    private V age;
		public T getName() {
			return name;
		}
		public void setName(T name) {
			this.name = name;
		}
		public V getAge() {
			return age;
		}
		public void setAge(V age) {
			this.age = age;
		}
	}
	
	
	
	

}

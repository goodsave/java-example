package com.goodsave.example.spring.genericity;

public class GenericityB {

	public static void main(String[] args) {
		Persion<Object, Integer> persion =new Persion<>();
		persion.setName("jone");
		persion.setAge(15);
		function(persion);
	}
	
	//泛型上下限
	public static void function(Persion<? super String, ? extends Number> persion){
        System.out.println("Name="+ persion.getName()+"\nAge="+persion.getAge());
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

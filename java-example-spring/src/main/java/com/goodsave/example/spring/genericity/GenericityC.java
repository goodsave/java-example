package com.goodsave.example.spring.genericity;

public class GenericityC<T, V> implements Person<T, V> {
	
	public static void main(String[] args) {
		Person<String, Integer> persion=new GenericityC<>();
		persion.setName("Jone");
		persion.setAge(11);
		System.out.println("Name="+ persion.getName()+"\nAge="+persion.getAge());
	}
	
	private T name;
    private V age;

	@Override
	public T getName() {
		return name;
	}

	@Override
	public void setName(T name) {
		this.name = name;
	}

	@Override
	public V getAge() {
		return age;
	}

	@Override
	public void setAge(V age) {
		this.age = age;
		
	}
	
}

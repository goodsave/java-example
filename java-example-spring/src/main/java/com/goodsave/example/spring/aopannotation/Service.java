package com.goodsave.example.spring.aopannotation;

import org.springframework.stereotype.Component;

@Component
public class Service {

	@DataSource(name = "xxx")
	public void sayWhat(String str) {
		System.out.println("A say that " + str);
	}

	public void seeWhat(String str){
		doWhat(str);
	}

	@DataSource(name = "www")
	public void doWhat(String str) {
		System.out.println("A do that " + str);
	}

	public void readWhat(String str){
		doWhat(str);
	}

}

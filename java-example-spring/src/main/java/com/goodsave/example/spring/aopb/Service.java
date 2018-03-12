package com.goodsave.example.spring.aopb;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public void sayWhat(String str) {
		System.out.println("A says " + str);
	}

}

package com.goodsave.basic.java8;

public class LambdaB {
	
	public static void main(String[] args) {
		GreetingService service = (String xxx,int mmm)->System.out.println("aaaa "+xxx+mmm);
		service.say("wwww",111);
	}
	
	interface GreetingService{
		void say(String what, int qqq);
	}

}

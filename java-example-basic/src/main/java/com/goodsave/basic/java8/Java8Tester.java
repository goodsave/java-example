package com.goodsave.basic.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Tester {
	 public static void main(String args[]){
	      List<String> names = new ArrayList<>();
	      names.add("Google");
	      names.add("Runoob");
	      names.add("Taobao");
	      names.add("Baidu");
	      names.add("Sina");
	      names.forEach(Java8Tester::printStr);
	      
	      
	   }
	 
	 public static void printStr(String str) {
		System.out.println("this is "+str);
	 }
	 
}

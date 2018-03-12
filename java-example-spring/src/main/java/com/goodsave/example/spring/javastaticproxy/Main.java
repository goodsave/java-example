package com.goodsave.example.spring.javastaticproxy;

public class Main {
	public static void main(String[] args) {
		 Image image = new ProxyImage("test10.jpg");

	      //图像将从磁盘加载
	      image.display(); 
	      System.out.println("");
	      //图像将无法从磁盘加载
	      image.display(); 	
	}
}

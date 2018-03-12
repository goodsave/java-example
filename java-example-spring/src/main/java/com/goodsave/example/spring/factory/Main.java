package com.goodsave.example.spring.factory;

public class Main {
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape("Square");
		shape.draw();
	}

}

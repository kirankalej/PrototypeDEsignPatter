package com.prototype;

public class clientPrototype {

	public static void main(String[] args) {

		shape circle=new shape("circle");
		
		shape rectangle=(shape) circle.clone();
		
		rectangle.setType("rectangle");
		
		System.out.println("original object: "+circle.getType());
		System.out.print("copied object: " +rectangle.getType());
	}

}

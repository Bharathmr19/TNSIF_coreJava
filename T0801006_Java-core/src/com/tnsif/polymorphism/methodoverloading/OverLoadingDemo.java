package com.tnsif.polymorphism.methodoverloading;

public class OverLoadingDemo {
	
	public static void main(String[] args) {
	int sum = MethodOverloading.addition(10,20);
	System.out.println(sum);
	
	System.out.println(MethodOverloading.addition(10.3f, 25.63f));
	
	System.out.println(MethodOverloading.addition("Bha", 25.63f));


	}
}

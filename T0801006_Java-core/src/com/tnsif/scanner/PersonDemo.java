package com.tnsif.scanner;

import java.util.Scanner;

//program to demonstrate scanner class
public class PersonDemo {

	public static void main(String[] args) {
		
//		Person person1 = new Person();
//		person1.setAge(21);
//		person1.setName("Bharath");
//		person1.setGender("male");
//		person1.setIncome(3000000.7f);
//		person1.setTax(120000);
//		System.out.println(person1);
//		
//		
//		
//		Person person2 = new Person(21,"Rocky",3450.34f,0, "male");
//		System.out.println(person2);
		
		
		
		//initialise the object through user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person");
		String name=sc.next();
		System.out.println("enter the age of the person");
		int age=sc.nextInt();
		System.out.println("enter the gender of the person");
		String gender=sc.next();
		System.out.println("enter the salary of the person");
		float salary = sc.nextFloat();
		
		Person person3 = new Person(age,name,salary,0, gender);
		System.out.println(person3);

	}

}

package com.tnsif.dayfour.firstpackage;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Scanner s =new Scanner(System.in);
		String name,city;
		int age;
		name = s.nextLine();
		city = s.nextLine();
		age = s.nextInt();
		
		p1.setAge(age);
		p1.setCity(city);p1.setName(name);
		
		
		System.out.println("Person Details");
		
	}

}

package com.tnsif.constructors;

public class Person {

	
	private String name;
	private int id;
	private String city;
	
	public Person()
	{
		System.out.println("Default constructor");
	}

	public Person(String name, int id, String city) {
		
		this();
		
		System.out.println("Parameterized constructor");
		
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	
	
	
}
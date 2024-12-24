package com.tnsif.runtimepolymorphism;

public class OverridingDemo {
	
	public static void main(String[] args)
	{
		
		RBI rbi;
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
	}

}

package com.tnsif.finalconcept;

public class FinalVariableDemo {
	
	final int x = 100;
	
	final static  int Y;
	
	final static int Z = 200;
	
	static void change() {
		//final var value can't be changed
		
	}
	
	static {
		Y = 20;
		//Z = 100;
		System.out.println("Value of y: " + Y);
	}

	@Override
	public String toString() {
		return "FinalVariableDemo [x=" + x + ", Y" +Y +"]";
	}
	
	
	

}

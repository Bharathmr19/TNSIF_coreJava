package com.tnsif.Polymorphism_example;

public class Zoo {

	public static void main(String[] args) {
		
		Animal animal;

        
        animal = new Lion();
        System.out.println("Lion sound:");
        animal.sound();

        animal = new Elephant();
        System.out.println("Elephant sound:");
        animal.sound();

        animal = new Bird();
        System.out.println("Bird sound:");
        animal.sound();

	}

}

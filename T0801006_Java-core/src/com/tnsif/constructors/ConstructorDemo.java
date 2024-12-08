package com.tnsif.constructors;

public class ConstructorDemo {

    public static void main(String[] args) {
        
        
        Person person1 = new Person();  
        
        
        
        Person person2 = new Person("John", 123, "New York");  
        
        
        
        System.out.println(person2);  
        
        
        
        person1.setName("Alice");
        person1.setId(456);
        person1.setCity("Los Angeles");
        
        
        System.out.println(person1);  
        
    }
}

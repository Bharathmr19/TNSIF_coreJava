package com.tnsif.staticconcept;


public class EmployeeDemo {
	
	public static void main(String[] args) {
		Employee e=new Employee("Bharath",101);
	    System.out.println(e);
	    
	    Employee e1=new Employee("Modi",102);
	    System.out.println(e1);
	    
	    System.out.println(Employee.ecompany);
	    
	    e1.ecompany="Accenture";
	    System.out.println(e1);
	    System.out.println(e);
	    
	    Employee e2=new Employee("Sinchana",103);
	    System.out.println(e2);
	    
	    System.out.println(Employee.ecompany);
	    
		}

	}

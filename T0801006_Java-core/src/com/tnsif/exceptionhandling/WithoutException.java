package com.tnsif.exceptionhandling;

public class WithoutException {
    
    public static void main(String[] args) {
        
        int a[] = new int[4];
        try {
            a[3] = 10;
            a[4] = 10;  
        }
        catch (ArrayIndexOutOfBoundsException e) {  // Specify the correct exception type
            //System.out.println("Exception caught: " + e);
        }
        
        System.out.println("Will be printed");
    }
}

//Demonstrate type casting (explicit and implicit).

package com.assignment;

public class TypeCasting 
{
	public static void main(String[] args) 
	{
		 int intValue = 100;
	        long longValue = intValue; // Implicit casting 

	        System.out.println("Long Value: " + longValue);

	       long longValue1 = 1000000L;
	        short shortValue = (short) longValue1; // Explicit casting 

	        System.out.println("Short Value: " + shortValue);
	        
	        double doubleValue = 100.99;
	        int intValue3 = (int) doubleValue; // Explicit casting 

	        System.out.println("Int Value: " + intValue);


	}

}

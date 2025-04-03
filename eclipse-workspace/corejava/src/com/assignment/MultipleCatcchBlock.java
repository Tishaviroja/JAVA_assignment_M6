

//Implement multiple catch blocks for different types of exceptions.

package com.assignment;

public class MultipleCatcchBlock 
{

	    public static void main(String[] args) 
	    {
	        try {
	            int[] numbers = {10, 0};
	            int result = numbers[0] / numbers[1]; 
	            System.out.println("Result: " + result);
	            System.out.println("Accessing element: " + numbers[2]); 
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: Division by zero.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds.");
	        }
	        System.out.println("Program continues...");
	    }
	}



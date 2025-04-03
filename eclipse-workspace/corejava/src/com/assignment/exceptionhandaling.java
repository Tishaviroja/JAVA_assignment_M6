
//Write a program to demonstrate exception handling using try-catch-finally.

package com.assignment;

public class exceptionhandaling 
{
	
	    public static void main(String[] args) 
	    {
	        int[] numbers = {10, 0};
	        try {
	            int result = numbers[0] / numbers[1];
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: Division by zero is not allowed.");
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	        System.out.println("Program continues...");
	    }
}





//Implement string comparison using equals() and compareTo() methods

package com.assignment;

import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter first string: ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = scanner.nextLine();

	       
	        if (str1.equals(str2)) 
	        {
	            System.out.println("Using equals(): Strings are exactly equal.");
	        } else 
	        {
	            System.out.println("Using equals(): Strings are not equal.");
	        }

	        
	        if (str1.equalsIgnoreCase(str2)) 
	        {
	            System.out.println("Using equalsIgnoreCase(): Strings are equal (ignoring case).");
	        } else 
	        {
	            System.out.println("Using equalsIgnoreCase(): Strings are not equal.");
	        }

	  
	        int result = str1.compareTo(str2);

	        if (result == 0) 
	        {
	            System.out.println("Using compareTo(): Strings are equal.");
	        } else if (result < 0) 
	        {
	            System.out.println("Using compareTo(): First string is lexicographically smaller than the second.");
	        } else 
	        {
	            System.out.println("Using compareTo(): First string is lexicographically greater than the second.");
	        }

	        scanner.close();
		
	}

}


//Create a program to reverse a string and check for palindromes.

package com.assignment;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		        Scanner sc= new Scanner(System.in);

		   
		        System.out.print("Enter a string: ");
		        String original = sc.nextLine();

		   
		        String reversed = reverseString(original);

		    
		        if (original.equalsIgnoreCase(reversed)) 
		        {
		            System.out.println("The string is a palindrome.");
		        } else 
		        {
		            System.out.println("The string is not a palindrome.");
		        }

		        sc.close();
		    }

		    
		    private static String reverseString(String str) 
		    {
		        StringBuilder sb = new StringBuilder(str);
		        return sb.reverse().toString();
		    }


		

}

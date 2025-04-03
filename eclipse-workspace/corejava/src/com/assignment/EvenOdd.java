
//Write a program to find if a number is even or odd using an if-else statement.

package com.assignment;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		
		
		if(num % 2 == 0)
		{
			System.out.println("Even number...");
		}
		else
		{
			System.out.println("Odd number...");
		}
		
		
	}

}

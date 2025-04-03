
//Write a program to find the maximum of three numbers using a method.

package com.assignment;

public class MaximumNumber 
{
	public static void main(String[] args) 
	{
		int num1=12;
		int num2=26;
		int num3=56;
		
		if(num1> num2 || num1>num3)
		{
			System.out.println("num1 is max.."+num1);
		}else if(num2>num3 || num2>num1)
		{
			System.out.println("num2 is max.."+num2);
		}else
		{
			System.out.println("num3 is max.."+num3);
		}
	}
	
	
	
}


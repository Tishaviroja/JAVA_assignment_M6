
//Write a program to display the Fibonacci series using a loop.

package com.assignment;

import java.util.Scanner;

public class FibonaciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int n=sc.nextInt();
		
		int num1=0;
		int num2=1;
		
		for(int i=0; i<=n; i++)
		{
			System.out.print(num1+" ");
			
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		System.out.println();
		
	}

}

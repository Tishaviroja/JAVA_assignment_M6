package com.oops;

import java.util.Scanner;

public class Fibonaci 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0; i<=no; i++)
		{
		
			int num=a+b;
			a=b;
			b=num;
			System.out.println("Fibonacci series....... "+num);
		}
		//System.out.println("Fibonacci series....... "+num);
	}

}

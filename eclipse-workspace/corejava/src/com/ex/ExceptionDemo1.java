package com.ex;

import java.util.Scanner;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no1:");
			int a=sc.nextInt();
			System.out.println("Enter no2:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("your answer is..."+c);
			System.out.println("your program is completed");
			
			//system.gc();
		}
		catch(Exception e) 
		{
			//system.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("your program is developed by:");
			System.out.println("Tisha viroja");
			System.out.println("mo : 9106362503");
		}
		
	}

}

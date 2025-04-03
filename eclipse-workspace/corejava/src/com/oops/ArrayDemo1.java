package com.oops;

import java.util.Scanner;

public class ArrayDemo1 
{
	public static void main(String[] args) {
		
	
	int[] a=new int[5];//to value 0 to 4
	
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<5; i++)
	{
		System.out.println("Enter Value:");
		a[i]=sc.nextInt();
	}
	for(int i=0; i<5; i++)
	{
		System.out.println(a[i]);	
	}
}
}
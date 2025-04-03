package com.oops;


import java.util.Scanner;


public class scannerDemo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		int no=sc.nextInt() ;
		int copy=no, sum=0;
		while(no>0)
		{
			int t=no%10;
			sum=sum+(t*t*t);
			no=no/10;
			
		}
		if(sum==copy)
		{
			System.out.println("Your No is Armstrong..."+sum);
		}else
		{
			System.out.println("Your No is not an 1Armstrong..."+sum);
		}
		
		
	}

}

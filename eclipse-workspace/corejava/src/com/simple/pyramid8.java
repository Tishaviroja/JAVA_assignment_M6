package com.simple;

public class pyramid8 
{
	public static void main(String[] args)
	{
		int num=1;
		for(char i=1; i<=5; i++)
		{
			for(char j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();
		}
	}
}

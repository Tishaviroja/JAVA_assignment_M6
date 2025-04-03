package com.simple;

public class condition4 
{
	public static void main(String[] args)
	{
		int a = 1000, b = 1000, c = 1000;
		if(a<=b && a>=c)
		{
			System.out.println(" A is max...."+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println(" B is max...."+b);
		}
		else
		{
			System.out.println("C is max...."+c);
		}
	}
}

package com.oops;

class sum
{
	int x, y;
	public sum()//default
	{
		x=10;
		y=20;
		System.out.println("First sum is..."+(x+y));
	}
	public sum(int a)//parameterized
	{
		x=a;
		y=a;
		System.out.println("Second sum is..."+(x+y));
	}
	public sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is..."+(x+y));
	}
}

public class constructorDemo 
{
	public static void main(String[] args) 
	{
		sum s1=new sum();
		new sum(123);
		new sum(45, 65);
	}
}


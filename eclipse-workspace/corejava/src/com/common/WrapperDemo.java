package com.common;
class Student
{
	public void show() 
	{
	
	}
}
public class WrapperDemo
{
	
	public static void main(String[] args)
	{
		Integer i1=new Integer(123);
	    System.out.println("AutoBoxing is.. "+i1);
	    
	    int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is.. "+i2);
		
		int b=i2.intValue();
		System. out.println("UnBoxing is.. "+b);
		
		String s="786";
		int x=Integer.parseInt(s);
		System.out.println("Unboxing is.. "+x);
		
		Object ol=new Object();
		Student sl=new Student();
}
}


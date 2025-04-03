package com.common;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
	StringBuffer s1=new StringBuffer("This is Tops Technologies...");
	System.out.println("Original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	s1.insert(0, "Hii");
	System.out.println("Original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	s1.append("Rahul Sanghavi...");
	System.out.println("Original value is.. "+51);
	System.out.println("Legth is.. "+s1.length());
	s1.delete(0, 4);
	System.out.println("Original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	System.out.println("Original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	}
}

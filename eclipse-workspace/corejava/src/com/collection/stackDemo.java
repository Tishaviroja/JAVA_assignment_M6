package com.collection;

import java.util.Stack;

public class stackDemo
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		System.out.println("Default size is.."+s1.size());
		System.out.println("Default value is.."+s1);
		s1.push(124);
		s1.push("Tisha");
		s1.push(45.65f);
		s1.push("Tisha");
		System.out.println("Now size is.."+s1.size());
		System.out.println("Now value is.."+s1);
		s1.pop();
		System.out.println("Now size is.."+s1.size());
		System.out.println("Now value is.."+s1);
	}
}
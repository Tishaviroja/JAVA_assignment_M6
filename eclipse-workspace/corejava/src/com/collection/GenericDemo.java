package com.collection;

import java.util.ArrayList;

public class GenericDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(123);
		a1.add(new Integer(100));
		
		System.out.println(a1);
	}
}
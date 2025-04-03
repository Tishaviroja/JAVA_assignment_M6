package com.collection;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is..."+a1.size());
		System.out.println("Default value is..."+a1);
		a1.add(100);
		a1.add("Tisha");
		a1.add('T');
		a1.add(45.65f);
		a1.add(new Integer(123));
		a1.add("Tisha");
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove(2);
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove("Tisha");
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove("T");
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.add("Viroja");
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
	}
}

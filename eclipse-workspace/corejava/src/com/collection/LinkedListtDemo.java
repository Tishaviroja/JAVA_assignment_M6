package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListtDemo
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		System.out.println("Default size is.."+l1.size());
		System.out.println("Default value is..."+l1);
		l1.add(123);
		l1.add("shraddha");
		l1.add(45.65f);
		l1.add('T');
		l1.add(new Integer(100));
		System.out.println("now size is..."+l1.size());
		System.out.println("now value is.."+l1);
		l1.addFirst("Hii");
		l1.addLast("Shraddha");
		System.out.println("now size is..."+l1.size());
		System.out.println("now value is.."+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("now size is..."+l1.size());
		System.out.println("now value is.."+l1);
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
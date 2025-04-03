package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector(2, 1);
		System.out.println("Deefault size is.."+v1.size());
		System.out.println("Deefault capacity is.."+v1.capacity());
		System.out.println("Deefault value is.."+v1);
		v1.add("Tisha");
		v1.add(45.65f);
		v1.add('T');
		v1.add(new Integer(123));
		v1.add("Tisha");
		System.out.println("Now size is.."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is.."+v1);
		v1.remove(2);
		System.out.println("Now size is.."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is.."+v1);
		v1.remove("Tisha");
		System.out.println("Now size is.."+v1.size());
		System.out.println("Now capacity is.."+v1.capacity());
		System.out.println("Now value is.."+v1);
		
		
	//	Iterator i1=v1.iterator();
		//while(i1.hasNext())
		//{
			//System.out.println(i1.next());
			
		//}
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}

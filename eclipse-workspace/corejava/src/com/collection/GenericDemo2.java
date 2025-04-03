package com.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class GenericDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<student> a1=new ArrayList<student>();
		
		student s1=new student();
		s1.setSid(1);
		s1.setname("Prisha");
		s1.setCity("Ahmedabad");
		
		student s2=new student();
		s2.setSid(2);
		s2.setname("Tisha");
		s2.setCity("Ahmedabad");
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1);
		
		Iterator<student> i1=a1.iterator();
		while(i1.hasNext())
		{
			student s=(student)i1.next();
			System.out.println("Sid is..."+s.getSid());
			System.out.println("Sname is..."+s.getsname());
			System.out.println("Scity is..."+s.getCity());
			System.out.println();
		}
	}
}

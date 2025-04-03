package com.key;

class First
{
	int no;
	String name;
	public First()
	{
		System.out.println("This is First class....");
	}
	public void setData()
	{
		no=123;
		name="Tisha";
	}
}
class Second extends First
{
	int no;
	public Second()
	{
		super();
		System.out.println("This is Second class...");
	}
	public void display()
	{
		super.setData();
		System.out.println("No is..."+super.no);
		System.out.println("Name is..."+name);
	}
}
public class SuperDemo
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		s1.setData();
		s1.display();
		
	}
}

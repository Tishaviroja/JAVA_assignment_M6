package com.oops;



class student
{
	int sid;
	String sname,city;
	public void setDataValue()
	{
		sid=1;
		sname="tisha";
		city="Ahmedabad";

	}
	public void display()
	{
		System.out.println("sid is..."+sid);
		System.out.println("sname is..."+sname);
		System.out.println("city is..."+city);
	}
}
public class classDemo 
{
	public static void main(String[] args)
	{
		student s1=new student();
		s1.setDataValue();
		s1.display();
	}
}

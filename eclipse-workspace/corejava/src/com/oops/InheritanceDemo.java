package com.oops;

class student1
{
	int sid;
	String sname, city;
	public student1()
	{
		System.out.println("this is student class");
	}
	public void setStudentData()
	{
		sid=1;
		sname="Tisha";
		city="Junagadh";
	}	
}
class sport1 extends student1
{
	String spname;
	public sport1()
	{
		System.out.println("this is sport class");
	}
	public void setSportData()
	{
		spname="Cricket";
		
	}
	public void display()
	{
		System.out.println("sid is.."+sid);
		System.out.println("sname is.."+sname);
		System.out.println("city is.."+city);
		System.out.println("spname is.."+spname);
		
	}
}
class result1 extends sport1
{
	String grade;
public result1()
{
	System.out.println("this is student class");
}
public void setResultData()
{
	grade="A+";
}
public void display()
{
	System.out.println("sid is......."+sid);
	System.out.println("sname is......."+sname);
	System.out.println("city is......."+city);
	System.out.println("spname is......."+spname);
	System.out.println("grade is......."+grade);
}
}
public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		result1 s1=new result1();
		s1.setStudentData();
		s1.setSportData();
		s1.setResultData();
		s1.display();
	}
}

package com.key;

class result
{
	String grade;
	public void setgrade()
	{
		grade="A+";
	}
}
class Staff extends result implements student,admin
{
	String stname, sname;
	public void setStaffData()
	{
		sname="abc";
		stname="Tisha";
		
	}
	@Override
	public void display() 
	{
		System.out.println("sno is....."+sno);
		System.out.println("admin is....."+aname);
		System.out.println("sname is....."+sname);
		System.out.println("stname is....."+stname);
		System.out.println("grade is....."+grade);
	}
}
public class interfaceDemo 
{
	public static void main(String[] args) 
	{
		Staff s1=new Staff();
		s1.setStaffData();
		s1.setgrade();
		s1.display();
		student.show();
		
	
			
				
	}
}

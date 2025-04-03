package com.oops;

class First
{
	public void display()
	{
		System.out.println("This is First class....");
	
	}
}
class second extends First
{
	public void display()
	{
		System.out.println("This is second class....");
	}
}

public class MethodOverriding
{
	public static void main(String[] args) 
	{
		//second s1=new second();
		//s1.display();
		First f1=new First();
		f1.display();
		f1=new second();
		f1.display();
	}

}

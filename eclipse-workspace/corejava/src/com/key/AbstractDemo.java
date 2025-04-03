package com.key;

abstract class Ademo
{
	int no;
	String name;
	public abstract void setData();
	public void display()
	{
		System.out.println("No is..."+no);
		System.out.println("Name is..."+name);
	}
}
abstract class Demo extends Ademo
{
	
}
class Demo1 extends Demo
{

	@Override
	public void setData() 
	{
		no=123;
		name="Tisha";
		
	}
	
}
public class AbstractDemo 
{
	public static void main(String[] args)
	{
		Ademo a1=new Demo1();
		a1.setData();
		a1.display();
	}

	
}

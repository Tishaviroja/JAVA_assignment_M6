package com.key;

final class FDemo
{
	final int no=100;
	String name;
	public final void setData()
	{
		//no=123;
		name="Tisha";
		
	}
	public void display()
	{
		System.out.println("No is..."+no);
		System.out.println("Name is..."+name);
	}
}
public class FinalDemo 
{
	
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.display();
		
	}

}

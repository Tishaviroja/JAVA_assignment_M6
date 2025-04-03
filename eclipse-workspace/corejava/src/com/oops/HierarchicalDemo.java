package com.oops;
class parent
{
	String pname;
	public void setParentData()
	{
		pname="Tejasbhai Viroja";	
	}
}
class child1 extends parent
{
	String cname;
	public void setChildData()
	{
		cname="Tisha";
	}
	public void display()
	{
		System.out.println(cname+" "+pname);
			
	}
}
class child2 extends parent
{
	String cname;
	public void setChildData()
	{
		cname="Prisha";
	}
	public void display()
	{
		System.out.println(cname+" "+pname);
	}
}
public class HierarchicalDemo 
{
	public static void main(String[] args) 
	{
		child1 c1=new child1();
		c1.setParentData();
		c1.setChildData();
		c1.display();
		
		child2 c2=new child2();
		c2.setParentData();
		c2.setChildData();
		c2.display();
	}
}

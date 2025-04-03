package com.pk1;

public class Car 
{
	int cid;
	String cname, model, price;
	
	public void setCarData()
	{
		cid=1;
		cname="scorpio";
		model="sport";
		price="1200000rs";
	}
	public void display()
	{
		System.out.println("cid is..."+cid);
		System.out.println("cname is..."+cname);
		System.out.println("model is..."+model);
		System.out.println("price is..."+price);
		
	}

}

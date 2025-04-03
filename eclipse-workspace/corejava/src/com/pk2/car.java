package com.pk2;

public class car 
{
	int cid;
	String cname, model, price;
	
	public void setCarData()
	{
		cid=1;
		cname="suv700";
		model="sportz";
		price="1800000rs";
	}
	public void display()
	{
		System.out.println("cid is..."+cid);
		System.out.println("cname is..."+cname);
		System.out.println("model is..."+model);
		System.out.println("price is..."+price);
		
	}

}

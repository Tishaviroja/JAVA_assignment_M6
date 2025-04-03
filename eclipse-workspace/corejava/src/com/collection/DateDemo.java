package com.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo
{
	public static  void main(String[] args)
	{
		Date d1=new Date();
		System.out.println("Date is..."+d1.getDate());
		System.out.println("Day is..."+d1.getDay());
		System.out.println("Year is..."+d1.getYear());
		System.out.println("Hours is..."+d1.getHours());
		System.out.println("Minutes is..."+d1.getMinutes());

	    SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
	    System.out.println(sd.format(d1));
		
	}
}
package com.simple;

public class typeconversionDemo
{
	public static void main(String[] args)
	{
		int i=100; //4 byte
		long l; //8 byte
		
		l=i; //implicit
		System.out.println("Implicit is....."+l);
		
		int x;
		x=(int)l;
		System.out.println("explicit is....."+x);
		
		int a=128; // 4 byte
		byte b; //1 byte
		
		b=(byte)a;
		System.out.println("byte is....."+b);
		
	}
	
}

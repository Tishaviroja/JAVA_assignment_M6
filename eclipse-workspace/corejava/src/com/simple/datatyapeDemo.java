package com.simple;

public class datatyapeDemo
{
	public static void main(String[] args)
	{
		int i1=10; //4 byte | -2147483648 to +2147483648
		long l1=123213; //8 byte | -2^64 to +2^64 -1
		float f1=45.65f; //4 byte
		double d1=7887.658d; //8 byte 
		byte b1=127; //1 byte | -128 to 127
		char c1='T'; //2 byte
		boolean bb=true; //1bit
		
		System.out.println("int is ..."+i1);
		System.out.println("long is ..."+l1);
		System.out.println("float is ..."+f1);
		System.out.println("double is ..."+d1);
		System.out.println("byte is ..."+b1);
		System.out.println("char is ..."+c1);
		System.out.println("boolean is ..."+bb);
		
		System.out.println("integer size is ..."+Integer.BYTES);
		System.out.println("float size is...."+Float.BYTES);
		System.out.println("long size is...."+Long.BYTES);
		System.out.println("double size is...."+Double.BYTES);
		
		
	}
}

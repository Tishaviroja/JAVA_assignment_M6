package com.th;
public class StaticThreadDemo
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		t1.setName("TOPS");
		System.out.println(t1);
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1);
		System.out.println("is alive oe not.."+t1.isAlive());
		System.out.println(t1.isDaemon());
	}
}

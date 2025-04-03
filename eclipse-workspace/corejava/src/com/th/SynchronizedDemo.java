package com.th;
	
class Message
{
	public void display(String msg)
	{
		System.out.println("   [ "+msg);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("  ] ");
	}
}
class synch extends Thread
{
	Message m1;
	String msg;
	public synch(String msg,Message m1)
	{
		this.m1=m1;
		this.msg=msg;
	}
	public void run()
	{
		synchronized (m1)
		{
			m1.display(msg);
		}
	}
}
public class SynchronizedDemo 
{
	public static void main(String[] args) 
	{
		Message m1=new Message();
		synch s1=new synch ("Hello", m1);
		synch s2=new synch ("How R U", m1);
		synch s3=new synch ("Khana Khake Jana", m1);
		s1.start();
		s2.start();
		s3.start();
	}
}
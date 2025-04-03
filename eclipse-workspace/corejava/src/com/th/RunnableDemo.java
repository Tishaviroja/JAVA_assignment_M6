package com.th;

class Second implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("my second Thread is..."+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("my second Thread is completed..");
	}
	
}
public class RunnableDemo
{
	public static void main(String[] args)
	{
		Second s1=new Second();
		Thread t1=new Thread(s1);
		t1.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("my main Thread is.."+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("my main Thread is completed..");
	}
}

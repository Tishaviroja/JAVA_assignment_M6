package com.th;

class First extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("my first Thred is.."+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("my first Thred is completed...");
	}
}
public class ThreadDemo 
{
	public static void main(String[] args)
	{
		First f1=new First();
		f1.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("my main Thread is..."+i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("my main Thred is completed...");
	}
}

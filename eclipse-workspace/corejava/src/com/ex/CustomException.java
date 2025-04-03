package com.ex;

import java.util.Scanner;

import com.oops.scannerDemo;

class NoBalanceException extends Exception
{
	double amount;
	public NoBalanceException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println(amount+"rs deposited");
	}
	public void withdrawal(double amount) throws NoBalanceException
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println(amount+"rs withdrawal successfully...");
		}else
		{
			double needs=amount-balance;
			throw new NoBalanceException(needs);
			
		}
	}
}
public class CustomException 
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount For Deposit...");
		double amount=sc.nextDouble();
		
		a1.deposit(amount);
	
		System.out.println("Enter Amount For withdeawal...");
		amount=sc.nextDouble();
		
		try {
			a1.withdrawal(amount);
		}
		catch(NoBalanceException e)
		{
			System.out.println("if you entered"+e.amount+" rs mor"
					+ "e into your account then you withdrawal"+amount+"rs");
		}
		
	}

}

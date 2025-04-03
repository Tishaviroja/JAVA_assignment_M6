package com.common;
//W.A.J.P. to get string from user to find vowel
import java.util.Scanner;

public class stringVovel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String sname=sc.nextLine();
		
		for(int i=0; i<sname.length(); i++)
		{
			char c=sname.charAt(i);
			if( c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
					|| c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				System.out.println("vowel");
			}else
			{
				System.out.println("consolans");
			}
		}
		System.out.println();
		
	}
}

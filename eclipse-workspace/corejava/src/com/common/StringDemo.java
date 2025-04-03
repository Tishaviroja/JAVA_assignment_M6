package com.common;




//W.A.J.P. to get string from user
//W.A.J.P. to get string from user to find vowel
//W.A.J.P. to get string from user to find constant, space, digit, character, special character
//W.A.J.P. to get string from user to find maximum character used

//W.A.J.P. to get string from user to find last 2nd character after reverse

//W.A.J.P. to get string from user to find last 2nd character after reverse then
//kount how many time is used in string

//W.A.J.P. to get string from user to count how many word in string
//W.A.J.P. to get string from user to find palindrom the string is proper or not.
public class StringDemo 
{
	public static void main(String[] args)
	{
		
	
	String s1=new String("This is Tops Technologies...");
	System.out.println("original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	System.out.println("Uppercase is.. "+s1.toUpperCase());
	System.out.println("Lowercase is.. "+s1.toLowerCase());
	System.out.println("Substring is.. "+s1.substring(2));
	System.out.println("Substring is.. "+s1.substring(2, 4));
	System.out.println("Charat is.. "+s1.charAt(2));
	System.out.println("Compar String is.. "+s1.compareTo("This is Tops Technologies..."));
	System.out.println("Original value is.. "+s1);
	System.out.println("Legth is.. "+s1.length());
	char[] c= s1.toCharArray();
	for(int i=c.length-1;i>=0;i--) 
	{
	
			System.out.print(c[i]);
	}
}
}

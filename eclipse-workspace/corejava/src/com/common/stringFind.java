package com.common;

import java.util.Scanner;

//W.A.J.P. to get string from user to find constant, space, digit, 
//character, special character

public class stringFind 
{
	public static void main(String[] args) 
	{
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string :");
	String input=sc.nextLine();
	
	int constant=0;
	int space=0;
	int digit=0;
	int character=0;
	int spacialc =0;
	
	for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (Character.isLetter(c)) {
            character++;
        } else if (Character.isDigit(c)) {
            digit++;
        } else if (Character.isSpaceChar(c)) {
            space++;
        } else {
            spacialc++;
        }
        if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
            constant++;
        }
    }

		
		System.out.println("character:-"+character);
		System.out.println("Digits:-"+digit);
		System.out.println("space:-"+space);
		System.out.println("spacial character:-"+spacialc);
		System.out.println("constant:-"+constant);
	}
	
	//System.out.println();
}



//o Implement method overloading by creating methods for different data types.

package com.assignment;

public class MethodOverloading 
{
	void display(int num)
	{
		System.out.println("integer.."+num);
		
	}
	void display(double num)
	{
		System.out.println("double.."+num);
		
	}
	void display(String num)
	{
		System.out.println("String.."+num);
	}
	void display(int num1, int num2)
	{
		System.out.println("Sum of the number .."+(num1+num2));
		
	}
	
	public static <methodoverloading> void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		mo.display(2);
		mo.display(10.3);
		mo.display("Tisha");
		mo.display(5, 8);
	}

}

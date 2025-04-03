
//Write a program to create and initialize an object using a parameterized constructor.

package com.assignment;

class People 
{
    String name;
    int age;

    People( String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		 People p1 = new People("Tisha", 19);
	        
	        p1.display();
	}

}

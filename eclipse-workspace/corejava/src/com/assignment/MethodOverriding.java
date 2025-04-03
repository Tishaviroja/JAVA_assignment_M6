
//Implement method overriding to show polymorphism in action.

package com.assignment;

class animal
{
	void makesound()
	{
		System.out.println("Animals make sound..");
	}
}

class Dog extends animal
{ 
	void makesound()
	{
		System.out.println("Dog make sound.  bha bha");
	}
	
}

class Cow extends animal
{
	void makesound()
	{
		System.out.println("Cow make sound.  meow meow");
	}
	
}
	

public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		
		Dog d = new Dog();
		Cow c = new Cow();
		
		d.makesound();
		c.makesound();
	}
}

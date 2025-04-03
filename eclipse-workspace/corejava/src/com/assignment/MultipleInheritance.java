
//Write a program that implements multiple interfaces in a single class

package com.assignment;

	
		
		
		interface Swimming 
		{
		    void swim();
		}

		
		interface Diving 
		{
		    void dive();
		}

		// Class implementing both interfaces
		class Dolphin implements Swimming, Diving
		{
		    @Override
		    public void swim() 
		    {
		        System.out.println("Dolphin is swimming in the ocean...");
		    }

		    @Override
		    public void dive() 
		    {
		        System.out.println("Dolphin is diving deep underwater...");
		    }
		}
        
		
public class MultipleInheritance
{
		  public static void main(String[] args) 
		    {
		        Dolphin myDolphin = new Dolphin();
		        myDolphin.swim(); 
		        myDolphin.dive(); 
		    }
		

	}



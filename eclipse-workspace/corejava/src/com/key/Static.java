
//Create a class with static variables and methods to demonstrate their use.

package com.key;


public class Static 
{
	static int count = 0;

    
    void StaticExample() 
    {
        count++; 
    }

    
    static void displayCount() {
        System.out.println("Total Objects Created: " + count);
    }

    public static  void main(String[] args) 
    {
        
		Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        
        Static.displayCount();
    }
}

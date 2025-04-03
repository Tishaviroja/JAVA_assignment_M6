
//Create a class with static variables and methods to demonstrate their use.

package com.assignment;

class StaticDemo 
{
    
    static int count = 0;

    
    int id;

    
    public StaticDemo() {
        count++; 
        id = count;
    }

    static void displayCount() {
    	
        System.out.println("Total Objects Created: " + count);
    }

  
    void displayID() 
    {
        System.out.println("Object ID: " + id);
    }
}

public class Static
{
    public static void main(String[] args) 
    {
 
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

     
        obj1.displayID();
        obj2.displayID();
        obj3.displayID();

      
        StaticDemo.displayCount();
    }
}
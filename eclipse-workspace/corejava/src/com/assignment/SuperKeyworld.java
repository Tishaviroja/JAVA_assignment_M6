
//Use the super keyword to call the parent class constructor and methods.

package com.assignment;

class Building 
{
    String name;


    Building(String name) 
    {
        this.name = name;
        System.out.println("Building constructor called for: " + name);
    }

    void displayInfo()
{
        System.out.println("Building Name: " + name);
    }
}


class House extends Building
{
    int numberOfRooms;

   
    House(String name, int numberOfRooms) 
    {
        super(name);
        this.numberOfRooms = numberOfRooms;
        System.out.println("House constructor called for: " + name + " with " + numberOfRooms + " rooms");
    }

 
    @Override
    void displayInfo() 
    {
        super.displayInfo(); 
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}


public class SuperKeyworld 
{ 
    public static void main(String[] args)
    {
        House myHouse = new House("Dream Home", 5);
        myHouse.displayInfo(); 
    }
}

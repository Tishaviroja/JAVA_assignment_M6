
//Create an abstract class and implement its methods in a subclass.

package com.assignment;

abstract class Appliance 
{
    String brand;

    
    Appliance(String brand)
    {
        this.brand = brand;
    }


    abstract void turnOn();

    
    void showBrand() 
    {
        System.out.println("Appliance Brand: " + brand);
    }
}


class WashingMachine extends Appliance
{


    WashingMachine(String brand) 
    {
        super(brand); 
    }

    
    @Override
    void turnOn()
    {
        System.out.println(brand + " Washing Machine is now ON.");
    }
}


public class AbstracDemo 
{ 
    public static void main(String[] args)
    {
        WashingMachine wm = new WashingMachine("Samsung");
        wm.showBrand(); 
        wm.turnOn();    
    }
}


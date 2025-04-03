
//Write a program that demonstrates inheritance using extends keyword

package com.assignment;


class Vehicle 
{
    String brand;

 
    public Vehicle(String brand) 
    {
        this.brand = brand;
    }

    
    void showDetails() 
    {
        System.out.println("Vehicle Brand: " + brand);
    }
}


class Motor extends Vehicle 
{
    int speed;

    public Motor(String brand, int speed)
    {
        super(brand); 
        this.speed = speed;
    }

   
    @Override
    void showDetails() 
    {
        System.out.println("Motor Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}



class Bike extends Vehicle 
{
    int mileage;

  
    public Bike(String brand, int mileage) 
    {
        super(brand); 
        this.mileage = mileage;
    }

   
    @Override
    void showDetails() 
    {
        System.out.println("Bike Brand: " + brand + ", Mileage: " + mileage + " km/l");
    }
}


public class Inheritance
{
    public static void main(String[] args)
    {
      Motor myMotor = new Motor("Toyota", 180);
        myMotor.showDetails();

        
        Bike myBike = new Bike("Honda", 45);
        myBike.showDetails();
    }
}




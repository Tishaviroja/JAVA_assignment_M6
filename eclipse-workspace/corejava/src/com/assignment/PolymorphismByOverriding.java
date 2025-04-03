// Implement runtime polymorphism by overriding methods in the child class




package com.assignment;


class Shape 
{
 
 void draw() 
 {
     System.out.println("Drawing a shape...");
 }
}


class Circle extends Shape 
{

 @Override
 void draw() 
 {
     System.out.println("Drawing a Circle");
 }
}



class Rectangle extends Shape 
{
 
 @Override
 void draw() 
 {
     System.out.println("Drawing a Rectangle");
 }
}


class Triangle extends Shape 
{
 
 @Override
 void draw() 
 {
     System.out.println("Drawing a Triangle");
 }
}


public class PolymorphismByOverriding
{
 public static void main(String[] args)
 {
     
     Shape myShape;

    
     myShape = new Circle();
     myShape.draw(); 

  
     myShape = new Rectangle();
     myShape.draw(); 

 }
}

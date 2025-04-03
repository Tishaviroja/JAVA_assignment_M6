
//Create a custom exception class and use it in your program

package com.assignment;

class InvalidAgeException extends Exception 
{
 public InvalidAgeException(String message) 
 {
     super(message);
 }
}


class AgeValidator 
{

 public static void validateAge(int age) throws InvalidAgeException 
 {
     if (age < 0 || age > 150)
     {
         throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
     } else 
     {
         System.out.println("Valid age: " + age);
     }
 }
}


public class CostomException 
{
 public static void main(String[] args) 
 {
     int[] testAges = {25, -5, 200};

     for (int age : testAges) 
     {
         try {
             AgeValidator.validateAge(age); 
         } catch (InvalidAgeException e) {
             System.out.println("Exception caught: " + e.getMessage());
         }
     }
 }
}


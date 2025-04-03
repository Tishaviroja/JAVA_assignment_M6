
//Create a calculator using arithmetic and relational operators.

package com.assignment;

import java.util.Scanner;

public class Calculatore
{
    public static void main(String[] args) 
    
    {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulus");

        System.out.print("Choose an operation (1-5): ");
        int choice = sc.nextInt();

      //  if (choice >= 1 && choice <= 5)
     //   {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    if (num2 != 0) 
                    {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 4:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 5:
                    if (num2 != 0) 
                    {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Modulus by zero!");
                    }
                    break;
            }
       // }
       // else 
      //  {
       // 	System.out.println("Invalid operation choice!");
       
 

    }
}
//sc.close();


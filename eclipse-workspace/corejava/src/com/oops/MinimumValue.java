package com.oops;

import java.util.Scanner;

public class MinimumValue
{


      
        public static int findMin(int[] arr) 
        {
            int min = arr[0];  
            for (int i = 1; i <arr.length; i++) 
            {
                if (arr[i] < min) 
                {
                    min = arr[i];  
                }
            }
            return min;
        }	
    

    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
    	
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Enter a Number:");
            arr[i] = sc.nextInt();
        }

        
        int minValue = findMin(arr);
        System.out.println("The minimum value in the array is: " + minValue);
    }
}


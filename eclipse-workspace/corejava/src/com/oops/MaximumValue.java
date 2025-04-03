package com.oops;

import java.util.Scanner;

public class MaximumValue
{

	//public class FindMaxValue {
	
		
        public static int findMax(int[] arr) 
        {
            int max = arr[0];  
            for (int i = 1; i < arr.length; i++) 
            {
                if (arr[i] > max) 
                {
                    max = arr[i];  
                }
            }
            return max;
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

        //FindMaxValue.
        int maxValue=findMax(arr);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
}
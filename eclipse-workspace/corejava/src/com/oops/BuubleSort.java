package com.oops;

import java.util.Scanner;

public class BuubleSort 
{
	    public static void bubblesort(int[] arr) 
	    {
	    	
	    	int n = arr.length;

	        for (int i = 0; i < n - 1; i++) 
	        {
	            
	            for (int j = 0; j < n - 1 - i; j++) 
	            {
	                
	                if (arr[j] > arr[j + 1])
	                {
	                    int a = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = a;
	                }
	            }
	        }
	    }

	  
public static void printArray(int[] arr)
{
	        for (int num : arr) 
	        {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }


public static void main(String[] args) 
{
    
	
	int[] arr=new int[5];
	Scanner sc=new Scanner(System.in);
	
			for(int i=0; i<5; i++)
			{
				System.out.println("Enter no:");
				arr[i]=sc.nextInt();
			}
			printArray(arr);

			bubblesort(arr);

			System.out.println("Sorted Array:");
			printArray(arr);
	}
}
		



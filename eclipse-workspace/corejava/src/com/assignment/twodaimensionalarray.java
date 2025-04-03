
//Write a program to perform matrix addition and subtraction using 2D arrays.

package com.assignment;

import java.util.Scanner;

public class twodaimensionalarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        int[][] diffMatrix = new int[rows][cols];

        
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];  
                diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j]; 
            }
        }

        
        System.out.println("\nSum of matrices:");
        printMatrix(sumMatrix);

        System.out.println("\nDifference of matrices:");
        printMatrix(diffMatrix);

        sc.close();
    }

    
    private static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int elem : row) 
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}



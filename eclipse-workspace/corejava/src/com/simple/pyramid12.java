package com.simple;

public class pyramid12
{
    public static void main(String[] args)
    {
    	
        for (int i = 1; i <= 4; i++) 
        {
            int num = 1;
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num);
                num = num * (i-j)/(j);
            }
            System.out.println();
        }
//(i - j)
    }
}
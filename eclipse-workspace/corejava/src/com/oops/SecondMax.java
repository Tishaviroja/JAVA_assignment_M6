package com.oops;

public class SecondMax 
{

	for (int i = 0; i < arr.length; i++) {
        if (arr[i] > firstMax) {
            secondMax = firstMax;  // Update second max to previous first max
            firstMax = arr[i];     // Update first max to the current element
        } else if (arr[i] > secondMax && arr[i] != firstMax) {
            secondMax = arr[i];    // Update second max if current element is smaller than first max
        }
    }
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
	}
}

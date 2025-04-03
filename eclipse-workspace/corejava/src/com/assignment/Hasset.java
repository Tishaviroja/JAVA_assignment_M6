
//Implement a program using HashSet to remove duplicate elements from a list.

package com.assignment;
import java.util.*;

public class Hasset 
{
	 public static void main(String[] args) 
	 {
	      
	        List<String> items = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Grapes");

	        
	        Set<String> uniqueItems = new HashSet<>(items);

	      
	        List<String> resultList = new ArrayList<>(uniqueItems);

	        
	        System.out.println("Original List: " + items);
	        System.out.println("List after removing duplicates: " + resultList);
	    }
}

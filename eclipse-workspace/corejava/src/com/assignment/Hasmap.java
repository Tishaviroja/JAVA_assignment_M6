
//Create a HashMap to store and retrieve key-value pairs.

package com.assignment;
import java.util.HashMap;
import java.util.Map;

public class Hasmap
{
	
	public static void main(String[] args) 
	{
       
        HashMap<String, String> countryCapitals = new HashMap<>();

      
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

       
        String capital = countryCapitals.get("India");
        System.out.println("Capital of India: " + capital);

       
        if (countryCapitals.containsKey("Japan")) 
        {
            System.out.println("Japan is in the map.");
        }

       
        System.out.println("\nCountry - Capital List:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

      
        countryCapitals.remove("France");
        System.out.println("\nAfter Removing France: " + countryCapitals);
    }
}

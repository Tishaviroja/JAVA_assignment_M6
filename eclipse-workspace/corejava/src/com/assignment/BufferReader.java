
//Implement a program that reads a file line by line using BufferedReader.

package com.assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader 
{
    public static void main(String[] args)
    {
        String filePath = "example.txt"; 

      
        readFile(filePath);
    }
 public static void readFile(String filePath) 
 {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            System.out.println("Reading file content line by line:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


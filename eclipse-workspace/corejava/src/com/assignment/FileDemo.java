
//Write a program to read and write content to a file using FileReader and
//FileWriter

package com.assignment;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args) 
    {
        String filePath = "example.txt"; 

        
        writeToFile(filePath, "Hello, this is a sample text written to the file.\nJava File Handling Example!");

       
        readFromFile(filePath);
    }

    public static void writeToFile(String filePath, String content)
    {
        try (FileWriter writer = new FileWriter(filePath)) 
        {
            writer.write(content);
            System.out.println("Content written successfully.");
        } catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

   
    public static void readFromFile(String filePath) 
    {
        try (FileReader reader = new FileReader(filePath)) 
        {
            int character;
            System.out.println("Reading content from file:");
            while ((character = reader.read()) != -1) 
            {
                System.out.print((char) character); // Print each character
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


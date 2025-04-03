
//Create a program that reads from one file and writes the content to another file.

package com.assignment;

import java.io.*;

public class FileExample 
{
    public static void main(String[] args) 
    {
        
        String sourceFile = "source.txt"; 
        String destinationFile = "destination.txt"; 

        
        copyFileContent(sourceFile, destinationFile);
    }

    public static void copyFileContent(String source, String destination)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) 
        {

            String line;
            while ((line = reader.readLine()) != null) 
            
            {
                writer.write(line);
                writer.newLine(); 
            }

            System.out.println("File content copied successfully from " + source + " to " + destination);

        } catch (IOException e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

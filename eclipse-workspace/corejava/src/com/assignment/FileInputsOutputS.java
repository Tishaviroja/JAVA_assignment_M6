//o Implement a file copy program using FileInputStream and FileOutputStream

package com.assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputsOutputS 
{
    public static void main(String[] args) 
    {
        
        String sourceFile = "source.txt";  
        String destinationFile = "destination.txt"; 

        
        copyFile(sourceFile, destinationFile);
    }

    public static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024]; 
            int bytesRead;

           
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully from " + source + " to " + destination);

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}

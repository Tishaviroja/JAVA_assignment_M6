
//Create a program that demonstrates object serialization and deserialization.

package com.assignment;
import java.io.*;


class Book implements Serializable 
{
 private static final long serialVersionUID = 1L; 
 private String title;
 private String author;
 private double price;

 
 public Book(String title, String author, double price) 
 {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 
 public void display() 
 {
     System.out.println("Book Title: " + title + ", Author: " + author + ", Price: $" + price);
 }
}

public class Serialization 
{
 public static void main(String[] args) 
 {
     String filename = "book.ser"; 

    
     Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99);

     
     serializeBook(book1, filename);

     
     Book deserializedBook = deserializeBook(filename);

    
     if (deserializedBook != null) 
     {
         System.out.println("Deserialized Book:");
         deserializedBook.display();
     }
 }

 
 public static void serializeBook(Book book, String filename) 
 {
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
         out.writeObject(book);
         System.out.println("Book object serialized successfully.");
     } catch (IOException e) 
     {
         System.out.println("Error during serialization: " + e.getMessage());
     }
 }

 
public static Book deserializeBook(String filename)
{
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
    {
        return (Book) in.readObject();
    } catch (IOException | ClassNotFoundException e) 
    {
        System.out.println("Error during deserialization: " + e.getMessage());
        return null;
    }
}
}


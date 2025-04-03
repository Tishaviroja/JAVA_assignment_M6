
//Write a program that demonstrates the use of an ArrayList and LinkedList

package com.assignment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList 
{
    public static void main(String[] args) 
    {
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList Elements: " + arrayList);

       
        arrayList.remove("Banana");
        System.out.println("After Removing 'Banana': " + arrayList);

       
        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) 
        {
            System.out.println(fruit);
        }

        System.out.println("-------------------------------");

      
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("LinkedList Elements: " + linkedList);

        
        linkedList.remove("Cat");
        System.out.println("After Removing 'Cat': " + linkedList);

      
        System.out.println("Iterating over LinkedList:");
        for (String animal : linkedList) 
        {
            System.out.println(animal);
        }
    }
}


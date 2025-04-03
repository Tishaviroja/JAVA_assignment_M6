
//Create a class hierarchy and demonstrate multilevel inheritance.

package com.assignment;


class Person 
{
    String pname = "Tisha";
    int age = 19;

    public void displayPerson() 
    {
        System.out.println("Person name is " + pname);
        System.out.println("Person age is " + age);
    }
}


class Trainer extends Person 
{
    String tname = "Chinmyee Ma'am";
    String subject = "Software Engineering";

    public void displayTrainer() 
    {
        System.out.println("Trainer name is " + tname);
        System.out.println("Trainer subject is " + subject);
    }
}


class Principal extends Trainer 
{
    String priname = "Rahul Sir";
    String techname = "Tops Technologies";

    public void displayPrincipal() 
    {
        System.out.println("Principal name is " + priname);
        System.out.println("Technology name is " + techname);
    }
}


public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        Principal p = new Principal(); 

      
        p.displayPerson();   
        p.displayTrainer(); 
        p.displayPrincipal(); 
    }
}


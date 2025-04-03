
//Create multiple constructors in a class and demonstrate constructor overloading.

package com.assignment;


class Students 
{
    String sname;
    int age;
    String department;

   
    public Students() 
    {
        this.sname = "null";
        this.age = 0;
        this.department = "null";
    }

    
    public Students(String sname, int age) 
    {
        this.sname = sname;
        this.age = age;
        this.department = "Not Assigned"; // Assigning default department
    }


    public Students(String sname, int age, String department) 
    {
        this.sname = sname;
        this.age = age;
        this.department = department;
    }


    public void display() 
    {
        System.out.println("Student Name: " + sname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("----------------------");
    }
}


public class ConstuctorOverloading 
{
    public static void main(String[] args) 
    {
        Students s1 = new Students();
        Students s2 = new Students("Tisha", 19);
        Students s3 = new Students("Tisha", 19, "Savings");

    
        s1.display();
        s2.display();
        s3.display();
    }
}




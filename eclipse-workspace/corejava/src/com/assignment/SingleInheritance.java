
//Write a program demonstrating single inheritance

package com.assignment;


//class Student 
//{
//    String sname = "Tisha";
//    int standard = 5;
//
//    public void display() 
//    {
//        System.out.println("Student name is " + sname);
//        System.out.println("Student Standard is " + standard);
//    }
//}


class Teacher extends Student 
{
	String tname = "Rahul";
    int rno = 1;

   
    public void displayteacher() 
    {
        System.out.println("Teacher name is " + tname);
        System.out.println("Teacher Room no is " + rno);
    }
}


public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Teacher t = new Teacher();
        t.display();
        t.displayteacher();
    }
}

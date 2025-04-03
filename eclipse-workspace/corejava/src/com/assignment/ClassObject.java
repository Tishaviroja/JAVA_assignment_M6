
//Create a class Student with attributes (name, age) and a method to display the
//details.

package com.assignment;

class Student
{
	 String name;
	 int age;
	 
	 public Student()
	 {
		 
	 }
	 public Student(String name, int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	
	 public void display()
	 {
		 System.out.println("name :"+name);
		 System.out.println("age :"+age);
		 
	 }
}
public class ClassObject 
{
	public static void main(String[] args) 
	{
		Student st=new Student("Tisha",19);
		st.display();
		
	}

}

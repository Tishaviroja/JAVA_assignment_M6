
//Demonstrate constructor overloading by passing different types of parameters.

package com.assignment;

class car
{
	String brand;
	int year;
	car()
	{
		this.brand="Unknown";
		this.year=0;
	}
	
	car(String brand)
	{
		this.brand=brand;
		this.year=0;
	}
	
	car(String brand, int yeaar)
	{
		this.brand=brand;
		this.year=yeaar;
		
	}
	
	void display()
	{
		System.out.println("brand is"+brand+"year"+year);
	}
}

class Employee
{
	String name;
	int salary;
	
	Employee()
	{
		this.name="Unknown";
		this.salary=0;
	}
	
	Employee(String name)
	{
		this.name=name;
		this.salary=0;
	}
	
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public void display() 
	{
		System.out.println("name :"+name+"salary"+salary);
	}
	
}
public class Parameters 
{
	public static void main(String[] args) 
	{
		car c1=new car();
		car c2=new car("BMW");
		car c3=new car("BMW", 1995);
		
		System.out.println("Car details............");
		c1.display();
		c2.display();
		c3.display();
		
		
		Employee e1=new Employee();
		Employee e2=new Employee("Tisha");
		Employee e3=new Employee("Tisha", 40000);
		
		
		
		System.out.println("Employee details............");
		
		e1.display();
		e2.display();
		e3.display();
		
	}

}

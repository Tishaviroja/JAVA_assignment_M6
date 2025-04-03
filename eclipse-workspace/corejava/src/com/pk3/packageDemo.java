package com.pk3;

import com.pk1.Car;

public class packageDemo 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setCarData();
		c1.display();
		
		com.pk2.car c2=new com.pk2.car();
		c2.setCarData();
		c2.display();
		
	}

}

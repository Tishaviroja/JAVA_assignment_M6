package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serializableDemo 
{
	public static void main(String[] args) 
	{
		serializableDemo s1=new serializableDemo();
		s1.setserializableData();
		
	}

	private void setserializableData()
	{
		Address address=new Address();
		address.setcountry("india");
		address.setstate("gujarat");
		address.setcity("Ahedabad");
		
		
		try {
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(address);
			oos.flush();
			fos.flush();
			fos.close();
			System.out.println("Data write... ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}

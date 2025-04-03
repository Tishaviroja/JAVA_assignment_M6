package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedDemo 
{
	public static void main(String[] args) 
	{
		DeserializedDemo d1=new DeserializedDemo();
		Address address=d1.getDeserializedData();
		System.out.println(address);
		
	}

	public Address getDeserializedData()
	{
		Address address=null;
		try {
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			address=(Address)ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return address;
	}

	

}

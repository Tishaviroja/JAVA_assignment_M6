package com.io;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			File f1=new File("a4.txt");
			FileOutputStream fos=new FileOutputStream(f1);
			String s="This is Tops Tr=echnologies...";
			byte[] b=s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Write....");
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try 
		{
			FileInputStream fis=new FileInputStream("a1.txt");
			int x;
			while((x=fis.read()) != -1);
			{
				System.out.print((char)x);
			}
			fis.close();
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

package com.io;

import java.io.File;
import java.io.IOException;

class FDemo
{
	File file;
	public FDemo()
	{
		file=new File("a3.txt");
		try {
			file.createNewFile();
			display();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private void display() {
		System.out.println("is directory or not..."+file.isDirectory());
		System.out.println("is file or not..."+file.isFile());
		System.out.println("can read or not..."+file.canRead());
		System.out.println("can write or not..."+file.canWrite());
		System.out.println("can execute or not..."+file.canExecute());
		System.out.println("File name is..."+file.getName());
		System.out.println("File path is..."+file.getPath());
		System.out.println("File Apath is..."+file.getAbsolutePath());
		
		
	}
}
public class FileDemo 
{
	public static void main(String[] args) 
	{
		new FDemo();
		
	}

}

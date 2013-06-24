package com.olabsys.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileInput  {
	public static void main(String args[]) throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/home/anil/Anil/info.txt"));
		
		Student s= (Student) ois.readObject();
		System.out.println(s.no+"   "+s.name);
		
		//System.out.println("ur enter number is"+s.no);
		//System.out.println("ur enter name is "+s.name);
		//s.display();
		
		ois.close();
		
		
	}

}

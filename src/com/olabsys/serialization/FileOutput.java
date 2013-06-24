package com.olabsys.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileOutput  {
	
	public static void main(String args[]) throws Exception
	{
	
	Student s=new Student(1,"anil");
		//Student s=new Student();
		//s.display();
	FileOutputStream fout =new FileOutputStream("/home/anil/Anil/info.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fout);
	oos.writeObject(s);
	oos.flush();
	System.out.println("successfully");
	

}
}

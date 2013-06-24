package com.olabsys.serialization;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable  {
	int no;
	String name;
	
	/*
	public 	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		
	}
	*/

	
	
	
	Student(int no, String name)
	{
		this.no = no;
		this.name = name;
	}
	
	

}

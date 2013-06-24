package com.olabsys.simple;

import java.util.Scanner;

public class Exceptions {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int x=sc.nextInt();
		System.out.println("enter 2nd number");
		int y=sc.nextInt();
		int z;
		try
		{
			z=x/y;
			System.out.println("z value is="+z);
			
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
			//System.out.println(a);
			
		}
	}

}

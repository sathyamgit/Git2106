package com.olabsys.simple;
import java.util.*;
public class ScannerExample {
	
	public void  addNumScanner()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int i =s.nextInt();
		System.out.println("enter 2nd number");
		int j = s.nextInt();
		int k= i+j;
		System.out.println("additin of 2 no.is="+k);
		System.out.println("enter u r name is");
		String name=s.next();
		System.out.println("u r name is ========="+name);
		
		
	
		
	}
	
	
	

	public void addNum(int x, int y)
	
	{
		
		int z = x+y;
		System.out.println("Addtion of 2 no.s" +z);
				
	}
	
	public static void main(String[] args) {
	
		ScannerExample se= new ScannerExample();
		//se.addNum(10,20);
		new ScannerExample().addNumScanner();
	}

}

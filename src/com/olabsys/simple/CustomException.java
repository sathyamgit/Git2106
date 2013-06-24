package com.olabsys.simple;

public class CustomException extends Exception
{
	CustomException(String x)
	{
		super(x);
	}
	
	public static void main(String args[])
	{
		int x=9999;
		try
		{
			if(x<1000)
			{
				System.out.println("sufficient");
			}
			else
			{
				
				CustomException ce=new CustomException("balance low");
				throw ce;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
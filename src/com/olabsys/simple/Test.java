package com.olabsys.simple;

class Test
{
	static int fact(int n)
	{
		if(n == 1)
		
			return 1;
			
			return n*=fact(n-1);
		
	}
	public static void main(String args[])
	{
		int r=fact(5);
		System.out.println(r);
		System.out.println(" end of the line");
	}
}


/*


//factorial of given number is: 

class Test
{
	static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n; i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void main(String args[])
	{
		int result = fact(10);
		System.out.println(result);
	}
}

*/


/*
class Test
{
	public static void main(int args[])
	{
		System.out.println("int args");
	}
	public static void main(String args[])
	{
		System.out.println("form string args");
	}
	
}


*/


/*
class Test
{
	public static void main(String args[])
	{
	String s1="madam";
	String s2 = "           ";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2+=s1.charAt(i);
		
	}
	String S3=s2.trim();
	System.out.println(S3);
	System.out.println("u r entered string is "+s1);
	System.out.println( " u got the string is "+S3);
	//String s3=s2;
	if(s1.equals(S3))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not");
	}
}
}


*/


/*

public class Test extends Exception{
	Test(String x)
	{
		super(x);
	}
	public static void main(String args[])
	{
		int x =9994;
		try
		{
			if(x<1000)
			{
				Test t=new Test("balance low");
				throw t;
			}
			else
			{
				System.out.println("u can withdraw");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

*/

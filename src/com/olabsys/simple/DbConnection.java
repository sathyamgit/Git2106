package com.olabsys.simple;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
static	Connection con = null;
	public static Connection getConnection()
	{
 
	try{
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/test","root","root");
		
	}
	catch(Exception e)
	
	{
	e.printStackTrace();

	}
	}
	return con;

}

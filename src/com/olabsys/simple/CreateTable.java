package com.olabsys.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/test","root","olabsys@123");
		System.out.println("connection created");
		con.close();
		System.out.println("connection close...");
		

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}


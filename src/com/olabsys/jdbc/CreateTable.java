package com.olabsys.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  throws ClassNotFoundException{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/test","root","olabsys@123");
		Statement st = con.createStatement();
		
	      int result=st.executeUpdate("create table emp(empno int,empname varchar(20), sal int)");
	      if(result>0)
	      {
	    	  System.out.println("table created successfully");
	    	  
	      }
	      else
	      {
	    	  System.out.println("sorry table doesnot created");
	      }
		

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
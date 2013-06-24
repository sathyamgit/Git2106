package com.olabsys.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection {

static	Connection con=null;
static  String Driver="com.mysql.jdbc.Driver";
static String dbUrl="jdbc:mysql://192.168.0.108:3306/test";
static String dbUserName="root";
static String dbPassword="olabsys@123";

public static Connection getConnection() throws SQLException 
{
	try {
		if(con == null){
			
		
		
		Class.forName(Driver);
		con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		}
	} 
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}

	
	return con;
}
	


}

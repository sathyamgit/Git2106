package com.olabsys.jdbc;
import java.sql.*;

public class UpdateTable {

	
static 	Connection con=null;
static Statement st=null;
	
	public static void main(String[] args)  {
		
		DbConnection dc=new DbConnection();
		con=dc.getDbConnection();
	try {
			st=con.createStatement();
			String update= "update emp set empname='anilkumar' where empno=1";
			st.executeUpdate(update);
			System.out.println("successfully table record  updated ");
		
			
			
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

}

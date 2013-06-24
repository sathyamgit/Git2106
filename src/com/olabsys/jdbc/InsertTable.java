package com.olabsys.jdbc;

import java.sql.*;

public class InsertTable {

	/**
	 * @param args
	 */
	Statement st = null;
	public static void main(String[] args) throws SQLException {
		
		DbConnection dc=new DbConnection();
		Connection con = dc.getDbConnection();
		
		Statement st=con.createStatement();
		int r= st.executeUpdate("insert into emp values(1,'anil',10000)");
		
		if(r>0)
		{
			System.out.println("row inserted successfully");
		}
		else
		{
			System.out.println("row not inserted successfully");
		}
		
	}

}

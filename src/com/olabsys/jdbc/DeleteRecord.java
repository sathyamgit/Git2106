package com.olabsys.jdbc;
import java.sql.*;

public class DeleteRecord {

	static  Connection con=null;
	static Statement st=null;
	
	public static void main(String[] args) {
		DbConnection dc=new DbConnection();
		con=dc.getDbConnection();
		try {
			st=con.createStatement();
			//String deleteRecord="delete from emp where empno=1";
			//st.executeUpdate(deleteRecord);
			//System.out.println("Record deleted successfully from emp table...");
			
			int deleteRecord=st.executeUpdate("delete from emp where empno=1");
			if(deleteRecord > 0)
			{
				System.out.println("successfully deleted");
				
			}
			else
			{
				System.out.println("table is empty..sorry....");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}




import java.sql.*;


public class DbConnection {
	public static void main(String[] args) {
		
		getDbConnection();
	}
	static  Connection con=null;
	
	static	String Driver ="com.mysql.jdbc.Driver";
	static	 String dbUrl="jdbc:mysql://192.168.0.108:3306/test";
	static String dbUserName="root";
	static String dbPwd="olabsys@123";
	
	public static Connection getDbConnection() 
	{
		
		try
		{
		if(con == null)
		{
			 
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection(dbUrl, dbUserName, dbPwd);
		
			System.out.println("created");
		}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
			
		return  con;
		
	}
	
	
}

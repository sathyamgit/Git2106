package com.olabsys.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class InsertRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static Statement st=null;
	static Connection con=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Fname=request.getParameter("userName");
		String Lname=request.getParameter("passWord");
		//DbConnection dc=new DbConnection();
		try {
			con=DbConnection.getConnection();
			st=con.createStatement();
			String insert="insert into emp values('"+Fname+"','"+Lname+"')";
			st.executeUpdate(insert);
			out.println("successfully inserted username and password..");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

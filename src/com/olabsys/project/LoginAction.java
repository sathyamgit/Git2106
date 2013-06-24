package com.olabsys.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	static Connection con;
	static Statement st;
	int n;
	String fnamedb="";
	String lnamedb="";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		String frname=request.getParameter("fname");
		String lrname=request.getParameter("lname");
		//out.println("ur first name is="+frname);
		//out.println("ur last name is="+lrname);
		DbConnection dc = new DbConnection();
		 try {
			con= dc.getConnection();
			st=con.createStatement();
			if(("".equals(frname ))||("".equals(lrname )))
			{
				System.out.println("plz insert correct data");
				out.println(" please insert the correct data   <a href=UserLogin.html> click here</a>");
				
			}
			//else{
				
				
				/*
			//String insert="insert into emp values('"+frname+"','"+lrname+"')";
			//st.executeUpdate(insert);
			//System.out.println("successfully inserted");
			
			*/
				
				
				
				/*
				
				n=st.executeUpdate("insert into emp values('"+frname+"','"+lrname+"')");
			 if (n > 0)
				{
					System.out.println("successfully Login ...");
					out.println("<h2>successfully login </h2>");
					out.println("<h3> do u want to see emp data </h3>");
					out.println("<a href=Second.html>click</a>");
				}
			 
			 
			 */
			else
			{
			 ResultSet rs=st.executeQuery("select Fname,Lname from emp where Fname='"+frname+"'");
				
			while(rs.next())
			{
				 fnamedb=rs.getString("Fname");
				
				 lnamedb=rs.getString("Lname");
			}
			
			
					if(frname.equals(fnamedb) && lrname.equals(lnamedb))
					{
						out.println("<h5> Login success");
						out.println(" do u want to see emp details <a href=Second.html>click</a>");
						
					}
					else
					{
						out.println("<h4> login failed...plz enter correct data..<a href=UserLogin.html>click here</a>");
						
					}
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

	

}

package com.olabsys.simple;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


//@WebServlet("/Simple")
public class Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/test","root","olabsys@123");
			System.out.println("connection created");
			con.close();
			System.out.println("connection clossed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}

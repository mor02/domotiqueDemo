package com.servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Invoke extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException
	
	{
		RequestDispatcher dispatch = request.getRequestDispatcher("firstJsp.jsp");
		dispatch.forward(request, response);
	}
	

}

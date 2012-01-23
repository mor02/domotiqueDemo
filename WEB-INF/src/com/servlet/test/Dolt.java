package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Dolt extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	
	{
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<h1>Coucou toi !</h1>");
	}
}

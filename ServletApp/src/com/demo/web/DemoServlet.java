package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		String reqData=request.getParameter("input");
		//out.print("{\"make\":\"Maruti\",\"variant\":\"Ignis\",\"price\":600000}");
		out.print(reqData);
		
	}

}

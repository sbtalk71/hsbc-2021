package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.print("<html>");
		out.print("<head>"
				+ "<title>Hello</title>"
				+ "</head>"
				+ "<body>");
		out.print("<h1>Hello from Servlet</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

}

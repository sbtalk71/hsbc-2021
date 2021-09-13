package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoHttpServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		
		NameService nameService=new NameService();
		String result=nameService.concate(fname,lname);
		
		out.print("<html>");
		out.print("<head>"
				+ "<title>Hello</title>"
				+ "</head>"
				+ "<body>");
		out.print("<h1>"+req.getMethod()+":"+result+"</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.print("<html>");
		out.print("<head>"
				+ "<title>Hello</title>"
				+ "</head>"
				+ "<body>");
		out.print("<h1>"+req.getMethod()+" : Hello from Servlet</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

}

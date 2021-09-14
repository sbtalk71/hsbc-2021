package com.hsbc.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init Called...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet Called..."+Thread.currentThread().getName());
		resp.getWriter().write("Hello from servlet...");
	}

	@Override
	public void destroy() {
		System.out.println("destroy Called...");
	}
}

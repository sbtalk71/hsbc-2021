package com.hsbc.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.jdbc.dao.EmpDao;
import com.hsbc.jdbc.dao.EmployeeDaoImpl;
import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpExistsException;

@WebServlet("/")
public class EmpAppController extends HttpServlet {

	EmpDao dao;

	@Override
	public void init(ServletConfig config) throws ServletException {
		dao = new EmployeeDaoImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		System.out.println(requestURI);
		switch (requestURI) {
		case "/emp-app/create":
			req.getRequestDispatcher("/create_employee.jsp").forward(req, resp);
			break;
		case "/emp-app/delete":
			req.getRequestDispatcher("/delete_employee.jsp").forward(req, resp);
			break;
		case "/emp-app/update":
			req.getRequestDispatcher("/update_employee.jsp").forward(req, resp);
			break;
		case "/emp-app/find":
			req.getRequestDispatcher("/find_employee.jsp").forward(req, resp);
			break;
		case "/emp-app/list":
			List<Emp> empList=dao.listAll();
			req.getSession(true).setAttribute("list", empList);
			req.getRequestDispatcher("/list_employee.jsp").forward(req, resp);
			break;
		case "/emp-app/insertEmp":

			try {
				String retVal = insertEmp(req);
				resp.getWriter().write(retVal);
			} catch (EmpExistsException e) {

				e.printStackTrace();
				resp.getWriter().write(e.getMessage());
			}

			break;

		default:
			resp.sendError(404, requestURI + " Not Found");
			break;
		}
	}

	private String insertEmp(HttpServletRequest request) throws EmpExistsException {
		String empId = request.getParameter("empId");
		String doj = request.getParameter("doj");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String city = request.getParameter("city");
		String resp = dao.save(new Emp(Integer.parseInt(empId), name, city, doj, Double.parseDouble(salary)));
		return resp;
	}
}

package com.hsbc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpExistsException;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;
import com.hsbc.jdbc.util.DBUtil;

public class EmployeeDao implements EmpDao {

	@Override
	public Emp findById(int id) throws EmpNotFoundException {
		Emp emp = null;
		try {
			Connection conn = DBUtil.getConnConnection();
			PreparedStatement pst = conn.prepareStatement("select * fromm employee where empno=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				emp = new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"),
						rs.getDate("DOJ").toString(), rs.getDouble("SALARY"));
			} else {
				throw new EmpNotFoundException("EMP NOT FOUND");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;

	}

	@Override
	public String save(Emp emp) throws EmpExistsException {
		String response = "";
		String emp_count = "select count(empno) from employee where empno=" + emp.getEmpId();
		try {
			Connection conn = DBUtil.getConnConnection();

			PreparedStatement pst_1 = conn.prepareStatement(emp_count);
			ResultSet rs = pst_1.executeQuery();
			if (rs.next()) {
				throw new EmpExistsException("Emp exists in the db");
			} else {
				PreparedStatement pst = conn
						.prepareStatement("insert into employee(empno,name,location,doj,salary) value(?,?,?,?,?)");

				pst.setInt(1, emp.getEmpId());
				pst.setString(2, emp.getName());
				pst.setString(3, emp.getCity());
				pst.setString(4, emp.getDoj());

				pst.setDouble(5, emp.getSalary());

				int count = pst.executeUpdate();
				if (count == 1) {
					response = "Employee saved";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;

	}
	@Override
	public String update(Emp emp) throws EmpNotFoundException {
		String response = "";
		String emp_count = "select count(empno) from employee where empno=" + emp.getEmpId();
		try {
			Connection conn = DBUtil.getConnConnection();

			PreparedStatement pst_1 = conn.prepareStatement(emp_count);
			ResultSet rs = pst_1.executeQuery();
			if (!rs.next()) {
				throw new EmpNotFoundException("EMP Not Present to update");
			} else {
				PreparedStatement pst = conn
						.prepareStatement("update employee set name=?,set location=?,set salary=?");
				
				pst.setString(1, emp.getName());
				pst.setString(2, emp.getCity());
				pst.setDouble(3, emp.getSalary());

				int count = pst.executeUpdate();
				if (count == 1) {
					response = "Employee Updated";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;

	}
	
	@Override
	public String delete(int id) throws EmpNotFoundException {
		String response = "";
		String emp_count = "select count(empno) from employee where empno=" +id;
		try {
			Connection conn = DBUtil.getConnConnection();

			PreparedStatement pst_1 = conn.prepareStatement(emp_count);
			ResultSet rs = pst_1.executeQuery();
			if (rs.next()) {
				
				throw new EmpNotFoundException("EMP Not Present to delete");
			} else {
				PreparedStatement pst = conn
						.prepareStatement("delete from employee where empno=?");

				
				pst.setInt(1, id);
				

				int count = pst.executeUpdate();
				if (count == 1) {
					response = "Employee Deleted";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;

	}

}

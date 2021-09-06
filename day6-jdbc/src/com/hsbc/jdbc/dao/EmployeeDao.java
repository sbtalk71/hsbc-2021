package com.hsbc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;
import com.hsbc.jdbc.util.DBUtil;

public class EmployeeDao {

	public Emp findById(int id) throws EmpNotFoundException {
		Emp emp = null;
		try {
			Connection conn = DBUtil.getConnConnection();
			PreparedStatement pst = conn.prepareStatement("select * from employee where empno=?");
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

}

package com.hsbc.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.dao.exceptions.EmpExistsException;
import com.hsbc.spring.dao.exceptions.EmpNotFoundException;
import com.hsbc.spring.entity.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public Emp findById(int id) throws EmpNotFoundException {
		Emp emp = null;
		try {
			emp = jt.queryForObject("select * from employee where empno=" + id, new RowMapper<Emp>() {

				@Override
				public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"),
							rs.getDouble("SALARY"), LocalDate.parse(rs.getString("doj")));
				}

			});
		} catch (EmptyResultDataAccessException ex) {
			//System.out.println("EmpNotFound");
			throw new EmpNotFoundException();

		}
		return emp;
	}

	@Override
	public String save(Emp e) throws EmpExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) throws EmpNotFoundException {
		String message = "";
		try {
			Emp emp = this.findById(id);
			jt.update("delete from employee where empno =" + id);
			message = "Emp deleted";

		} catch (EmptyResultDataAccessException e) {
			throw new EmpNotFoundException();
		}
		return message;
	}

	@Override
	public String update(Emp e) throws EmpNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> listAll() {
		List<Emp> empList = jt.query("select * from employee", new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"),
						rs.getDouble("SALARY"), LocalDate.parse(rs.getString("doj")));
			}

		});
		return empList;
	}

}

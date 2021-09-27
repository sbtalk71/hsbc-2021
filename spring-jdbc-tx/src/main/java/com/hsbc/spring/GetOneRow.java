package com.hsbc.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hsbc.spring.dao.exceptions.EmpNotFoundException;
import com.hsbc.spring.entity.Emp;

public class GetOneRow {

	public static void main(String[] args) throws EmpNotFoundException {
		Emp emp = null;
		String QUERY_SQL = "select * from Employee where empno=1117";

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		try {
			emp = jt.queryForObject(QUERY_SQL, new RowMapper<Emp>() {

				@Override
				public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

					return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"),
							rs.getDouble("SALARY"),LocalDate.parse(rs.getString("doj")));
				}

			});
		} catch (EmptyResultDataAccessException ex) {
			System.out.println("EmpNotFound");
			throw new EmpNotFoundException();

		}

	}

}

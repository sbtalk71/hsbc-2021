package com.hsbc.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hsbc.spring.entity.Emp;

public class GetOneRow {

	public static void main(String[] args) {
		String QUERY_SQL = "select * from Employee where empno=117";

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

		Emp emp = jt.queryForObject(QUERY_SQL, new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"),
						rs.getDouble("SALARY"));
			}

		});
		
		System.out.println(emp);

	}

}

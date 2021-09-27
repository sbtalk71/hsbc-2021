package com.hsbc.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.hsbc.spring.entity.Emp;

public class RowMapperDemo {

	public static void main(String[] args) {
		String QUERY_SQL = "select * from Employee where salary between ? and ?";

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		

		List<Emp> empList = jt.query(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement(QUERY_SQL);
				pst.setDouble(1, 50000);
				pst.setDouble(2, 70000);
				return pst;
			}
		}, new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("LOCATION"), rs.getDouble("SALARY"));
			}

		});
		
		empList.stream().forEach(System.out::println);

	}

}

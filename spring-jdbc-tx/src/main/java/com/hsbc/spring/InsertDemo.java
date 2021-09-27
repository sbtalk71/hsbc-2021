package com.hsbc.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class InsertDemo {

	public static void main(String[] args) {
		
		String INSERT_SQL="insert into employee(empno,name,location,doj,salary) values(?,?,?,?,?)";
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		
		int count=jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst=con.prepareStatement(INSERT_SQL);
				pst.setInt(1, 117);
				pst.setString(2, "Zubin");
				pst.setString(3, "Hyderabad");
				pst.setString(4, "2009-09-21");
				pst.setDouble(5, 89000);
				return pst;
			}
		});
		
		System.out.println("Rows Updated : "+count);

	}

}

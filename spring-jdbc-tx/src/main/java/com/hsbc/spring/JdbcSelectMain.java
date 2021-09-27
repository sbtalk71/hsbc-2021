package com.hsbc.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

public class JdbcSelectMain {

	public static void main(String[] args) {
		String QUERY_SQL="select * from Employee";
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		JdbcTemplate jt= ctx.getBean(JdbcTemplate.class);
		
		jt.query(QUERY_SQL, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME"));
				
			}
		});
		
		

	}

}

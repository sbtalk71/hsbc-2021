package com.hsbc.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.hsbc.spring")
public class JdbcConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		System.out.println("Datasource Created...");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUrl("jdbc:mariadb://localhost:3306/training");
		ds.setUsername("root");
		ds.setPassword("root");
		//System.out.println(System.currentTimeMillis());
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		System.out.println("JdbcTemplate Created...");
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(ds);
		//System.out.println(System.currentTimeMillis());
		return jt;
	}
}

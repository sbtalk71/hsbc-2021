package com.hsbc.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnConnection() throws SQLException{
		Connection conn=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			throw new SQLException("Driver class Not Found..");
		}
		
		return conn;
		
	}
}

package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String sql_select="select * from employee where name like 'Sh%'";
		//Load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		//Get the Connection
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");
		
		System.out.println(conn.getClass().getName());
		
		Statement stmt=conn.createStatement();
		ResultSet rs= stmt.executeQuery(sql_select);
		System.out.println(rs.getClass().getName());
		
		while(rs.next()) {
			
			int id=rs.getInt("EMPNO");
			String name=rs.getString("NAME");
			String location=rs.getString("LOCATION");
			Date doj=rs.getDate("DOJ");
			System.out.println(id+" "+name+" "+location+" "+doj.toString());
		}
		
		
		

	}

}

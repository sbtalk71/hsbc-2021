package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String INSERT_SQL="insert into employee(empno,name,location,doj,salary) value(?,?,?,?,?)";
		
		Class.forName("org.mariadb.jdbc.Driver");
	
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");
		
		PreparedStatement pst=conn.prepareStatement(INSERT_SQL);
		
		pst.setInt(1, 110);
		pst.setString(2, "Karan");
		pst.setString(3, "Noida");
		pst.setString(4, "2018-06-23");
		
		pst.setDouble(5, 76000);
		
		int count= pst.executeUpdate();
		
		if(count==1) {
			System.out.println("Rows Inserted : "+count);
		}
		
		
		

	}

}

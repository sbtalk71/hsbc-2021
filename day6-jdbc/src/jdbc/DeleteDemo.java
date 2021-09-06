package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String DELETE_SQL="delete from employee where empno=?";
		
		Class.forName("org.mariadb.jdbc.Driver");
	
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");
		
		PreparedStatement pst=conn.prepareStatement(DELETE_SQL);
		
		pst.setInt(1, 110);
		
		
		
		int count= pst.executeUpdate();
		
		if(count==1) {
			System.out.println("Rows Deleted : "+count);
		}
		
		
		

	}

}

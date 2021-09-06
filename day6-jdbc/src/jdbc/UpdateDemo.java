package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		String UPDATE_SQL="update employee set salary=? where empno=?";
		
		Class.forName("org.mariadb.jdbc.Driver");
	
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");
		
		PreparedStatement pst=conn.prepareStatement(UPDATE_SQL);
		
		pst.setDouble(1, 90000);
		pst.setInt(2, 108);
		
		int count= pst.executeUpdate();
		
		if(count==1) {
			System.out.println("Rows updated : "+count);
		}
		
		
		

	}

}

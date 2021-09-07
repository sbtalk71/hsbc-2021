package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchWithPst {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		String INSERT_SQL = "insert into employee(empno,name,location,doj,salary) value(?,?,?,?,?)";

		Class.forName("org.mariadb.jdbc.Driver");
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/training", "root", "root");

			PreparedStatement pst = conn.prepareStatement(INSERT_SQL);

			pst.setInt(1, 110);
			pst.setString(2, "Karan");
			pst.setString(3, "Noida");
			pst.setString(4, "2018-06-23");
			pst.setDouble(5, 76000);
			pst.addBatch();

			pst.setInt(1, 111);
			pst.setString(2, "Charan");
			pst.setString(3, "Hyderabad");
			pst.setString(4, "2018-05-22");
			pst.setDouble(5, 66000);
			pst.addBatch();

			pst.setInt(1, 114);
			pst.setString(2, "Jeevan");
			pst.setString(3, "Mumbai");
			pst.setString(4, "2016-06-23");
			pst.setDouble(5, 86000);
			pst.addBatch();

			pst.setInt(1, 113);
			pst.setString(2, "Shiva");
			pst.setString(3, "Bangalore");
			pst.setString(4, "2019-08-29");
			pst.setDouble(5, 96000);
			pst.addBatch();

			conn.setAutoCommit(false);

			int count[] = pst.executeBatch();

			conn.commit();
			System.out.println("Rows Inserted : " + count.length);
		} catch (SQLException e) {
			try {
				conn.rollback();
				
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

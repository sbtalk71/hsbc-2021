package interfaces.app;

import interfaces.MyConnection;
import interfaces.impl.MySQLDB;

public class Main {

	public static void main(String[] args) {
		
		MyConnection conn=new MySQLDB();
		
		System.out.println(conn.getRemoteConnection());
		
		System.out.println(conn.getDBDetails());
		

	}

}

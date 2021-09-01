package interfaces.impl;

import interfaces.MyConnection;

public class MySQLDB implements MyConnection{

	@Override
	public String getRemoteConnection() {
		
		return "MySQL DB Connected...";
	}

	@Override
	public String getDBDetails() {
		return "MYSQL 5.7.1";
	}

}

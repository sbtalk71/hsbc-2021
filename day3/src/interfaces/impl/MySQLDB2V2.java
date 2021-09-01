package interfaces.impl;

import interfaces.MyNewConnection;

public class MySQLDB2V2 implements MyNewConnection{

	@Override
	public String getRemoteConnection() {
		
		return "MySQL DB Connected...";
	}

	@Override
	public String getDBDetails() {
		return "MYSQL 5.7.1";
	}

	@Override
	public String getDBMetaData() {
		// TODO Auto-generated method stub
		return "DB Name XYZ, Driver Ver 2.0 etc etc";
	}
	
	

}

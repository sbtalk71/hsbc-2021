package interfaces.impl;

import interfaces.MyConnection;

public class OracleDB implements MyConnection{

	@Override
	public String getRemoteConnection() {
		
		return "Oracle DB Connected...";
	}

	@Override
	public String getDBDetails() {
		return "Oracle DB 10g";
	}

}

package com.hsbc.day1;

public class Address {

	private String doorNo;
	private int pinCode;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String doorNo, int pinCode,String city) {
		this.doorNo=doorNo;
		this.city=city;
		this.pinCode=pinCode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getCity() {
		return city;
	}
	
	public String getAddress() {
		return this.getDoorNo()+" "+this.getCity()+" "+this.getDoorNo();
	}
}

package com.hsbc.day1;

/**
 * 
 * @author Shantanu Banerjee
 * @deprecated: deprecated since 1.9.0
 *
 */
public class Employee {

	private int empId;
	private String name;
	private double salary;
	private Address address;
	
	public Employee() {
		
	}
	/**
	 * 
	 * @param empId: this is employee id linked to pk of Database
	 * @param name
	 * @param salary
	 * @param address
	 */
	public Employee(int empId, String name, double salary,Address address) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	
	public String getEmpDetails() {
		return empId+" "+name+" "+salary+" "+address.getAddress();
	}


	public int getEmpId() {
		return empId;
	}


	
	
	
}

package com.hsbc.jdbc.entity;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private String doj;
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String name, String city, String doj, double salary) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.doj = doj;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + name + " " + city + " " + doj + " " + salary;
	}
}

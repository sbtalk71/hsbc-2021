package com.hsbc.spring.entity;

import java.time.LocalDate;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private double salary;
	private LocalDate doj;

	public Emp() {

	}

	public Emp(int empId, String name, String city, double salary, LocalDate doj) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.doj = doj;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + name + " " + city + " " + salary+" "+doj;
	}

}

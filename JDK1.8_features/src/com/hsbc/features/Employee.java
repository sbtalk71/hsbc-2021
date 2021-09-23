package com.hsbc.features;

public class Employee /* implements Comparable<Employee> */ {

	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + name + " " + salary;
	}

	@Override
	public int hashCode() {
		// System.out.println("hashCode called..");
		// final int prime = 31;
		// int result = 1;
		// result = prime * result + empId;
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals called..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Employee other = (Employee) obj;
		if (this.empId != other.empId)
			return false;
		return true;
	}
	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * return o.getName().compareTo(this.getName()); }
	 */

}
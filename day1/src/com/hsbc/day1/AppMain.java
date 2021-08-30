package com.hsbc.day1;

public class AppMain {

	public static void main(String[] args) {
		
		Address address=new Address("1-23-112",650078,"Nowhere");
		Employee emp= new Employee(100,"Shantanu",56000,address);
		//emp.empId=100;
		//emp.name="Shantanu";
		//emp.salary=35000;
		
		System.out.println(emp.getEmpDetails());

	}

}

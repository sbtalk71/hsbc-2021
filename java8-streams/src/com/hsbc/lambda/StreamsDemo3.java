package com.hsbc.lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo3 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(100, "James", 46000));
		empList.add(new Employee(101, "Shantanu", 60000));
		empList.add(new Employee(102, "Arun", 65000));
		empList.add(new Employee(103, "Pavan", 70000));
		empList.add(new Employee(104, "Shekhar", 75000));
		empList.add(new Employee(105, "Pretham", 80000));
		empList.add(new Employee(106, "Raja", 85000));
		empList.add(new Employee(105, "Pretham", 66000));

		// print details of all employees with salary >65000
		empList.stream().filter(e -> e.getSalary() > 65000).forEach(System.out::println);

		// update Name
		empList.stream().filter(e -> e.getSalary() > 65000).map(e -> {
			e.setName("Hello " + e.getName());
			return e;
		}).forEach(System.out::println);
		;
		// add the salaries of employees which is less than 65000
		double salary = empList.stream().filter(e -> e.getSalary() < 65000).mapToDouble(e -> e.getSalary())
				.reduce((x, y) -> x + y).getAsDouble();
		System.out.println(salary);
		
		// list all those names which contains Sh
		empList.stream().filter(e -> e.getName().contains("Sh")).forEach(System.out::println);
		// add their salaries
	}

}

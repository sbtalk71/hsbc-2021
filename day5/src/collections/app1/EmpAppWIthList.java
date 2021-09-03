package collections.app1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmpAppWIthList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(100, "James", 56000));
		empList.add(new Employee(101, "Shantanu", 56000));
		empList.add(new Employee(102, "Arun", 56000));
		empList.add(new Employee(103, "Pavan", 56000));
		empList.add(new Employee(104, "Shekhar", 56000));
		empList.add(new Employee(105, "Pretham", 56000));
		empList.add(new Employee(106, "Raja", 56000));
		empList.add(new Employee(105, "Pretham", 56000));
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		Scanner sc = new Scanner(System.in);

		// String resp="";

		/*
		 * while(true) { System.out.println("Enter Emp Id : "); int id=sc.nextInt();
		 * for(Employee emp: empList) { if(emp.getEmpId()==id) {
		 * System.out.println(emp); } } }
		 */
		/*
		 * while(true) { System.out.println("Enter Emp Id : "); int id=sc.nextInt();
		 * Iterator<Employee> itr= empList.iterator(); while(itr.hasNext()) { Employee
		 * emp=itr.next(); if(emp.getEmpId()==id) { System.out.println(emp); break; } }
		 * }
		 */
		System.out.println("After Sort Operation");
		Collections.sort(empList, new MySorter());
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

	private static class MySorter implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
}

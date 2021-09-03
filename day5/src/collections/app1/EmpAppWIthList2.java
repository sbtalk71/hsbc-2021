package collections.app1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EmpAppWIthList2 {

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
		
		//Iterator<Employee> itr= empList.iterator();
		/*
		while (itr.hasNext()) {
			Employee emp= itr.next();
			System.out.println(emp);
			
		}
		*/
		
		ListIterator<Employee> litr=empList.listIterator();
		
		while (litr.hasNext()) {
			Employee emp =  litr.next();
			System.out.println(emp);
			
		}
		
		while (litr.hasPrevious()) {
			Employee emp =  litr.previous();
			System.out.println(emp);
			
		}
		
		while (litr.hasNext()) {
			Employee emp =  litr.next();
			System.out.println(emp);
			
		}
		

		
	}
}

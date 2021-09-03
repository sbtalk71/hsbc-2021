package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collections.app1.Employee;

public class EmpAppWithMap {

	public static void main(String[] args) {
		Map<Integer, Employee> empDb=new HashMap<>();
		empDb.put(100,new Employee(100, "James", 56000));
		empDb.put(101,new Employee(101, "Shantanu", 56000));
		empDb.put(102,new Employee(102, "Arun", 56000));
		empDb.put(103,new Employee(103, "Pavan", 56000));
		empDb.put(104,new Employee(104, "Shekhar", 56000));
		empDb.put(105,new Employee(105, "Pretham", 56000));
		empDb.put(106,new Employee(106, "Raja", 56000));
		empDb.put(107, new Employee(107, "Amit", 56000));

		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter emp id:");
			int id=sc.nextInt();
			if(empDb.containsKey(id)) {
				System.out.println(empDb.get(id));
			}
		}
		
		
	}

}

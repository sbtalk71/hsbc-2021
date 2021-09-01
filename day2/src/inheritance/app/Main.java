package inheritance.app;

import inheritance.Employee;
import inheritance.Person;
import inheritance.TraineeEmp;

public class Main {

	public static void main(String[] args) {
		
		TraineeEmp te= new TraineeEmp(100, "Scott", 70000, "Good");
		Employee emp= new Employee(101, "James", 80000);
		
		System.out.println(emp.getDetails());
		
		
		  Person p= emp; 
		 
		  System.out.println(p.getDetails());
		  
		  
		  p=te;
		  
		  System.out.println(p.getDetails());
		 

	}
	
	
	public void getProtectedData() {
		Person p = new Person(1,"A");
		//p.name="Bear";
	}

}

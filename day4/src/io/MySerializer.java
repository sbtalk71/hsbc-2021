package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee(100, "Shantanu", 80000);
		Employee emp1 = new Employee(101, "Joker", 80000);
		// FileOutputStream fos= new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));

		oos.writeObject(emp);
		oos.writeObject(emp1);
		oos.writeObject(new String("hello"));

		System.out.println("Object is serialized....");

	}

}

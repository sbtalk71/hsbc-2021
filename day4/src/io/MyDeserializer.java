package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {

	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));

		try {
			while (true) {

				Object obj = ois.readObject();
				Employee emp = (Employee) obj;
				System.out.println(emp.getEmpId() + " " + emp.getName() + " " + emp.getSalary());
			}
		} catch (EOFException e) {
			System.out.println("All objects deserialized..");
		}

	}

}

package petstore;

import exceptions.PetNotFoundException;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer();
		try {
		c.queryPet("monkey");
		}catch (PetNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

package petstore;

import exceptions.PetNotFoundException;

public class PetStore {

	PetCache cache = new PetCache();

	public String findPet(String pet) {
		String message = "empty";
		// Animal fountPet=cache.getPet(pet);
		/*
		 * if(fountPet!=null) { return "Pet foud with name "+fountPet.getName(); }else {
		 * return "Pet Not found"; }
		 */

		try {
			Animal fountPet = cache.getPet(pet);
			message = fountPet.getName() + " found";
		} catch (PetNotFoundException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return message;
	}
}

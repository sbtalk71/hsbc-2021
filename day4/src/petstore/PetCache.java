package petstore;

import exceptions.PetNotFoundException;

public class PetCache {

	public Animal getPet(String pet) {
		if (pet.equals("cat")) {
			return new Cat("tom");
		} else if (pet.equals("dog")) {
			return new Dog("jack");
		} else {
			throw new PetNotFoundException("Pet Not Found");
		}
	}
}

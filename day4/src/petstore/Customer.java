package petstore;

public class Customer {

	PetStore store= new PetStore();
	
	public void queryPet(String pet) {
		System.out.println(store.findPet(pet));
	}
}

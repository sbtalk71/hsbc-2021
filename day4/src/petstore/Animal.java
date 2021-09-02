package petstore;

public abstract class Animal {

	private String name;
	public Animal(String name) {
		this.name=name;
	}
	
	abstract public void speak();

	public String getName() {
		return name;
	}
	
	
}

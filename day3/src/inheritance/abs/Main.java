package inheritance.abs;

public class Main {

	public static void main(String[] args) {
		//Animal animal=null;
		
		Dog jack= new Dog("Jack");
		
		Cat tom= new Cat("Tom");
		
		Animal animal=jack;
		animal.speak();
		
		animal=tom;
		animal.speak();
	}

}

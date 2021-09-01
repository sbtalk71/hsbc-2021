package inheritance;

public class Person {
	private int id;
	protected String name;

	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String getDetails() {
		return id+" "+name;
	}
	
	
}

package inheritance;

public class Employee extends Person{

	private double salary;
	
	public Employee(int id, String name,double salary) {
		super(id,name);
		this.salary=salary;
	}
	
	
@Override
public String getDetails() {
	return super.getDetails()+" "+this.salary;
}

public void doFun() {
	System.out.println("We are having fun in java :-(");
}
}

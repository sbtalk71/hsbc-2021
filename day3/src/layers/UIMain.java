package layers;

//A
public class UIMain {

	public static void main(String[] args) {
		//B b
		EmpService service= new EmpService();
		
		String response=service.registerEmp(100);
		System.out.println(response);

	}

}

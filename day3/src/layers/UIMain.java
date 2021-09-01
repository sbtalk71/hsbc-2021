package layers;

public class UIMain {

	public static void main(String[] args) {
		EmpService service= new EmpService();
		
		String response=service.registerEmp(100);
		System.out.println(response);

	}

}

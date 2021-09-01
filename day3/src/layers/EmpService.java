package layers;

public class EmpService {

	private EmpDao dao=new EmpDaoImpl1();
	
	public String registerEmp(int empId) {
		String resp=dao.save(empId);
		if(resp.equals("saved")) {
			return "emp registered";
		}else{
			return "emp not registered";
		}
	}
}

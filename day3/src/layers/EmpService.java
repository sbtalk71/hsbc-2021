package layers;
//B
public class EmpService {

	//C c
	private EmpDao dao=DaoFactory.getDao("dao");
	
	public String registerEmp(int empId) {
		//c.
		String resp=dao.save(empId);
		if(resp.equals("saved")) {
			
			return "emp registered";
		}else{
			return "emp not registered";
		}
	}
}

package layers;

public class EmpDaoJPAImpl implements EmpDao {

	public String save(int id) {
		System.out.println("Data Saved using JPA");
		return "saved";
	}
}

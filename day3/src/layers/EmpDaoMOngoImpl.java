package layers;

public class EmpDaoMOngoImpl implements EmpDao {

	public String save(int id) {
		System.out.println("Data Saved using Mongo Client");
		return "saved";
	}
}

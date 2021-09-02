package layers;

public class EmpDaoJdbcImpl implements EmpDao {

	public String save(int id) {
		System.out.println("Data Saved using JDBC");
		return "saved";
	}
}

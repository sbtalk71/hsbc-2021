package layers;

public class DaoFactory {

	public static EmpDao getDao(String dao) {
		if (dao.equals("mongo")) {
			return new EmpDaoMOngoImpl();
		} else if (dao.equals("jdbc")) {
			return new EmpDaoJdbcImpl();
		} else if (dao.equals("jpa")) {
			return new EmpDaoJPAImpl();
		} else {
			return null;
		}
	}

}

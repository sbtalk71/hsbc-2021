package layers2;

public class BusinessLayer {
	Dao dl;
	public BusinessLayer(Dao dl) {
		this.dl=dl;
	}
	public void doBusiness() {
		dl.getData();
		System.out.println("data Layer called..");
	}
}

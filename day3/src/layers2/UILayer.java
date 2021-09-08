package layers2;

public class UILayer {

	BusinessLayer bl;
	public UILayer(BusinessLayer bl) {
		this.bl=bl;
	}
	public void getBusiness() {
		bl.doBusiness();
		System.out.println("Called Business...");
	}
}

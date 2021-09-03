package collections.app2;

public class TShirt extends Item {

	public TShirt(int itemCode, String color, double itemPrice) {
		super(itemCode,color,itemPrice);
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "TShirt : "+super.getDetails();
	}
}

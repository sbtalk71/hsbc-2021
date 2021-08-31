package inheritance.ex2;

public class Shoe extends Item {

	public Shoe(int itemCode, String color, double itemPrice) {
		super(itemCode,color,itemPrice);
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Shoe : "+super.getDetails();
	}
}

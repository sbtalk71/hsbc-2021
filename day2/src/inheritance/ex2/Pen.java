package inheritance.ex2;

public class Pen extends Item {

	public Pen(int itemCode, String color, double itemPrice) {
		super(itemCode,color,itemPrice);
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Pen : "+super.getDetails();
	}
}

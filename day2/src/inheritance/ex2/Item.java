package inheritance.ex2;

public class Item {
	private int itemCode;
	private String color;
	private double itemPrice;

	public Item(int itemCode, String color, double itemPrice) {
		this.itemCode = itemCode;
		this.color = color;
		this.itemPrice = itemPrice;
	}

	public String getDetails() {

		return itemCode+" "+color+" "+itemPrice;
	}
}

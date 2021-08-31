package inheritance.ex2;

public class ShoppingCart {

	Item[] cart = new Item[5];
	public void addToCart(int index,Item item) {
		cart[index]=item;
	}
	
	public void getCart() {
		for(Item item:cart) {
			System.out.println(item.getDetails());
		}
	}
}

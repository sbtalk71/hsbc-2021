package collections.app2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> cart = new ArrayList<Item>();

	public void addToCart(Item item) {
		cart.add(item);
	}

	public void getCart() {
		if (cart.size() > 0) {
			for (Item item : cart) {
				System.out.println(item.getDetails());
			}
		} else {
			System.out.println(" Cart is empty");
		}
	}

	public void deleteCart() {
		cart.clear();
	}
}

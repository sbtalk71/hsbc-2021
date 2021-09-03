package maps;

public class CartApp {

	public static void main(String[] args) {
		MyCart cart=new MyCart();
		cart.addToCart("pen", 1);
		cart.addToCart("mobile", 2);
		cart.addToCart("pen", 2);
		cart.addToCart("pencil", 2);
		cart.addToCart("pencil", 2);
		
		cart.displayCart();
		
		System.out.println(cart.getItems());

	}

}

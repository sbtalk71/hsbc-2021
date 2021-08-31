package inheritance.ex2;

public class Main {

	public static void main(String[] args) {
		ShoppingCart sc= new ShoppingCart();
		sc.addToCart(0, new TShirt(100, "Red", 300));
		sc.addToCart(1, new Shoe(101, "Grey", 890));
		sc.addToCart(2, new Pen(102, "Pen", 100));
		sc.addToCart(3, new Shoe(103, "Red", 300));
		sc.addToCart(4, new TShirt(104, "Blue", 300));
		
		sc.getCart();
		

	}

}

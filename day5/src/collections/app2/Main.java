package collections.app2;

public class Main {

	public static void main(String[] args) {
		ShoppingCart sc= new ShoppingCart();
		sc.addToCart(new TShirt(100, "Red", 300));
		sc.addToCart(new Shoe(101, "Grey", 890));
		sc.addToCart(new Pen(102, "Pen", 100));
		sc.addToCart(new Shoe(103, "Red", 300));
		sc.addToCart(new TShirt(104, "Blue", 300));
		
		sc.getCart();
		
		sc.deleteCart();
		
		sc.getCart();
		//Item item=new TShirt(100, "Red", 300);
		
		//System.out.println(item);
		
		
		

	}

}

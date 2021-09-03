package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCart {

	Map<String, Integer> cart=new HashMap<>();
	
	public void addToCart(String item,int quantity) {
		if(cart.containsKey(item)) {
			int newValue=cart.get(item)+quantity;
			cart.put(item, newValue);
		}else {;
			cart.put(item, quantity);
		}
	}
	
	
	public void displayCart() {
		
		Set<String> keys=cart.keySet();
		for(String item:keys) {
			System.out.println(item+":"+cart.get(item));
		}
	}
	
public List<String> getItems() {
		
		List<String> items=new ArrayList<String>(cart.keySet());
		return items;
	}
}

package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> namesList=new ArrayList<>();
		
		namesList.add("shantanu");
		namesList.add("kiran");
		namesList.add("paul");
		namesList.add("rani");
		namesList.add("kiran");
		
		System.out.println(namesList);
		
		Iterator<String> itr=namesList.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			name="Hello "+name;
			System.out.println(name);
		}
		
		namesList.remove("paul");
		namesList.remove(2);
				
		for(String s:namesList) {
			System.out.println(s);
		}
		
		System.out.println(namesList);
		
		
		
		

	}

}

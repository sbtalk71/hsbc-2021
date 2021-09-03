package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set<String> namesSet=new HashSet<>();
		//SortedSet<String> namesSet=new TreeSet<>();
		Set<String> namesSet=new LinkedHashSet<>();
		
		namesSet.add("shantanu");
		namesSet.add("kiran");
		namesSet.add("paul");
		namesSet.add("rani");
		namesSet.add("kiran");
		
		System.out.println(namesSet);
		
		Iterator<String> itr=namesSet.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			name="Hello "+name;
			System.out.println(name);
		}
		
		namesSet.remove("paul");
				
		for(String s:namesSet) {
			System.out.println(s);
		}
		
		System.out.println(namesSet);
		
		
		
		

	}

}

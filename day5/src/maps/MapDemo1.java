package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> namesMap=new HashMap<>();
		
		namesMap.put(100, "Shantanu");
		namesMap.put(102, "Raja");
		namesMap.put(103, "Dev");
		namesMap.put(104, "Ratan");
		namesMap.put(104, "James");
		
		System.out.println(namesMap);
		
		System.out.println(namesMap.get(100));
		

		Set<Integer> keys=namesMap.keySet();
		for(Integer id:keys) {
			System.out.println(id+" : "+namesMap.get(id));
		}
	}

}

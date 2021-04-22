package day10.demo4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * LinkedHashMap
 * TreeMap
 */
public class D1MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		// put into the hashmap
		map.put("d", "delhi");
		map.put("a", "ambala");
		map.put("c", "chennai");
		
		
		// late on add also
		map.put("m", "mumbai");
		map.put("m", "MUMBAIIII");
		
		// remove from map
		map.remove("a");
		
		// GET ALL THE KEYS
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		// GET ALL THE VALUES
		Collection<String> values = map.values();
		System.out.println(values);
		
		
		// SPL USE CASE ::  Iterate the Map :: DIfferent from List, Set
		for(Map.Entry<String, String> entrySet : map.entrySet()) {
			String key = entrySet.getKey();
			String value = entrySet.getValue();
			System.out.println(key + " " + value);
		}
		
		
		System.out.println(map);
	}
}

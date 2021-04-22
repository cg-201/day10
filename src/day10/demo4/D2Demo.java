package day10.demo4;

import java.util.HashMap;
import java.util.Map;

public class D2Demo {
	
	public static void main(String[] args) {
		
		String text = "hello world";
		
		Map<Character, Integer> map = new HashMap<>();
		
		// Enhanced for loop
		for(char ch : text.toCharArray()) {
			// System.out.println(ch);
			
			if(map.containsKey(ch)) {
				int existingValue = map.get(ch);
				
				// update by +1
				map.put(ch, existingValue +1);
			} else {
				// first time char
				map.put(ch, 1);
			}
			
		}
		
		
		System.out.println(map);
	}
}

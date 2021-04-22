package day10.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D1Demo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// add in the end
		list.add("delhi");
		list.add("calcutta");
		list.add("mumbai");
		list.add("chennai");
		list.add("pune");
		
		// add at specific position
		list.add(0, "patna");
		list.add(3, "navi mumbai");
		
		// set :: replacing the elment
		list.set(4, "MUMBAI");
		list.set(0, "PATANA");
		
		
		// Check if an Item exists :: find / search
		boolean checkPune = list.contains("punee");
		System.out.println(checkPune);
		
		
		System.out.println(list);
		
		// remove from specic position
		list.remove(3);
		list.remove("patna");
		
		// list.remove("delhi");
		// list.remove("calcutta");
		list.removeAll(Arrays.asList("delhi", "calcutta"));
		
		// if u want to clear the list
		// list.clear();
		
		
		System.out.println(list);
		
	}
}

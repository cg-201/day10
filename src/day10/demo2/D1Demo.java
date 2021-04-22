package day10.demo2;

import java.util.HashSet;
import java.util.Set;

public class D1Demo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// add object
		set.add("delhi");
		set.add("calcutta");
		set.add("mumbai");
		set.add("mumbai");

		
		// search
		boolean findMumbai = set.contains("mumbai");
		System.out.println(findMumbai);
		
		
		// remove by object
		set.remove("delhi");
		
		// clear all the item
		// set.clear();
		
		
		System.out.println(set);
	}
}

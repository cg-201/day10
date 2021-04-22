package day10.demo2;

import java.util.HashSet;
import java.util.Set;

public class D2Demo {
	
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		
		// add
		set.add(new Person(1, "a", "a@a", "1212121212"));
		set.add(new Person(1, "a", "a@a", "1212121212"));
		set.add(new Person(2, "b", "b@a", "2212121212"));
		
		
		// search / find
		boolean findTwo = set.contains(new Person(2, "b", "b@b", "323232"));
		System.out.println(findTwo);
		
		
		// remove
		set.remove(new Person(2, "b", "b@b", "323232"));
		
		System.out.println(set.size());
		System.out.println(set);
	}

}

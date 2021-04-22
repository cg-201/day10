package day10.demo1;

import java.util.ArrayList;
import java.util.List;

public class D3Demo {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(1, "A", "a@", "211211"));
		list.add(new Person(2, "B", "b@", "32323"));
		
		// System.out.println(list);
		list.add(0, new Person(26, "z", "z@", "21221"));
		
		
		// Removing
		list.remove(0);
		list.remove(new Person(1, "A", "a@", "211211"));
		
		System.out.println(list);
		
	}
}

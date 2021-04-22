package day10.demo1;

import java.util.ArrayList;
import java.util.List;

public class D6MergeTwoArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("C");
		list1.add("D");
		
		
		list.addAll(list1);
		
		System.out.println(list1);
		System.out.println(list);
	}

}

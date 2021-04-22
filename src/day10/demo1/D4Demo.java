package day10.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class D4Demo {

	public static void main(String[] args) {
		
		// Not Thread Safe :: access the element is faster here.
		List<String> list = new ArrayList<>();
		
		// Add, Update and Remove operation is faster here.
		List<String> list1 = new LinkedList<>();
		
		
		
		// Thread Safe
		List<String> list2 = new Vector<>();
		
	}
}

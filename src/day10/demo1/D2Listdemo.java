package day10.demo1;

import java.util.ArrayList;
import java.util.List;

public class D2Listdemo {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(3);
		list.add(41);
		
		
		list.add(0, 7);
		list.set(1, 77);
		
		list.remove(2);
		list.remove(new Integer(41));
		
		System.out.println(list);
	}
}

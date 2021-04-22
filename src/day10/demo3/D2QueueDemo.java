package day10.demo3;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class D2QueueDemo {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("delhi");
		queue.add("calcutta");
		queue.add("mumbai");
		queue.add("chennai");
		
		System.out.println(queue);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
	}
}

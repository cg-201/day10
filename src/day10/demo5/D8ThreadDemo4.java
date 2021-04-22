package day10.demo5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;

public class D8ThreadDemo4 {

	public static void main(String[] args)  throws Exception {
		
		// Set<String> list = new HashSet<>();
		 Set<String> list = new CopyOnWriteArraySet<>();
		list.add("Delhi");
		list.add("Calcutta");
		list.add("Chennai!!");
		list.add("Mumbai");
		
		
		// Seprate Thread
		Runnable task = () -> {
			try {
				Thread.currentThread().setName("THREAD-5Demo");
				Thread.sleep(1000);
				
				System.out.println("CHID1 " + list);
				list.add("Pune");
				
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		
		// Java 5. Concurrent Pattern / Library :: starting the thread.
		Executors.newSingleThreadExecutor().submit(task); 										
		
		
		// main thread 
		System.out.println(Thread.currentThread().getName());
		System.out.println("MAIN " + list);
		for(String item : list) {
			System.out.println(item);
			Thread.sleep(1000);
		}
		
	}
}

package day10.demo5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

public class D7ThreadDemo3 {

	public static void main(String[] args)  throws Exception {
		
		// List<String> list = new ArrayList<>();
		List<String> list = new CopyOnWriteArrayList<String>();
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

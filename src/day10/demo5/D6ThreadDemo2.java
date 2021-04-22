package day10.demo5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class D6ThreadDemo2 {

	public static void main(String[] args)  {
		
		List<String> list = new ArrayList<>();
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
		
	}
}

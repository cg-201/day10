package day10.demo5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public class D9ThreadDemo5 {

	public static void main(String[] args)  throws Exception {
		
		// Map<String, String> map = new HashMap<>();
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("d", "Delhi");
		map.put("c", "Calcutta");
		map.put("a", "ambala");
		
		
		// Seprate Thread
		Runnable task = () -> {
			try {
				Thread.currentThread().setName("THREAD-5Demo");
				Thread.sleep(1000);
				
				System.out.println("CHID1 " + map);
				map.put("p", "pune");
				
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		
		// Java 5. Concurrent Pattern / Library :: starting the thread.
		Executors.newSingleThreadExecutor().submit(task); 										
		
		
		// main thread 
		System.out.println(Thread.currentThread().getName());
		System.out.println("MAIN " + map);
		
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			Thread.sleep(1000);
		}
		System.out.println(map);
		
	}
}

package day10.demo5;

import java.util.concurrent.Executors;

public class D5ThreadDemo {

	public static void main(String[] args)  {
		
		
		Runnable task = () -> {
			try {
				Thread.currentThread().setName("THREAD-5Demo");
				Thread.sleep(5000);
				
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		
		// Java 5. Concurrent Patter / Library :: starting the thread.
		Executors.newSingleThreadExecutor().submit(task); 										
		
		
		// main thread 
		System.out.println(Thread.currentThread().getName());
		
	}
}

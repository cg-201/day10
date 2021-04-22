package day10.demo5;

public class D4ThreadDemo2 {

	public static void main(String[] args)  {
		
		
		Runnable r = () -> {
			try {
				Thread.currentThread().setName("THREAD-1");
				Thread.sleep(10000);
				
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		};
		
		
		// Starting the thread.
		Thread t = new Thread(r);
		t.start(); 										
		
		
		// main thread 
		System.out.println(Thread.currentThread().getName());
		
	}
}

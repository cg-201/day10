package day10.demo5;

public class D3ThreadDemo {

	public static void main(String[] args) {
		
		
		Runnable r = () -> {
			Thread.currentThread().setName("THREAD-1");
			System.out.println(Thread.currentThread().getName());
		};
		
		
		// Starting the thread.
		Thread t = new Thread(r);
		t.start(); 										
		
		
		System.out.println(Thread.currentThread().getName());
		
	}
}

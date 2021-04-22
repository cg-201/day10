package day10.demo5;

public class D2ThreadDemo {

	public static void main(String[] args) {
		
		// Implement a runnable interface
		Runnable r1 = () -> System.out.println("Hello WOrld");
		
		Thread t = new Thread(r1);
		
		// starting a new thread :: starign new tab
		t.start();
		
		
		System.out.println("Helloo!!");
		
	}
}

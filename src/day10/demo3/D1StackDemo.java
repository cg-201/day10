package day10.demo3;

import java.util.Stack;

public class D1StackDemo {
	
	// LIFO
	public static void main(String[] args) {
		
		// In built ds
		Stack<String> stack = new Stack<>();
		
		
		// PUSH
		stack.push("delhi");
		stack.push("calcutta");
		stack.push("mumbai");
		stack.push("chennai");
		
		System.out.println(stack);
		
		String lastElement = stack.pop();
		System.out.println(lastElement);
		
		
		System.out.println(stack.pop());
		
	}

}

package org.ottolini.tema10.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.add("1-Jaime");
		deque.add("2-Mito");
		deque.add("3-Code");
		
		String x = deque.peek();
		System.out.println("peek: " + x);
		
		x = deque.poll(); //retira elemento do início
		System.out.println("poll: " + x);
		
		x = deque.pop(); 
		System.out.println("pop: " + x);
		
		
		for(String s:deque) {
			System.out.println(s);
		}
	}
}

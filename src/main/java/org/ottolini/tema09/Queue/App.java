package org.ottolini.tema09.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) throws InterruptedException {
			
		Queue<Pessoa> fila = new PriorityQueue<>();
		fila.offer(new Pessoa(1,"MitoCode", 12));
		fila.offer(new Pessoa(2,"Code", 23));
		fila.offer(new Pessoa(3,"Mito", 45));
		fila.offer(new Pessoa(4,"Jaime", 64));

		for(Pessoa elem:fila) {
			System.out.println(elem);
		}
		
		System.out.println("\nPróximo: " + fila.peek() + "\n");
		
		while(!fila.isEmpty()) {
			System.out.println("Atendendo: " + fila.poll());
			Thread.sleep(1000);
		}
	}
}

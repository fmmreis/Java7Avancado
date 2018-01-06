package org.ottolini.tema08.Stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) throws InterruptedException {
		//push()
		//pop()
		//peek()
		//search()
		
		Stack<Pessoa> pilha = new Stack<>();
		pilha.push(new Pessoa(1, "MitoCode", 23));
		pilha.push(new Pessoa(2, "Code", 43));
		pilha.push(new Pessoa(3, "Mito", 21));
		pilha.push(new Pessoa(4, "Jaime", 24));


		
		for(Pessoa s:pilha) {
			System.out.println(s);
		}
		
		System.out.println("Topo da pilha: " + pilha.peek());
		System.out.println("Procurar elemento CCC: " + pilha.search(new Pessoa(2, "Code", 43)));
	
		System.out.println("\nFIFO");
		while(!pilha.isEmpty()) {
			System.out.println("Atendendo " + pilha.pop());
			Thread.sleep(1000);
		}		
	}
}

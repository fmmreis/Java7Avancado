package org.ottolini.tema07.HashSet;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		//unique values / random order
		Set<Pessoa> lista = new HashSet<>();
		lista.add(new Pessoa(1, "Fernando", 23));
		lista.add(new Pessoa(2, "Vasco", 24));
		lista.add(new Pessoa(3, "Fernando", 52));
		lista.add(new Pessoa(4, "Fernando", 23));
		lista.add(new Pessoa(5, "António", 34));
		
		for(Pessoa elem: lista) {
			System.out.println(elem.getNome() + " " + elem.getIdade());
		}
	}

}

package org.ottolini.tema07.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

import org.ottolini.tema07.LinkedHashSet.Pessoa;

public class App {

	public static void main(String[] args) {
		//unique values / insert order
		Set<Pessoa> lista = new LinkedHashSet<>();
		
		lista.add(new Pessoa(1, "Fernando", 23));
		lista.add(new Pessoa(2, "Vasco", 24));
		lista.add(new Pessoa(3, "Fernando", 52));
		lista.add(new Pessoa(4, "Fernando", 23));
		lista.add(new Pessoa(5, "António", 34));
		
		for(Pessoa pess: lista){
			System.out.println(pess.getNome() + " " + pess.getIdade());
		}
	}
}

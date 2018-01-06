package org.ottolini.tema06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppComparable {

	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(new Pessoa(1, "José", 23));
		lista.add(new Pessoa(2, "Vasco", 24));
		lista.add(new Pessoa(3, "Fernando", 52));
		lista.add(new Pessoa(3, "Fernando", 51));
		lista.add(new Pessoa(3, "António", 34));
		
		//it could be implemented with a different more advanced algorithm
		for(Pessoa pessoa: lista) {
			System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
		}
		System.out.println();
		
//		Collections.reverse(lista);
//		for(Pessoa pessoa: lista) {
//			System.out.println(pessoa.getNome() + " " +  pessoa.getIdade());
//		}
//		System.out.println();
		
		Collections.sort(lista);
		for(Pessoa pessoa: lista) {
			System.out.println(pessoa.getNome() + " " +  pessoa.getIdade());
		}
	}
}

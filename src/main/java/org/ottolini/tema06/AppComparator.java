package org.ottolini.tema06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppComparator {

	public static void main(String[] args) {
		
		List<Pessoa2> lista = new ArrayList<>();
		
		lista.add(new Pessoa2(1, "José", 23));
		lista.add(new Pessoa2(2, "Vasco", 24));
		lista.add(new Pessoa2(3, "Fernando", 52));
		lista.add(new Pessoa2(3, "Fernando", 51));
		lista.add(new Pessoa2(3, "António", 34));
		
		//it could be implemented with a different more advanced algorithm
		for(Pessoa2 pessoa: lista) {
			System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
		}
		System.out.println();
		
//		Collections.reverse(lista);
//		for(Pessoa2 pessoa: lista) {
//			System.out.println(pessoa.getNome() + " " +  pessoa.getIdade());
//		}
//		System.out.println();
		
		Collections.sort(lista, new PessoaComparator());
		for(Pessoa2 pessoa: lista) {
			System.out.println(pessoa.getNome() + " " +  pessoa.getIdade());
		}
	}
}

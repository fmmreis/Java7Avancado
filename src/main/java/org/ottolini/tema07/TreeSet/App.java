package org.ottolini.tema07.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//unique values / ascending order
		Set<Pessoa> lista = new TreeSet<>();
		lista.add(new Pessoa(1, "MitoCode", 22));
		lista.add(new Pessoa(2, "Code", 23));
		lista.add(new Pessoa(3, "Mito", 24));
		lista.add(new Pessoa(4, "Jaime", 25));
		lista.add(new Pessoa(5, "Mito", 26));
		lista.add(new Pessoa(6, "AAA", 27));
		lista.add(new Pessoa(7, "AAA", 27));
		
		for(Pessoa elem: lista) {
			System.out.println(elem.getNome() + " " + elem.getIdade());
		}
	}
}

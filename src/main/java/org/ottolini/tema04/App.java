package org.ottolini.tema04;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class App {
	
	public static void main(String[] args) {
		
		Classe<Integer> c = new Classe<>(1);
		c.mostrarTipo();
		
		System.out.println("***********************************");
		Classe2<Integer, String, Double, Long> c2 = new Classe2<>(52, "Teste", 23.4, 234L);
		c2.mostrarTipo();
		
		System.out.println("***********************************");
		List<Classe2<Integer, String, Double, Long>> lista = new ArrayList<>();
		lista.add(new Classe2<Integer, String, Double, Long>(23, "teste1", 12.4, 34L));
		lista.add(new Classe2<Integer, String, Double, Long>(23, "teste2", 12.4, 34L));
		for(Classe2<Integer, String, Double, Long> c3 : lista) {
			c3.mostrarTipo();
			System.out.println("-------------------------------");
		}
	}
}

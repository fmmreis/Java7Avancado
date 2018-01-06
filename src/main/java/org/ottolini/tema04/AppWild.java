package org.ottolini.tema04;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

	public void listarUnbounded(List<?> lista) {
		for (Object obj : lista) {
			System.out.println(((Pessoa)obj).getNome());
		}
	}
	
	public void listarUpperBounded(List<? extends Pessoa> lista) {
		for (Pessoa pes : lista) {
			System.out.println(pes.getNome());
		}
	}
	
	public void listarLowerBounded(List<? super Aluno> lista) {
		for (Object al : lista) {
			System.out.println(((Pessoa)al).getNome());
		}
	}

	public static void main(String[] args) {
		AppWild aw = new AppWild();

		Pessoa a1 = new Professor("Professor1");
		Pessoa a2 = new Professor("Professor2");
		Pessoa a3 = new Professor("Professor3");

		List<Pessoa> lista = new ArrayList<>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

		
		aw.listarUpperBounded(lista);
		System.out.println();
		aw.listarLowerBounded(lista);
		System.out.println();
		aw.listarUnbounded(lista);

		
	}
}

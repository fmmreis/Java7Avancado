package org.ottolini.tema02;


import java.util.ArrayList;
import java.util.List;

// instaceof operator

public class App {
	
	private  List cesta = new ArrayList();
	
	private void verificar(Object obj) {
		if(obj instanceof Fruta) {
			cesta.add(obj);
			System.out.println("Adicionado " + ((Fruta) obj).getNome());
		} else {
			System.out.println("Não adicionado");
		}
	}

	public static void main(String[] args) {
		String texto = new String("MitoCode");
		if(texto instanceof String) {
			System.out.println("É uma String");
		}
		
		Pessoa pessoa = new Pessoa();
		if (pessoa instanceof Pessoa) {
			System.out.println("É uma Pessoa");
		}
		
		Aluno aluno = new Aluno();
		if (aluno instanceof Pessoa) {
			System.out.println("É uma Pessoa");
		}
		
		
		App app = new App();
		System.out.println("Adicionar unicamente frutas à cesta");
		app.verificar(new Laranja("Laranja verde"));
		app.verificar(new Laranja("Laranja madura"));
		app.verificar(new Pera("Pera madura"));
		app.verificar(new Pera("Pera madura"));
		app.verificar(new Bolacha());
	}	
}

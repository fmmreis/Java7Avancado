package org.ottolini.tema03;

public class Conexao {

	//instancia is a static variable i.e. a class level variable, so it is shared across all
	//instances of the class
	private static Conexao instancia = null;

	public Conexao getInstance() {
		if (instancia == null) {
			instancia = new Conexao();
		}
		return instancia;
	}
	
	//default constructor does not exist anymore, the only way to create
	//an object is invoking the getInstance method
	private Conexao() {
		
	}
}

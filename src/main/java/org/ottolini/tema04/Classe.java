package org.ottolini.tema04;

public class Classe<T> {
	
	/*
	 Estereótipos;
	 E - Element - used extensively by collections
	 K - Key
	 N - Number
	 T - Type
	 V - Value
	 S,U,V etc. - 2nd, 3nd, 4th types
	 */
	
	private T objecto;
	
	public Classe(T objecto) {
		this.objecto = objecto;
	}
	
	public void mostrarTipo() {
		System.out.println("T é do tipo: " + objecto.getClass().getName());
	}
}

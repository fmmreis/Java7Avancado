package org.ottolini.tema04;

public class Classe2<K,T,E,V> {
	
	/*
	 Estereótipos;
	 E - Element - used extensively by collections
	 K - Key
	 N - Number
	 T - Type
	 V - Value
	 S,U,V etc. - 2nd, 3nd, 4th types
	 */
	
	private K objectoK;
	private T objectoT;
	private E objectoE;
	private V objectoV;
	
	public Classe2(K objectoK, T objectoT, E objectoE, V objectoV) {
		this.objectoK = objectoK;
		this.objectoT = objectoT;
		this.objectoE = objectoE;
		this.objectoV = objectoV;	
	}
	
	public void mostrarTipo() {
		System.out.println("K é do tipo: " + objectoK.getClass().getName());
		System.out.println("T é do tipo: " + objectoT.getClass().getName());
		System.out.println("E é do tipo: " + objectoE.getClass().getName());
		System.out.println("V é do tipo: " + objectoV.getClass().getName());
	}
}

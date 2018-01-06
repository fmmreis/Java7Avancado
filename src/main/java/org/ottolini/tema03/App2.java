package org.ottolini.tema03;

//singleton pattern
public class App2 {

	public static void main(String[] args) {
		
		for (Object obj : PaisDAOImpl2.getPaises()) {
			System.out.println(((Pais) obj).getNome());
		}
		
		for (Object obj : PaisDAOImpl2.getPaises()) {
			System.out.println(((Pais) obj).getNome());
		}
	}
}

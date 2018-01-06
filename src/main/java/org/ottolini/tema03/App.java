package org.ottolini.tema03;

//singleton pattern
public class App {

	public static void main(String[] args) {

		// PaisDAOImpl dao = new PaisDAOImpl();
		// for(Object obj: dao.getPaises()) {
		// System.out.println(((Pais) obj).getNome());
		// }
		//
		// System.out.println("***************************");
		//
		// PaisDAOImpl dao2 = new PaisDAOImpl();
		// for(Object obj: dao2.getPaises()) {
		// System.out.println(((Pais) obj).getNome());
		// }

		PaisDAOImpl dao1 = PaisDAOImpl.getInstance();
		for (Object obj : dao1.getPaises()) {
			System.out.println(((Pais) obj).getNome());
		}
		
		PaisDAOImpl dao2 = PaisDAOImpl.getInstance();
		for (Object obj : dao2.getPaises()) {
			System.out.println(((Pais) obj).getNome());
		}
	}
}

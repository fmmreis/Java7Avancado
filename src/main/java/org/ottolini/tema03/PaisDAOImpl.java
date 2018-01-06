package org.ottolini.tema03;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl {
	private static PaisDAOImpl instancia = new PaisDAOImpl();
	
	public static PaisDAOImpl getInstance() {
//		if(instancia == null) {
//			instancia = new PaisDAOImpl();
//		}
		return instancia;
	}
	
	//Constructor private
	private PaisDAOImpl() {}
	
	private List paises = null;
	
	public List getPaises() {
		if(paises == null) {
			paises = new ArrayList();
			 
			Pais p1 = new Pais("MEXICO");
			Pais p2 = new Pais("PERU");
			Pais p3 = new Pais("COLOMBIA");
			
			paises.add(p1);
			paises.add(p2);
			paises.add(p3);
		}
		return paises;
	}
}

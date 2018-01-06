package org.ottolini.tema03;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOImpl2 {
	//Constructor private
	private PaisDAOImpl2() {}
	
	private static List paises = null;
	
	public static List getPaises() {
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

package org.ottolini.tema23.Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherApp {

	public static void main(String[] args) {
		String texto = "Subscribete al canal de MitoCode";
		
//		boolean b = Pattern.compile(".*mitocode*.", Pattern.CASE_INSENSITIVE).matcher(texto).matches();
//		System.out.println(b);
		
		Pattern p = Pattern.compile("mitocode",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(texto);
		
		System.out.println("matches " + m.matches());
		System.out.println("matches " + m.lookingAt());
		
		int contador = 0;
		while(m.find()) {
			contador++;
			System.out.println("Correspondencia nº " + contador);
		}
		

			
	}
}

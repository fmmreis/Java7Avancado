package org.ottolini.tema22.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("..m");
		
		Matcher m = p.matcher("aXm");
		
		System.out.println(m.matches());
		

	}

}

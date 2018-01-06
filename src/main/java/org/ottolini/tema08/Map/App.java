package org.ottolini.tema08.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		//HashMap - unsorted
		//TreeMap -	sorted, need implement Comparable
		//LinkedHashMap - insertion order
		Map<Pessoa, String> map = new TreeMap<>();
		map.put(new Pessoa(3, "Gabriel", 52), "Gabriel");
		map.put(new Pessoa(7, "Gabriel", 52), "Gabriel");
		map.put(new Pessoa(5, "Fernando", 34), "Fernando");
		map.put(new Pessoa(1, "Francisco", 15), "Francisco");
		map.put(new Pessoa(4, "Rosa", 54), "Rosa");
		map.put(new Pessoa(2, "Vasco", 24), "Vasco");
		map.put(new Pessoa(6, "Manuel", 18), "Manuel");

		Iterator<Pessoa> it = map.keySet().iterator();
		while(it.hasNext()) {
			Pessoa key = (Pessoa) it.next();
			System.out.println("Chave: " + key + " -> Valor: " + map.get(key));
		}
		
		System.out.println();
		
		for(Entry<Pessoa, String> entry: map.entrySet()) {
			//System.out.println(entry);
			System.out.println("Chave: " + entry.getKey() + " -> Valor: " + entry.getValue());
		}
				
	}
}

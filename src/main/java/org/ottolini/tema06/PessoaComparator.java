package org.ottolini.tema06;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa2> {

	@Override
	public int compare(Pessoa2 p1, Pessoa2 p2) {
		if(p1.getNome().compareTo(p2.getNome()) == 0) {
			return new Integer(p1.getIdade()).compareTo(p2.getIdade());
		} else {
			return p1.getNome().compareTo(p2.getNome());
		}
	}
}

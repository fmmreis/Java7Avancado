package org.ottolini.tema08.Map;

public class Pessoa implements Comparable<Pessoa> {
	private int id;
	private String nome;
	private int idade;
	
	public Pessoa(int id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		if(this.getNome().compareTo(pessoa.getNome()) == 0) {
			return new Integer(this.getIdade()).compareTo(pessoa.getIdade());
		} else {
			return this.getNome().compareTo(pessoa.getNome());
		}
		//return new Integer(getIdade()).compareTo(o.getIdade());
		//return getNome().compareTo(o.getNome());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


}

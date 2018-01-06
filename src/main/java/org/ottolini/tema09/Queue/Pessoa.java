package org.ottolini.tema09.Queue;

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
	public int compareTo(Pessoa outraPessoa) {
		return new Integer(outraPessoa.getIdade()).compareTo(idade);
	}
}

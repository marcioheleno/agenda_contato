package com.marcioheleno.contato;

public class Contato {

	private String nome;
	private String email;
	private int telefone;
	
	public Contato() {}
	
	public Contato(String nome, String email, int telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}

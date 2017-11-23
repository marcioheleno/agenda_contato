package com.marcioheleno.contato;

public class ShowContato {

	CadastroContato cadastroContato;

	public ShowContato(CadastroContato cadastroContato) {
		this.cadastroContato = cadastroContato;
	}

	public void showListContato() {
		for (int i = 0; i < cadastroContato.listContato.size(); i++) {
			System.out.println("Lista de Contatos");
			System.out.println(cadastroContato.listContato.get(i).getNome());
			System.out.println(cadastroContato.listContato.get(i).getEmail());
			System.out.println(cadastroContato.listContato.get(i).getTelefone());
		}
	}

	public boolean showContato(String contato) {
		for (int i = 0; i < cadastroContato.listContato.size(); i++) {
			if (cadastroContato.listContato.get(i).getNome().equals(contato)) {
				return true;  
			}
		}
		return false;
	}
}

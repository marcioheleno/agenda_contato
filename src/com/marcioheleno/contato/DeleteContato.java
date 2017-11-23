package com.marcioheleno.contato;

public class DeleteContato {

	UpdateContato updateContato;

	public DeleteContato(UpdateContato updateContato) {
		this.updateContato = updateContato;
	}

	public void deleteContatoList(String nome) {
		for (int i = 0; i < updateContato.showContato.cadastroContato.listContato.size(); i++) {
			if (updateContato.showContato.cadastroContato.listContato.get(i).getNome().equals(nome) == true) {
				System.out.println("Deletando contato");
				updateContato.showContato.cadastroContato.listContato.remove(i);
				System.out.println("Contato deletado.");
			} else {
				System.out.println("Contato não foi possivel deletar");				
			}
		}
	}
	
	public void deleteList() {
		System.out.println("Apagando Lista de contato");
		updateContato.showContato.cadastroContato.listContato.clear();
	}

}

package com.marcioheleno.contato;

import java.util.Scanner;

public class UpdateContato {

	ShowContato showContato;
	
	public UpdateContato(ShowContato showContato) {
		this.showContato = showContato;
	}
	
	public void updateListContato(String n) {
		showContato.showContato(n);
		for (int i = 0; i < showContato.cadastroContato.listContato.size(); i++) {
			if (showContato.cadastroContato.listContato.get(i).getNome().equals(n) == true) {
				System.out.println("Atualizando contato");
				System.out.println("Digite o novo nome do Contato.");
				Scanner atualizarNomeContato2 = new Scanner(System.in);
				String nomeAtualizado = atualizarNomeContato2.nextLine();
				showContato.cadastroContato.listContato.get(i).setNome(nomeAtualizado);
				System.out.println("Contato atualizado.");
			} else {
				System.out.println("Contato não foi possivel atualizar");				
			}
		}
		showContato.showListContato();
	}
	
}

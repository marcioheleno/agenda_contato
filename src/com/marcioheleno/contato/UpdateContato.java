package com.marcioheleno.contato;

import java.util.Scanner;

public class UpdateContato {

	ShowContato showContato;
	
	public UpdateContato(ShowContato showContato) {
		this.showContato = showContato;
	}
	
	public void updateListContato(String n) {
		boolean res = true;
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
		
		do {
			showContato.showListContato();
			System.out.println("Deseja Atualizar o email do contato? (NAO-0 || SIM-1)");
			Scanner resAtualizar = new Scanner(System.in);
			int resp = resAtualizar.nextInt();
//			resp = resp.replaceAll(" ", "");
			System.out.println(resp);
			if (resp == 1) {
				System.out.println("Digite o email a ser atualizado.");
				Scanner emailresp = new Scanner(System.in);
				String email = emailresp.nextLine();
				email.replaceAll(" ", "");
				updateListEmail(email);
				
				System.out.println("Deseja Atualizar o telefone do contato? (NAO-0 || SIM-1)");
				Scanner telAtualizar = new Scanner(System.in);
				int telResp = telAtualizar.nextInt();
				
				if (telResp == 1) {
					System.out.println("Digite o telefone a ser atualizado.");
					Scanner teleResp = new Scanner(System.in);
					int teleResp1 = teleResp.nextInt();
					updateListTelefone(teleResp1);
				}
			}
		} while (!res);
	}
	
	public void updateListEmail(String email) {
		for (int i = 0; i < showContato.cadastroContato.listContato.size(); i++) {
			if (showContato.cadastroContato.listContato.get(i).getEmail().equals(email) == true) {
				System.out.println("Atualizando email do contato");
				System.out.println("Digite o novo email do Contato.");
				Scanner atualizarEmailContato = new Scanner(System.in);
				String EmailAtualizado = atualizarEmailContato.nextLine();
				EmailAtualizado.replaceAll(" ", "");
				showContato.cadastroContato.listContato.get(i).setEmail(EmailAtualizado);
				System.out.println("Email atualizado.");
			} else {
				System.out.println("Email não foi possivel atualizar");				
			}
		}
	}
	
	public void updateListTelefone(int telefone) {
		for (int i = 0; i < showContato.cadastroContato.listContato.size(); i++) {
			if (showContato.cadastroContato.listContato.get(i).getTelefone() == telefone) {
				System.out.println("Atualizando telefone do contato");
				System.out.println("Digite o novo telefone do Contato.");
				Scanner atualizarTeleContato = new Scanner(System.in);
				int TeleAtualizado = atualizarTeleContato.nextInt();
//				TeleAtualizado.
				showContato.cadastroContato.listContato.get(i).setTelefone(TeleAtualizado);
				System.out.println("Telefone atualizado.");
			} else {
				System.out.println("Telefone não foi possivel atualizar");				
			}
		}
	}
	
}

package com.marcioheleno.menu;

import java.util.Scanner;

import com.marcioheleno.contato.CadastroContato;
import com.marcioheleno.contato.Contato;
import com.marcioheleno.contato.ShowContato;
import com.marcioheleno.contato.UpdateContato;

public class Menu {

	private int opcao;
	private String msg;

	CadastroContato cadastro = new CadastroContato();
	ShowContato showContatos = new ShowContato(cadastro);
	UpdateContato updateContato = new UpdateContato(showContatos);
	Contato contato = new Contato();

	public void initializeMenu() {
		// TODO fazer um funcao de inicialização do menu 
		Scanner op = new Scanner(System.in);
		do {
			this.showMenu();
			this.opcao = op.nextInt();

			System.out.println(this.opcao);
			switch (this.opcao) {
			case 0:
				showMenuByMenssage();
				break;
			case 1:
				cadastroContato();
				break;
			case 2:
				showListContato();
				break;
			case 3:
				showContato();
				break;
			case 4:
				atualizarContato();
				break;
			case 5:
				removeContato();
				break;
			case 6:
				removeList();
				break;

			default:
				System.out.println("Entre com um numero valido.");
				break;
			}

		} while (this.opcao != 0 || this.opcao != 0);

	}


	public void showMenu() {
		System.out.println("========== Agenda de Contatos ===========");
		System.out.println("================== MENU =================");
		System.out.println("-----------------------------------------");
		System.out.println("              00 - Sair:                 ");
		System.out.println("         01 - Cadastrar Contato:         ");
		System.out.println("     02 - Exibir todos os Contatos       ");
		System.out.println("      03 - Pesquisar por contato:        ");
		System.out.println("         04 - Atualizar contato:         ");
		System.out.println("          05 - Apagar Contato:          ");
		System.out.println("           06 - Apagar Agenda:           ");
		System.out.println("-----------------------------------------");
		System.out.println("------Digite uma das opções acima:-------");
	}

	public void showMenuByMenssage() {
		this.msg = "Obrigado por usar nosso sistemas.";
		System.out.printf("%s", this.msg);
	}

	public void cadastroContato() {
		cadastro.cadastroContato();
	}

	public void showListContato() {
		showContatos.showListContato();
	}

	public void showContato() {
		Scanner contato = new Scanner(System.in);
		System.out.println("Inform o Contato a ser buscado");	
		//		contato.nextLine();
		String contato2 = contato.nextLine();
		boolean response = showContatos.showContato(contato2);
		if (response == true) {
			System.out.println("Contato existente:");
		} else {
			System.out.println("Contato não existente:");
		}
	}

	public void atualizarContato() {
		Scanner contato = new Scanner(System.in);
		System.out.println("Inform o Contato a ser buscado");
		String contatob = contato.nextLine();
		updateContato.updateListContato(contatob);

	}


	public void removeContato() {
		
	}
	
	
	public void removeList() {

	}



}

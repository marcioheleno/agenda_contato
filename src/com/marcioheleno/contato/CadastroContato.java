package com.marcioheleno.contato;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {

	ArrayList<Contato> listContato = new ArrayList();
	
	public void cadastroContato() {
		
		Scanner nomeCadastroContato = new Scanner(System.in);
		System.out.println("Informe o Nome do contato");
		String nome = nomeCadastroContato.nextLine();
		
		Scanner emailCadastroContato = new Scanner(System.in);
		System.out.println("Informe email do contato");
		String email = emailCadastroContato.nextLine();

		Scanner telefoneCadastroContato = new Scanner(System.in);
		System.out.println("Informe o telefone do contato:");
		int telefone = telefoneCadastroContato.nextInt();

		Contato contato = new Contato(nome, email, telefone);
		listContato.add(contato);
		
		System.out.println("Cadastro com sucesso.");
	}
	
}

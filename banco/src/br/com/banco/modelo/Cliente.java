package br.com.banco.modelo;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataDeNascimento;

	Scanner reader = new Scanner(System.in);

	public Cliente(String nome, String cpf, String dataDeNascimento) {

		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}

	public Cliente() {
		this.nome = "";
		this.cpf = "";
		this.dataDeNascimento = "";
	}

	public void fill() {

		System.out.println("<---------- Preenchendo Cliente ---------->");
		System.out.print("Informe o nome: ");
		this.nome = reader.nextLine();
		System.out.print("Informe o CPF: ");
		this.cpf = reader.nextLine();
		System.out.print("Informe a data de nascimento: ");
		this.dataDeNascimento = reader.nextLine();
		System.out.println("<------------------------------------------>");
	}

	@Override
	public String toString() {
		return "\n<---------- Imprimindo Cliente ---------->\n" + "Nome: " + nome + "\n" + "CPF: " + cpf + "\n"
				+ "Data de Nascimento: " + dataDeNascimento + "\n" + "<---------------------------------------->\n";
	}

}

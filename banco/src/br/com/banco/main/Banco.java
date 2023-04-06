package br.com.banco.main;

import java.util.Scanner;

import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;

public class Banco {

	static public int menu() {
		Scanner reader = new Scanner(System.in);
		System.out.println("<---------- Escolha uma opção ---------->");
		System.out.println("1 - Preencher conta ");
		System.out.println("2 - Depositar ");
		System.out.println("3 - Sacar ");
		System.out.println("4 - Saldo ");
		System.out.println("5 - Informação completa");
		System.out.println("0 - sair");
		System.out.println("<--------------------------------------->");
		System.out.print("Informe a opção: ");

		int opcao = reader.nextInt();
		if (opcao < 0 || opcao > 5) {
			System.out.println("Opção invalida! \nTente Outra vez");
			System.out.print("Informe a opção: ");
			opcao = reader.nextInt();
		}

		return opcao;

	}

	public static void main(String[] args) {

		Conta conta = new Conta();

		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
			case 1:
				conta.fill();
				break;

			case 2:
				conta.depositar();
				break;

			case 3:
				conta.sacar();
				break;

			case 4:
				System.out.println(conta.saldo());
				break;

			case 5:
				System.out.println(conta);
				break;

			}

			if (opcao == 0)
				System.out.println("Saindo");

		} while (opcao != 0);
	}
}

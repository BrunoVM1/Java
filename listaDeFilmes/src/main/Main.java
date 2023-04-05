package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import modelo.Filme;
import modelo.GerenciadorDeFilmes;

public class Main {
	
	public static int imprimeMenu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Remover");
		System.out.println("3 - Presquisar (titulo)");
		System.out.println("4 - Imprimir Lista");
		System.out.println("0 - Saida");
		System.out.println("--------------------------");
		System.out.print("Escolha a opção: ");
		return ler.nextInt();
	}

	public static void main(String[] args) {
		int op = imprimeMenu();
		GerenciadorDeFilmes gerenciadorDeFilmes = new GerenciadorDeFilmes();
		Scanner ler = new Scanner(System.in);
		
		do {
			if (op == 1) {
				gerenciadorDeFilmes.add();

			} else if (op == 2) {
				gerenciadorDeFilmes.remove();
				
			} else if (op == 3) {
				gerenciadorDeFilmes.search();
				
			} else if (op == 4) {
				gerenciadorDeFilmes.print();
				
			}
			
			op = imprimeMenu();
		} while (op != 0);
	}
}
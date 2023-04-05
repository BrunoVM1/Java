package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeFilmes {
	private List<Filme> lista;

	Scanner ler = new Scanner(System.in);

	public GerenciadorDeFilmes() {
		lista = new ArrayList<>();
	}

	public void add() {
		Filme filme = new Filme();
		filme.preencher();
		lista.add(filme);
	}

	public void search() {

		System.out.print("Informe o titulo a ser encontrado: ");
		String titulo = ler.nextLine();

		boolean achou = false;

		for (Filme filme : lista) {
			if (filme.getTitulo().equals(titulo)) {
				System.out.println("Filme encontrado");
				System.out.println(filme.toString());

				achou = true;
			}

		}

		if (!achou) {
			System.out.println("Filme nao encontrado!");
		}

	}

	public void remove() {
		System.out.print("Informe o título do livro a ser excluido: ");
		String titulo = ler.nextLine();

		boolean achou = false;

		for (int i = 0; i < lista.size(); i++) {

			Filme filme = lista.get(i);

			if (filme.getTitulo().equals(titulo)) {
				lista.remove(i);
				System.out.println("Filme excluido!");
				achou = true;
			}

			if (achou == false) {
				System.out.println("Filme não encontrado");
			}
		}

	}

	public void print() {
		lista.forEach((filme) -> System.out.println(filme.toString())); 			
		}
	

}

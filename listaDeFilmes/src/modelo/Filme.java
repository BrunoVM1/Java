package modelo;

import java.util.Scanner;

public class Filme {

	private String titulo;
	private String genero;
	private double duracao;
	private double preco;

	public Filme(String titulo, String genero, double duracao, double preco) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.preco = preco;
	}

	public Filme() {
		this.titulo = "";
		this.genero = "";
		this.duracao = 0.0;
		this.preco = 0.0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return genero;
	}

	public void setArtista(String genero) {
		this.genero = genero;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void preencher() {
		Scanner ler = new Scanner(System.in);
		System.out.println("-------Preenchendo-------");
		System.out.print("Informe o titulo: ");
		this.titulo = ler.nextLine();
		System.out.print("Informe o gênero: ");
		this.genero = ler.nextLine();
		System.out.print("Informe a duracao: ");
		this.duracao = ler.nextDouble();
		System.out.print("Informe o preco: ");
		this.preco = ler.nextDouble();
		System.out.println("---------------------------");
	}

	@Override
	public String toString() {
		String s = "----------Imprimindo---------" + "\n";
		s += "Artista: " + this.genero + "\n";
		s += "Titulo: " + this.titulo + "\n";
		s += "Duracao: " + this.duracao + "\n";
		s += "Preco: " + this.preco + "\n";
		s += "-----------------------------" + "\n" + "\n";

		return s;
	}

	public void copiar(Filme outro) {
		this.titulo = outro.getTitulo();
		this.genero = outro.getArtista();
		this.duracao = outro.getDuracao();
		this.preco = outro.getPreco();
	}

}

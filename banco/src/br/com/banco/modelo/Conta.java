package br.com.banco.modelo;

import java.util.Scanner;

public class Conta {
	private Cliente cliente;
	private String agencia;
	private String numero;
	private double saldo;

	Scanner reader = new Scanner(System.in);

	public Conta() {
		this.cliente = new Cliente();
		this.agencia = "";
		this.numero = "";
		this.saldo = 0.0;
	}

	public Conta(Cliente cliente, String agencia, String numero, double saldo) {

		this.cliente = cliente;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void fill() {

		System.out.println("<---------- Preenchendo Conta ---------->");
		System.out.print("Informe a agencia: ");
		this.agencia = reader.nextLine();
		System.out.print("Informe o numero: ");
		this.numero = reader.nextLine();
		System.out.println("<--------------------------------------->");

		cliente.fill();
	}

	public void depositar() {

		System.out.print("Informe o valor: ");
		double valor = reader.nextDouble();
		this.saldo += valor;
		System.out.println("Foram depositados R$ " + valor + ", em sua conta, Saldo total: R$ " + this.saldo);

	}
	
	public void sacar() {
		System.out.print("Informe o valor: ");
		double valor = reader.nextDouble();
		
		if(valor > this.saldo) {
			System.out.println("Saldo Insulficiente!");
		} else if (valor < 0) {
			System.out.println("Valor Invalido!");
		} else {
			this.saldo -= valor;
			System.out.println("Dinheiro sacado com sucesso!");
			System.out.println("Saldo restante: R$ " + this.saldo);
		}
		
	}
	
	public String saldo() {
		return "Saldo: R$ " + this.saldo;
	}

	@Override
	public String toString() {
		return cliente + "\n<---------- Imprimindo Conta ---------->\n" + "Agencia: " + this.agencia + "\n" + "Número :"
				+ this.numero + "\n" + "Saldo : " + this.saldo + "\n" + "<---------------------------------------> \n";
	}

}

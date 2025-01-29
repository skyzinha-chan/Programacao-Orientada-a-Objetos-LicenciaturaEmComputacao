package main;

import java.util.Scanner;

import entidades.ContaEmpresarial;
import entidades.ContaPessoaFisica;

public class Main {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamen
		Scanner dados = new Scanner(System.in);

		System.out.println("Cadastro de nova conta");
		System.out.println("Digite 1: conta pessoa física");
		System.out.println("Digite 2: conta empresarial");
		System.out.println("Opção: ");

		int opcao = dados.nextInt();
		System.out.println("");
		System.out.println("** LENDO DADOS: **");

		System.out.println("Número da conta: ");
		int numero = dados.nextInt();
		dados.nextLine();

		System.out.println("Nome do cliente: ");
		String cliente = dados.nextLine();

		double saldo = 0;

		if (opcao == 1) {
			System.out.println("Limite de saque: ");
			double limiteSaque = dados.nextDouble();
			dados.nextLine();

			System.out.println("CPF: ");
			String cpf = dados.nextLine();

			ContaPessoaFisica conta = new ContaPessoaFisica(numero, cliente, saldo, limiteSaque, cpf);
			
			System.out.println(conta);
		}

		if (opcao == 2) {
			System.out.println("Limite de emprestimo: ");
			double limiteEmprestimo = dados.nextDouble();
			dados.nextLine(); //limpeza do buffer

			System.out.println("CNPJ: ");
			String cnpj = dados.nextLine();

			ContaEmpresarial conta = new ContaEmpresarial(numero, cliente, saldo, limiteEmprestimo, cnpj);
			
			System.out.println(conta);
			}
		
		dados.close();

	}

}

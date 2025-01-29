package aplicacao;

import java.util.Scanner;

import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamen
		Scanner dados = new Scanner(System.in);

		System.out.println("Bem-vindo");
		System.out.println("Qual conta deseja abrir?");
		System.out.printf(" (Digite \"1\" para conta poupança ou \"2\" conta empresarial): ");
		int opcao = dados.nextInt();
		dados.nextLine();

		System.out.println("Número da conta: ");
		int numero = dados.nextInt();
		dados.nextLine();

		System.out.println("Cliente: ");
		String cliente = dados.nextLine();

		System.out.println("Saldo Inicial: ");
		double saldo = dados.nextDouble();
		dados.nextLine();

		if (opcao == 1) {
			System.out.println("Taxa de rendimento mensal: ");
			double taxaRendimentoMensal = dados.nextDouble();

			ContaPoupanca conta = new ContaPoupanca(numero, cliente, saldo, taxaRendimentoMensal);
			
			System.out.println("");
			System.out.println(conta);
			conta.atualizarSaldo(saldo);
		}

		if (opcao == 2) {
			System.out.println("Limite de emprestimo: ");
			double limiteEmprestimo = dados.nextDouble();
			dados.nextLine(); // limpeza do buffer

			ContaEmpresarial conta = new ContaEmpresarial(numero, cliente, saldo, limiteEmprestimo);

			System.out.println("");
			System.out.println(conta);

		}

		dados.close();
	}

}

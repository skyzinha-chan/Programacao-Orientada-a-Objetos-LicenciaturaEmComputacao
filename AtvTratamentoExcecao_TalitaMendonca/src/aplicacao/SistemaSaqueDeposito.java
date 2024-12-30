package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidade.Conta;
import excecoes.ExcecoesPersonalizadas;

public class SistemaSaqueDeposito {

	public static void main(String[] args) {
		try {
			Conta usuario = new Conta();

			Scanner teclado = new Scanner(System.in);

			System.out.println("Informe os dados da conta");

			System.out.print("Número: ");
			Integer numero = teclado.nextInt();
			usuario.setNumero(numero);
			teclado.nextLine();

			System.out.print("Cliente: ");
			String cliente = teclado.nextLine();
			usuario.setCliente(cliente);

			System.out.print("Saldo inicial: ");
			double saldo = teclado.nextDouble();
			usuario.setSaldo(saldo);

			System.out.print("Limite de saque: ");
			double limiteSaque = teclado.nextDouble();
			usuario.setLimiteSaque(limiteSaque);

			System.out.print("Informe o valor para saque: ");
			Integer valor_Saque = teclado.nextInt();
			usuario.sacar(valor_Saque);

			System.out.println(usuario);

			System.out.print("Informe o valor para depósito: ");
			Integer valor_Deposito = teclado.nextInt();
			usuario.depositar(valor_Deposito);

			System.out.println(usuario);

			teclado.close();
		} catch (InputMismatchException e) {
			System.out.println("O dado informado é inválido");

		} catch (ExcecoesPersonalizadas e) {
			System.out.println("Erro de saque: " + e.getMessage());
		}

		finally {
			System.out.println("\nExecução Finalizada");
		}

	}
}

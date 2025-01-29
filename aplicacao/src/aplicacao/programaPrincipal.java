package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Insira os nomes separados por espaço");
			System.out.println("Ao finalizar, pressione ENTER");

			String[] nomes = teclado.nextLine().split(" ");

			System.out.print("Digite a posição do vetor: ");
			int p = teclado.nextInt();

			System.out.println(nomes[p]);
			teclado.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inserida inexistente.");
		} catch (InputMismatchException e) {
			System.out.println("Formato de dados inválido.");
		} finally {

			System.out.println("Fim da execução");
		}

	}

}

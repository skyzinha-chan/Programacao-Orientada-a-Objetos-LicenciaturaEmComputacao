import java.util.Scanner;

public class VerificadorMaioridade {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int anoNascimento, idade, anoAtual = 2023;
        System.out.println("Verificador de Maioridade ");
        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.printf("Idade: %d \n", idade);
        if (idade >= 18) {
            System.out.println(" Você é maior de idade");
        } else {
            System.out.println(" Você é menor de idade");

        }
        teclado.close();

    }
}

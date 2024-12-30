import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, soma, sub, mult, div;
        System.out.println("Calculadora Simples");
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Operações básicas");
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        System.out.println(num1 + "+" + num2 + "=" + soma);
        System.out.println(num1 + "-" + num2 + "=" + sub);
        System.out.println(num1 + "*" + num2 + "=" + mult);
        System.out.println(num1 + "/" + num2 + "=" + div);
        teclado.close();

    }

}

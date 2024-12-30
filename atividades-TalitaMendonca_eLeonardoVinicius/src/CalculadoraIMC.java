import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Calculadora de IMC ");
        System.out.println("Informe sua altura: ");
        altura = teclado.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = teclado.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf(" IMC: %.2f \n", imc);
        if (imc < 18.5) {
            System.out.println("Resultado: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Resultado: Peso ideal (parabéns)");
        } else if (imc < 30) {
            System.out.println("Resultado: Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Resultado: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Resultado: Obesidade grau II (severa)");
        } else {
            System.out.println("Resultado: Obesidade grau III (mórbida)");
        }
        teclado.close();

    }
}

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int celsius, fahrenheit;
        System.out.println("Conversor de Temperatura ");
        System.out.println("Informe a temperatura em Celsius: ");
        celsius = teclado.nextInt();
        System.out.print("Temperatura em Fahrenheit:");
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
        teclado.close();
    }
}

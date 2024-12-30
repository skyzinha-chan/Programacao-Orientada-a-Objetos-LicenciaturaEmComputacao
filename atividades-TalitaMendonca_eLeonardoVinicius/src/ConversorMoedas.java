import java.util.Scanner;
public class ConversorMoedas {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double dolar, cotacaoDia, conversaoValor;
    System.out.println("Coversor de moedas ");
    System.out.println("Imforme o valor em dólar:");
    dolar = teclado.nextDouble();
    System.out.println("Informe a cotação do dia:");
    cotacaoDia = teclado.nextDouble();
    conversaoValor = dolar * cotacaoDia;
    System.out.printf("O valor convertido em Reais: %.2f " , conversaoValor);
    teclado.close();

}
}

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ntA, ntB, ntC, media;
        System.out.println("Imforme a 1ª nota: ");
        ntA = teclado.nextDouble();
        System.out.println("Imforme a 2ª nota: ");
        ntB = teclado.nextDouble();
        System.out.println("Imforme a 3ª nota: ");
        ntC = teclado.nextDouble();
        media = (ntA + ntB + ntC) / 3;
        System.out.printf("Média: %.2f ", media);
        teclado.close();


    }
}
package encapsulamento;

import java.util.Scanner;
public class FuncaoExecutadora
{
    private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
	    //inicia circulo A
		Circulo circuloA = new Circulo();
		
		System.out.println("Digite o raio do Círculo A:");
		circuloA.setRaio(teclado.nextDouble()) ;
		
		
		System.out.printf("Área do Círculo A: %.2f\n", circuloA.calcArea());
		System.out.printf("Perímetro do Círculo A: %.2f\n", circuloA.calcPerimetro());
		System.out.printf("Diâmetro do Círculo A: %.2f\n", circuloA.calcDiametro());
		
		
		//inicia circulo B
		System.out.println("Digite o raio do Círculo B:");
		double raio = teclado.nextDouble();
		
		Circulo circuloB = new Circulo(raio);
		
		System.out.printf("Área do Círculo B: %.2f\n", circuloB.calcArea());
		System.out.printf("Perímetro do Círculo B: %.2f\n", circuloB.calcPerimetro());
		System.out.printf("Diâmetro do Círculo B: %.2f\n", circuloB.calcDiametro());
	}
}

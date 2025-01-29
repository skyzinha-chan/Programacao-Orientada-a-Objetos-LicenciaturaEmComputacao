package aplicacao;

import entidades.Figura;
import entidades.Quadrado;
import entidades.Retangulo;
import entidades.Triangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("Criando figuras:");

		Figura A = new Retangulo("retangulo", "azul", 100, 80);
		Figura B = new Triangulo("triangulo", "verde", 100, 80);
		Figura C = new Quadrado("quadrado", "preto", 100);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}

}

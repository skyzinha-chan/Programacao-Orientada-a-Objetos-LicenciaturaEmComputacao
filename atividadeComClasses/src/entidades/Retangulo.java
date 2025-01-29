package entidades;

public class Retangulo extends Figura {
	private double comprimento;
	private double largura;

	public Retangulo(String tipo, String cor) {
		super(tipo, cor);
	}

	public Retangulo(String tipo, String cor, double comprimento, double largura) {
		super(tipo, cor);
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double calcularArea() {
		return comprimento * largura;
	}

}

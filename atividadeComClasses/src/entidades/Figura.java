package entidades;

public class Figura {
	protected String tipo;
	protected String cor;

	public Figura() {

	}

	public Figura(String tipo, String cor) {

		this.tipo = tipo;
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double calcularArea() {

		return 0;
	}

	public String toString() {
		return "Tipo: " + tipo + " - cor: " + cor + " - área: " + calcularArea();
	}

}

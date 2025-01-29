package entidades;

public class Conta {
		
	protected int numero;
	protected String cliente;
	protected double saldo;
	
	
	public Conta() {
		
	}


	public Conta(int numero, String cliente, double saldo) {

		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor;
	}

	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	
	

}

package entidade;

import java.text.DecimalFormat;

import excecoes.ExcecoesPersonalizadas;

public class Conta {
	private String cliente;
	private double limiteSaque;
	private double saldo;
	private Integer numero;

	public Conta() {

	}

	public Conta(String cliente, double limiteSaque, double saldo, Integer numero) {

		this.cliente = cliente;
		this.limiteSaque = limiteSaque;
		this.saldo = saldo;
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void sacar(double valor_Saque) {
		if (valor_Saque > saldo) {
			throw new ExcecoesPersonalizadas("Não há saldo suficiente.");
		}
		if (valor_Saque > limiteSaque) {
			throw new ExcecoesPersonalizadas("O valor solicitado é maior que o limite de saque.");
		}
		saldo -= valor_Saque;
	}

	public void depositar(double valor_Deposito) {
		saldo += valor_Deposito;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Novo saldo: " + df.format(saldo);
	}
}
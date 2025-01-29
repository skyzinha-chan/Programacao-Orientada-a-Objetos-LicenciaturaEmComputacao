package entidades;

public class ContaPessoaFisica extends Conta {

	private double limiteSaque;
	private String cpf;

	public ContaPessoaFisica() {
		super();
	}

	public ContaPessoaFisica(int numero, String cliente, double saldo, double limiteSaque, String cpf) {
		super(numero, cliente, saldo);
		this.limiteSaque = limiteSaque;
		this.cpf = cpf;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Conta Pessoa Física criada com sucesso: \n"
				+ "Cliente: " + cliente + "\n" 
				+ "CPF: " + cpf + "\n"
				+ "Número da conta: " + numero + "\n"
				+ "Saldo: " + saldo + "\n"
				+ "Limite de saque: " + limiteSaque + "\n";
	}

}

package entidades;

public class ContaEmpresarial extends Conta {
	
	private double limiteEmprestimo;
	private String cnpj;
	
	
	public ContaEmpresarial() {
		super();
	}


	public ContaEmpresarial(int numero, String cliente, double saldo, double limiteEmprestimo, String cnpj) {
		super(numero, cliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
		this.cnpj = cnpj;
	}


	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}


	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void emprestimo(double valor) {
		saldo = saldo + valor;
	}
	
	public String toString() {
		return "Conta Empresarial criada com sucesso: \n"
				+ "Cliente: " + cliente + "\n" 
				+ "CNPJ: " + cnpj + "\n"
				+ "Número da conta: " + numero + "\n"
				+ "Saldo: " + saldo + "\n"
				+ "Limite de emprestimo: " + limiteEmprestimo + "\n";
	}

}

package entidades;

import java.text.DecimalFormat;

public class ContaEmpresarial extends Conta {

	private double limiteEmprestimo;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(int numero, String cliente, double saldo, double limiteEmprestimo) {
		super(numero, cliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

    @Override
    public void saque(double valor) {
        if (saldo >= valor + 10) {  // Considerando a taxa de R$ 10,00 para o saque
            saldo -= (valor + 10);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

	public void emprestimo(double valor) {
		saldo = saldo + valor;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###"); // Sem casas decimais

		return "Conta Empresarial criada com sucesso!\n" + "Conta: " + numero + " - Cliente: " + cliente + "\n"
				+ "Saldo Inicial: " + df.format(saldo) + "- Limite de empréstimo: " + df.format(limiteEmprestimo);

	}
}

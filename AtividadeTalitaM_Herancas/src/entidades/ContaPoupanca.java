package entidades;

public class ContaPoupanca extends Conta {

	private double taxaRendimentoMensal;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String cliente, double saldo, double taxaRendimentoMensal) {
		super(numero, cliente, saldo);
		this.taxaRendimentoMensal = taxaRendimentoMensal;
	}

	public double getTaxaRendimentoMensal() {
		return taxaRendimentoMensal;
	}

	public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
		this.taxaRendimentoMensal = taxaRendimentoMensal;
	}

	// Método para aplicar o rendimento mensal
	public void atualizarSaldo(double saldo) {
		saldo += saldo * taxaRendimentoMensal;
	}

	public String toString() {
		return "Conta Poupança criada com sucesso! \n" + "Conta: " + numero + " - " + "Cliente: " + cliente + "\n"
				+ "Saldo Inicial: R$" + String.format("%.2f", saldo) + " - " + "Taxa de Rendimento Mensal: "
				+ taxaRendimentoMensal + "%" + "\n";
	}

}

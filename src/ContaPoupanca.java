
public class ContaPoupanca {

	private Conta conta;

	public ContaPoupanca(Cliente cliente, Conta conta) {
		super();
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		conta.imprimirExtrato();
	}
}

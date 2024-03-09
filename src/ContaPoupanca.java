
public class ContaPoupanca {

	private Conta conta;
	private Cliente cliente;

	public ContaPoupanca(Cliente cliente) {
		this.cliente = cliente;
		conta = new Conta();
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		conta.imprimirExtrato();
		System.out.println(String.format("Saldo: %.2f", conta.getSaldo()));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Conta getConta() {
		return conta;
	}
}


public class ContaCorrente {

	private Conta conta;
	private Double limiteCartao;
	private Double limiteEspecial;
	private Cliente cliente;

	public ContaCorrente(Cliente cliente) {
		this.cliente = cliente;
		conta = new Conta();
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		conta.imprimirExtrato();
		System.out.println(String.format("Saldo: %.2f", conta.getSaldo()));
		System.out.println(String.format("Limite Especial: %s", limiteEspecial));
		System.out.println(String.format("Limite Cartão: %s", limiteCartao));
	}
	
	public void analiseCredito(){
		if (cliente.getScore() >= 700) {
			limiteCartao = 1000.0;
			limiteEspecial = 500.0;
		}
		else if (cliente.getScore() < 700) {
			System.out.println(cliente.getNome() + " Credito não aprovado.");
		}
	}

	public Conta getConta() {
		return conta;
	}

	public Double getLimiteCartao() {
		return limiteCartao;
	}

	public Double getLimiteEspecial() {
		return limiteEspecial;
	}

	public Cliente getCliente() {
		return cliente;
	}
}


public class ContaCorrente {

	private Conta conta;
	private Double limiteCartao;
	private Double limiteEspecial;

	public ContaCorrente(Cliente cliente, Conta conta) {
		super();
		conta = this.conta;
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		conta.imprimirExtrato();
	}
	
	public void analiseCredito(){
		if (conta.cliente.getScore() >= 700) {
			limiteCartao = 1000.0;
			limiteEspecial = 500.0;
		}
		else if (conta.cliente.getScore() < 700) {
			System.out.println(conta.cliente.getNome() + "Credito não aprovado.");
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
}

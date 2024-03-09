
public class Main {

	public static void main(String[] args) {

		Cliente c0 = new Cliente();
		c0.setNome("Edu");
		c0.setScore(699);

		Cliente c1 = new Cliente();
		c1.setNome("Catia");
		c1.setScore(789);
		

		ContaCorrente cc0 = new ContaCorrente(c0);
		ContaPoupanca pp0 = new ContaPoupanca(c1);
		ContaCorrente cc1 = new ContaCorrente(c1);
		ContaPoupanca pp1 = new ContaPoupanca(c0);

		cc0.getConta().depositar(100.0);
		cc1.getConta().depositar(100.0);
		pp0.getConta().depositar(100.0);
		pp1.getConta().depositar(100.0);

		cc0.getConta().sacar(150.0);
		System.out.println("");
		cc0.getConta().sacar(90.0);
		
		System.out.println("");
		cc0.analiseCredito();
		System.out.println("");
		cc1.analiseCredito();

		System.out.println("");
		cc0.imprimirExtrato();
		System.out.println("");
		cc1.imprimirExtrato();

		System.out.println("");
		pp0.imprimirExtrato();
		System.out.println("");
		pp1.imprimirExtrato();
	}

}

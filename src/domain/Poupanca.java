package domain;

public class Poupanca extends Conta{

	public Poupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("===========| CONTA POUPANÇA |===========");
		super.imprimirInfosComuns();
		System.out.println("========================================");
	}

}

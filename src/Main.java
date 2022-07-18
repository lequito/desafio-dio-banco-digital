import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.Poupanca;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		c1.setNome("Lekito");
		Conta cc = new ContaCorrente(c1);
		Conta p1 = new Poupanca(c1);
		cc.depositar(1500);
		cc.transferir(1000, p1);
		//cc.sacar(600);
		cc.imprimirExtrato();
		p1.imprimirExtrato();
		
	}

}

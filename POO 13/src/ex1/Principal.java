package ex1;

public class Principal {

	public static void main(String[] args) {
		Conta c = new ExecucaoConta();
		c.setSaldo(20);
		c.depositar(670);
		c.sacar(90);
		c.sacar(700);
	}

}

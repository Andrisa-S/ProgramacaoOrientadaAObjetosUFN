package desafio;

public class ContaCorrente extends Conta{
	@Override
	void depositar(double deposito) throws MinhaExcecao{
		if (deposito < 0) {
			throw new MinhaExcecao("Não é possível depositar valor negativo.");
		} else {
			setSaldo(getSaldo() + deposito);
			System.out.println("Saldo atual: " + getSaldo());
		}
		
	}
	
	@Override
	void sacar(double saque) throws MinhaExcecao {
		if (saque > getLimite()) {
			throw new MinhaExcecao("Limite insuficiente!");
		} else if (saque < 0){
			throw new MinhaExcecao("Não é possível sacar valor negativo.");
		} else {
			setSaldo(getSaldo() - saque);
			System.out.println("Saldo atual: " + getSaldo());
		}
		
	}
}

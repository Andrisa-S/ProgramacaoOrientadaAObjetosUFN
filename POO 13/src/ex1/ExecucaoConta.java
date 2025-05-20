package ex1;

public class ExecucaoConta extends Conta{
	double saldoFinal;
	@Override
	void depositar(double valor) {
		System.out.println("Valor de R$ " + valor + " depositado!");
		saldoFinal = getSaldo() + valor;
		setSaldo(saldoFinal);
		System.out.println("Saldo atual: R$ " + saldoFinal);
	}

	@Override
	void sacar(double valor) {
		if(valor < getLimite()) {
			System.out.println("Valor de R$ " + valor + " sacado!");
			saldoFinal = getSaldo() - valor;
			setSaldo(saldoFinal);
			System.out.println("Saldo atual: R$ " + saldoFinal);
		}else {
			System.out.println("Valor acima do limite!\nLimite atual de: R$ " + getLimite() );
		}
		
	}

}

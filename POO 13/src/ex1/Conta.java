package ex1;

public abstract class Conta {
	private double saldo = 0; //Inicialização
	private double limite = 500; //Exemplo
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	abstract void depositar(double valor);
	abstract void sacar(double valor);
}

package desafio;

import java.util.Scanner;

public abstract class Conta{
	private double saldo;
	private double limite;
	
	Scanner sc = new Scanner(System.in);
	
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
	
	abstract void depositar(double deposito) throws MinhaExcecao;
	
	abstract void sacar(double saque) throws MinhaExcecao;
}

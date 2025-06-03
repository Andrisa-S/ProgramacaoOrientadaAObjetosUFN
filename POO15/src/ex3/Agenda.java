package ex3;

public class Agenda {
	private String nome;
	private int telefone;
	
	public Agenda(String nome, int telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void adicionarContato() throws MinhaExcecao {
		if(nome == "" || telefone == 0) {
			throw new MinhaExcecao("IllegalArgumentException");
		} else {
			System.out.println("Contato adicionado!");
		}
	}
}

package ex1;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void validarIdade() throws MinhaExcecao{
		if (idade < 0 || idade > 120) {
			throw new MinhaExcecao(nome + " tem idade inválida");
		} else {
			System.out.println(nome + " tem idade válida");
		}
	}
}

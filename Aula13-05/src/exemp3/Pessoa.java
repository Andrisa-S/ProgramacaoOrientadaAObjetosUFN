package exemp3;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}


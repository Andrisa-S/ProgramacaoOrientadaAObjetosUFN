package trabalho;

public class Pessoa {
	public String nome;
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}
	
	public void exibirNome() {
		System.out.println("Nome: " + nome);
	}
	
	public void dizerOla() {
		System.out.println("Olá!");
	}
	public void dizerOla(String nome) {
		System.out.println("Olá, " + nome + "!");
	}
}

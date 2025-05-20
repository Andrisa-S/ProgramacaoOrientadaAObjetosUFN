package exemp1;

public class Gato implements Animal{
	public String nome;
	public int idade;

	@Override
	public void emitirSom() {
		System.out.println("miau");
	}

	@Override
	public void exibirDados() {
		System.out.println("*Gato:*");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}

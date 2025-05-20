package exemp1;

public class Cachorro implements Animal{
	public String nome;
	public int idade;

	@Override
	public void emitirSom() {
		System.out.println("au au");
	}
	
	public void cuidarPatio() {
		System.out.println("Estou cuidando do pátio!");
	}

	@Override
	public void exibirDados() {
		System.out.println("*Cachorro:*");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}

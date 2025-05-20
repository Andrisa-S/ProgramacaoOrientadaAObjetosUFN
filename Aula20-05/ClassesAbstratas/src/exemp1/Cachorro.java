package exemp1;

public class Cachorro extends Animal{
	String raca;
	
	@Override
	void emitirSom() {
		System.out.println("au au");
	}
	
	public void cuidarPatio() {
		System.out.println("Estou cuidando do pátio!");
	}
	
	@Override
	void exibirInfo() {
		System.out.println("Espécie: " + especie);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade);
	}

}

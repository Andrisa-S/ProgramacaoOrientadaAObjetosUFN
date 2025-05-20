package exemp1;

abstract class Animal {
	String especie;
	int idade;
	abstract void emitirSom();
	
	void exibirInfo() {
		System.out.println("Espécie: " + especie);
		System.out.println("Idade: " + idade);
	}
}

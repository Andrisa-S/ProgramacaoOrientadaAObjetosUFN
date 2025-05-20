package exemp1;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.especie = "Cachorro";
		c.raca = "Bull Terrier";
		c.idade = 9;
		c.exibirInfo();
		c.emitirSom();
		c.cuidarPatio();
	}

}

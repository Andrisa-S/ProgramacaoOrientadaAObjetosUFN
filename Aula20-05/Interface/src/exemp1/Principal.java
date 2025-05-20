package exemp1;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.nome = "Frodo";
		c.idade = 7;
		c.exibirDados();
		c.emitirSom();
		c.cuidarPatio();
		
		Gato g = new Gato();
		g.nome = "Gandalf";
		g.idade = 11;
		g.exibirDados();
		g.emitirSom();
	}

}

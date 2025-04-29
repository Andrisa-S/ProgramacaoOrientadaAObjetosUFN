package pkg;

public class Principal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.nome = "Animal 1";
		a.exibirInformacoes();
		a.emitirSom();
		
		Cachorro c = new Cachorro();
		c.nome = "Caramelo";
		c.raca = "SRD";
		c.exibirInformacoes();
		c.emitirSom();
		
		a = new Cachorro();
		a.emitirSom();
		
		Passarinho p = new Passarinho();
		p.nome = "Athena";
		p.especie = "Calopsita";
		p.exibirInformacoes();
		p.emitirSom();
	}

}

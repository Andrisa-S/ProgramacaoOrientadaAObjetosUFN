package pkg;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Andrisa";
		p.idade = 20;
		p.genero = "Feminino";
		
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Gênero: " + p.genero);
	}

}

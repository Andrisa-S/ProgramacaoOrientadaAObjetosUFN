package pkg;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Drih", 20, "0334");

		p.apresentaDados();
		
		int idade, ano;
		idade = p.getIdade();
		//ano = 2025 - p.idade;
		ano = 2025 - idade;
		System.out.println("Ano de nascimento: " + ano);
		
		p.setIdade(-15);
		p.apresentaDados();
		
		p.setNome("Andrisa");
		p.setNome(p.getNome()+ " Santos");
		p.apresentaDados();
	}

}

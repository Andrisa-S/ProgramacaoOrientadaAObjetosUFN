package exemp1;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Andrisa", 20);
		meuMetodo(pessoa);
	}
	
	public static void meuMetodo(Pessoa p) { //Uso não recomendado, assim como variável global
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
	}

}

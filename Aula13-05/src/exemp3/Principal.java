package exemp3;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Andrisa", 20, new Endereco("Rua VM", 10)); //Cria o objeto (classe) dentro da outra classe
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco().getRua() + ", " + pessoa.getEndereco().getNumero());
	}

}

package lista1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa("Andrisa", 20);
		Pessoa pessoa2 = new Pessoa("Gabriel", 25);
		Pessoa pessoa3 = new Pessoa("Matheus", 23);
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		//Chamando método e passando lista como parâmetro
		exibirPessoas(listaPessoas);
	}

	public static void exibirPessoas(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
		}
		
		/*for (int i = 0; i < lista.size(); i++) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		} */
	}
}

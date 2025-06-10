package desafio;

import java.util.ArrayList;
import java.util.List;

import pkg.Aluno;

public class Principal {

	public static void main(String[] args) {
		//Criando objetos Aluno
		Aluno aluno1 = new Aluno("Andrisa", 20);
		Aluno aluno2 = new Aluno("Gabriel", 40);
		Aluno aluno3 = new Aluno("Mateus", 30);
		
		List<Aluno> lista = new ArrayList<>();
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravaArquivo(aluno1);
		arquivo.gravaArquivo(aluno2);
		arquivo.gravaArquivo(aluno3);
		
		lista = arquivo.leArquivo();
		
		for(Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
		}
	}

}

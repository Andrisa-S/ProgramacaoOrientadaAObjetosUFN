package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrincipalLer {

	public static void main(String[] args) {
		//Lendo os alunos do arquivo
		try {
		FileReader arquivo = new FileReader("Alunos.txt");
		BufferedReader leitor = new BufferedReader(arquivo);
		
		System.out.println("Alunos lidos do arquivo: ");
		
		String linha;
		while ((linha = leitor.readLine()) != null) {
			String[] campos = linha.split(", ");
			
			String nome = campos[0];
			int idade = Integer.parseInt(campos[1]);
			
			Aluno aluno = new Aluno(nome, idade);
			
			System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
		}
		
		leitor.close();
		arquivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

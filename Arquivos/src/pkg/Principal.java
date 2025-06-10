package pkg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		//Criando objetos alunos
		Aluno aluno1 = new Aluno("Andrisa", 20);
		Aluno aluno2 = new Aluno("Gabriel", 40);
		Aluno aluno3 = new Aluno("Mateus", 30);
		
		//Escrevendos os alunos em um arquivo de texto
		try {
			FileWriter arquivo = new FileWriter("Alunos.txt", true);
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			//Escrevendo os alunos no arquivo
			escritor.write(aluno1.getNome() + ", " + aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + ", " + aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + ", " + aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo Alunos.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

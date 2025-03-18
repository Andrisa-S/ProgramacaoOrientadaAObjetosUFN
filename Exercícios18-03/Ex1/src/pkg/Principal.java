package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Disciplina a = new Disciplina();
		a.nome = "POO";
		a.cargaHoraria = 80;
		a.professor = "Ricardo";
		
		a.exibirDados();
		
		Scanner teclado = new Scanner(System.in);
		String nomeDisc, nomeProf;
		int cargaHor;
		
		System.out.println("\nDigite o nome da disciplina: ");
		nomeDisc = teclado.nextLine();
		System.out.println("Digite a carga horária: ");
		cargaHor = teclado.nextInt();
		System.out.println("Digite o nome do professor: ");
		nomeProf = teclado.nextLine();
		nomeProf = teclado.nextLine();
		
		System.out.println("\nNome da disciplina: " + nomeDisc);
		System.out.println("Carga horária: " + cargaHor + "h");
		System.out.println("Professor da disciplina: " + nomeProf);

	}

}

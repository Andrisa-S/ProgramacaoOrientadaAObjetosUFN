package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String ma, mo;
		
		System.out.println("Digite a marca do carro: ");
		ma = teclado.nextLine();
		System.out.println("Digite o modelo do carro: ");
		mo = teclado.nextLine();
		Carro c = new Carro(ma, mo);
		//c.marca = "Honda";
		//c.modelo = "Civic";
		System.out.println("Carro 1:");	
		c.exibirDados();
		
		Carro c2 = new Carro("Corolla");
		c2.marca = "Toyota";
		System.out.println("\nCarro 2:");
		c2.exibirDados();
	
		Carro c3 = new Carro();
		c3.marca = "VW";
		c3.modelo = "Gol";
		System.out.println("\nCarro 3:");
		c3.exibirDados();

	}

}

package pkg;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Carro p = new Carro();
		Carro q = new Carro();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Marca do carro: ");
		p.marca = teclado.nextLine();
		System.out.println("Modelo: ");
		p.modelo = teclado.nextLine();
		System.out.println("Ano de fabricação: ");
		p.anoFabricacao = teclado.nextInt();
		
		teclado.nextLine();  // Limpa o buffer após nextInt()
		
		System.out.println("\nMarca do carro: ");
		q.marca = teclado.nextLine();
		System.out.println("Modelo: ");
		q.modelo = teclado.nextLine();
		System.out.println("Ano de fabricação: ");
		q.anoFabricacao = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("Resumo:");
		System.out.println("Marca do carro 1: " + p.marca);
		System.out.println("Modelo do carro 1: " + p.modelo);
		System.out.println("Ano de fabricação do carro 1: " + p.anoFabricacao);
		System.out.println("\nMarca do carro 2: " + q.marca);
		System.out.println("Modelo do carro 2: " + q.modelo);
		System.out.println("Ano de fabricação do carro 2: " + q.anoFabricacao);
		
		
	}

}

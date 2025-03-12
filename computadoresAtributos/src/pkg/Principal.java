package pkg;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Computador p = new Computador();
		Computador q = new Computador();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Marca do computador: ");
		p.marca = teclado.nextLine();
		System.out.println("Modelo: ");
		p.modelo = teclado.nextLine();
		System.out.println("Tipo (notebook, netbook, tablet, etc.): ");
		p.tipo = teclado.nextLine();
		System.out.println("Preço: ");
		p.preco = teclado.nextInt();
		
		q.marca = "Acer";
		q.modelo = "Aspire 5";
		q.tipo = "Notebook";
		q.preco = 4000;
		
		System.out.println("\nResumo:");
		System.out.println("Marca do computador 1: " + p.marca);
		System.out.println("Modelo do computador 1: " + p.modelo);
		System.out.println("Tipo do computador 1: " + p.tipo);
		System.out.println("Preço do computador 1: " + p.preco);
		
		System.out.println("\nMarca do computador 2: " + q.marca);
		System.out.println("Modelo do computador 2: " + q.modelo);
		System.out.println("Tipo do computador 2: " + q.tipo);
		System.out.println("Preço do computador 2: " + q.preco);
		
	}

}

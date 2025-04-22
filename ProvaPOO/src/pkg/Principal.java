package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		String nomeProduto;
		int precoProduto;
		int quantidadeEstoqueProduto;
	
		
		Produto p = null;
		do {
			System.out.println("*MENU*");
			System.out.println("1 - Criar produto informando nome");
			System.out.println("2 - Criar produto informando nome e preço");
			System.out.println("3 - Exibir informações do produto");
			System.out.println("4 - Atribuir nome do produto");
			System.out.println("5 - Obter nome do produto");
			System.out.println("6 - Atribuir preço do produto");
			System.out.println("7 - Obter preço do produto");
			System.out.println("8 - Atribuir quantidade em estoque");
			System.out.println("9 - Obter quantidade em estoque");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1:
				teclado.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProduto = teclado.nextLine();
				p = new Produto(nomeProduto);
				break;
				
			case 2:
				teclado.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProduto = teclado.nextLine();
				System.out.println("Digite o preço do produto: ");
				precoProduto = teclado.nextInt();
				p = new Produto(nomeProduto, precoProduto);
				break;
				
			case 3:
				p.exibirInformacoes();
				break;
				
			case 4:
				teclado.nextLine();
				System.out.println("Digite o nome: ");
				nomeProduto = teclado.nextLine();
				p.setNome(nomeProduto);
				break;
				
			case 5:
				p.getNome();
				break;
				
			case 6:
				System.out.println("Digite o preço: ");
				precoProduto = teclado.nextInt();
				p.setPreco(precoProduto);
				break;
				
			case 7:
				p.getPreco();
				break;
				
			case 8:
				System.out.println("Digite a quantidade em estoque:");
				quantidadeEstoqueProduto = teclado.nextInt();
				p.setQuantidadeEstoque(quantidadeEstoqueProduto);
				break;
				
			case 9:
				p.getQuantidadeEstoque();
				break;
				
			default:
				opcao = 0;
				System.out.println("Programa encerrado!");
				break;
				
			}
		}while(opcao != 0);
		
		
		
		teclado.close();
	}

}

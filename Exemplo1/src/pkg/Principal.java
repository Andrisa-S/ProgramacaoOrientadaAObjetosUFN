package pkg;

public class Principal {

	public static void main(String[] args) {
		//Exemplo 1: Tentando acessar um elemento fora do índice de um array
		int[] numeros = {1, 2, 3};
		try {
			System.out.println(numeros[3]); //ArraysIndexOutOfBoundsException
		} catch (Exception e) {
			System.out.println("Exceção: "+e.getMessage());
			System.out.println("Exceção: "+e.toString());
		}
		System.out.println("O programa segue em execução!");
		System.out.println(numeros[3]); //Fora do try, gera um erro
		System.out.println("Agora não!"); //Aqui já não executa
		

	}

}

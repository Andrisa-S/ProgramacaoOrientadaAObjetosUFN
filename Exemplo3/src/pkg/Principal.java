package pkg;

public class Principal {

	public static void main(String[] args) {
		//Exemplo 3: Tentando converter uma String em um número
		String numero = "abc";
		 //int valor = Integer.parseInt(numero); // NumberFormatException
		try {
			int n = Integer.parseInt(numero);
			System.out.println("Convertido: " +n);
		}catch(NumberFormatException e) {
			System.out.println("Exceção de formato: "+e.toString());
		}
	}

}
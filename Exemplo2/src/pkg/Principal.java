package pkg;

public class Principal {

	public static void main(String[] args) {
		// Exemplo 2: Divisão por zero
		/*
		 * int a = 10; int b = 0; System.out.println(a / b); // ArithmeticException
		 */
		int a, b;
		a = 10;
		b = 0;
		
		try {
			System.out.println(a/b);
		} 
		catch(ArithmeticException e) {
			System.out.println("Exceção aritmética: "+e.toString());
		}
		catch(Exception e) {
			System.out.println("Exceção: "+e.toString());
		}
	}

}

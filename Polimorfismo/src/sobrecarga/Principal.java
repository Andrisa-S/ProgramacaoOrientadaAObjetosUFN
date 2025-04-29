package sobrecarga;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("---SOMA---");
		int resultado1 = calc.somar(10, 5);
		int resultado2 = calc.somar(30, 15, 5);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		
		double resultado3 = calc.somar(3, 7);
		
		System.out.println("Resultado 3: " + resultado3);
		
		System.out.println("\n---MULTIPLICAÇÃO---");
		int resultado4 = calc.multiplicar(3, 7);
		double resultado5 = calc.multiplicar(1.5, 13);
		
		System.out.println("Resultado 1: " + resultado4);
		System.out.println("Resultado 2: " + resultado5);
	}

}

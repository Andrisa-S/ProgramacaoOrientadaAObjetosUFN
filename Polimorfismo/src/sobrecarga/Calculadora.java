package sobrecarga;

public class Calculadora {
	public int somar (int x, int y) {
		System.out.println("Método inteiro");
		return x + y;
	}
	
	public int somar (int x, int y, int z) {
		return x + y + z;
	}

	public double somar(double d, double y) {
		System.out.println("Esse é o método double!");
		return d + y;
	}
	
	public int multiplicar(int x, int y) {
		return x * y;
	}
	
	public double multiplicar(double x, double y) {
		return x * y;
	}
}

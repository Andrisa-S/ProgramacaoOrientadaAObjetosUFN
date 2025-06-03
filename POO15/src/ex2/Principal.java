package ex2;

public class Principal {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo(3, 7, 10);
		Triangulo t2 = new Triangulo(5, 5, 7);
		
		try {
			t1.validarTriangulo();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			t2.validarTriangulo();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}

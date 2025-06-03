package ex2;

public class Triangulo {
	private int lado1, lado2, lado3;

	public Triangulo(int lado1, int lado2, int lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public void validarTriangulo() throws MinhaExcecao {
		if ((lado1 + lado2) <= lado3) {
			throw new MinhaExcecao("IllegalArgumentException");
		} else {
			System.out.println("Triângulo válido!");
		}
	}
}

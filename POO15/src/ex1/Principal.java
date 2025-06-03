package ex1;

public class Principal {

	public static void main(String[] args) {
		Pessoa a = new Pessoa("Andrisa", 20);
		Pessoa b = new Pessoa("Luke", 170);
		
		try {
			a.validarIdade();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			b.validarIdade();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}

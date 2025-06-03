package ex3;

public class Principal {

	public static void main(String[] args) {
		Agenda a = new Agenda("Drih", 990187345);
		Agenda b = new Agenda("", 0);
		
		try {
			a.adicionarContato();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			b.adicionarContato();
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}

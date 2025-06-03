package desafio;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setLimite(500);
		cc.setSaldo(3000);
		
		try {
			cc.sacar(700);
		} catch (MinhaExcecao e){
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			cc.sacar(-10);
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			cc.depositar(-30);
		} catch (MinhaExcecao e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}

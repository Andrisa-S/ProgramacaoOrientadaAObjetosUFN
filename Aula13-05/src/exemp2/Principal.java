package exemp2;

public class Principal {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Arroz", 23.6);
		Produto produto2 = produto1.clone(); //clone, exatamente igual
		
		System.out.println("*Produto 1:*");
		System.out.println("Nome: " + produto1.getNome());
		System.out.println("Preço: " + produto1.getPreco() + "\n");
		System.out.println("*Produto 2:*");
		System.out.println("Nome: " + produto2.getNome());
		System.out.println("Preço: " + produto2.getPreco() + "\n");

		produto2.setPreco(15.3); //muda o preço do clone
		
		System.out.println("*Produto 1:*");
		System.out.println("Nome: " + produto1.getNome());
		System.out.println("Preço: " + produto1.getPreco() + "\n");
		System.out.println("*Produto 2:*");
		System.out.println("Nome: " + produto2.getNome());
		System.out.println("Preço: " + produto2.getPreco() + "\n");
		
		if (produto1 == produto2) {
			System.out.println("São iguais!"); //return this;
		} else {
			System.out.println("São diferentes."); //return new Produto...
		}
	}

}

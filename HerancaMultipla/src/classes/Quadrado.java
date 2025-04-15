package classes;

public class Quadrado extends Desenho2D{
	protected String desc;
	
	public Quadrado(int largura, int altura, String desc) {
		super(largura, altura);
		this.desc = desc;
	}
		
		public void exibeDados() {
			System.out.println("Nome do autor: " + this.nomeAutor);
			System.out.println("Largura: " + this.largura);
			System.out.println("Altura: " + this.altura);
			System.out.println("Descrição: " + this.desc);
		}
	
}

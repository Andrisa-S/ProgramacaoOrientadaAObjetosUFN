package pkg;

public class Principal {

	public static void main(String[] args) {
		Livro p = new Livro();
		
		p.titulo = "O corvo";
		p.autor = "Edgar Allan Poe";
		p.anoPublicacao = 1845;
		
		System.out.println("Título: " + p.titulo);
		System.out.println("Autor: " + p.autor);
		System.out.println("Ano de publicação: " + p.anoPublicacao);
	}

}

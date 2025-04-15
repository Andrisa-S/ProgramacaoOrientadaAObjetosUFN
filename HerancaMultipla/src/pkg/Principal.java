package pkg;

import classes.Quadrado;

public class Principal {

	public static void main(String[] args) {
		Quadrado q = new Quadrado(80, 180, "Quadrado teste");
		
		q.steNomeAutor("Andrisa");
		q.exibeDados();
	}

}

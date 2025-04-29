package trabalho;

public class Principal {

	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.nome = "Nadine";
		a.exibirNome();
		a.trabalhar();
		System.out.println();
		
		Programador p = new Programador();
		p.dizerOla();
		p.nome = "Andrisa";
		p.exibirNome();
		p.trabalhar();
		p.dizerOla("Drih");
	}

}

package pkg;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Andrisa", 20);
		
		p.exibeDados();
		
		PessoaJuridica j = new PessoaJuridica("UD3D", 2, "9876", "Drih", "20/08");
		j.exibeDadosJur();
	}

}

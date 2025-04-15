package pkg;

public class PessoaJuridica extends Pessoa{
	String CNPJ;
	String socio;
	String dtAbertura;
	
	public PessoaJuridica(String nome, int idade, String CNPJ, String socio, String dtAbertura) {
		super(nome, idade);
		this.CNPJ = CNPJ;
		this.socio = socio;
		this.dtAbertura = dtAbertura;
	}
	
	public void exibeDadosJur() {
		exibeDados();
		System.out.println("CNPJ: " + CNPJ);
		System.out.println("Sócio: " + socio);
		System.out.println("Data de Abertura: " + dtAbertura);
	}
	
}

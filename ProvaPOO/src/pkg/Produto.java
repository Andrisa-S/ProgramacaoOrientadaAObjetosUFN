package pkg;

public class Produto {
	private String nome;
	private int preco;
	private int quantidadeEstoque;
	
	public Produto (String nome) {
		this.nome = nome;
	}
	
	public Produto (String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		System.out.println("Nome: " + nome);
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPreco() {
		System.out.println("Preço: " + preco);
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public int getQuantidadeEstoque() {
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void exibirInformacoes() {
		System.out.println("***Informações do Produto***");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
	}
}

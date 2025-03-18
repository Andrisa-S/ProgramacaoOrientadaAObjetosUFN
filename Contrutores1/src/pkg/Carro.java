package pkg;

public class Carro {
	public String marca;
	public String modelo;
	
	public Carro() { //Quando não tem construtor, o compilador compreende!
		
	}
	
	public Carro(String modeloCarro) {
		modelo = modeloCarro;
	}
	
	public Carro(String marcaCarro, String modeloCarro) {
		marca = marcaCarro;
		modelo = modeloCarro;
	}

	public void exibirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: "+ modelo);
	}
}

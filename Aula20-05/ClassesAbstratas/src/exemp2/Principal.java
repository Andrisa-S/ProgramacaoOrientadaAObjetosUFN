package exemp2;

public class Principal {

	public static void main(String[] args) {
		Forma r = new Retangulo(50, 169);
		
		System.out.println("Área: " + r.area());
		System.out.println("Perímetro: " + r.perimetro());
		
		Forma c = new Circulo(7);
		
		System.out.println("Área: " + c.area());
		System.out.println("Perímetro: " + c.perimetro());
	}

}

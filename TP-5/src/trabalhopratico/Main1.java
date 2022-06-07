package trabalhopratico;
public class Main1 {
	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(4f);
		Retangulo r1 = new Retangulo(2f,5f);
		Circulo c1 = new Circulo(7f);
		
		System.out.println("Lado Quadrado: " + q1.getLado());
		System.out.println("Lado Retangulo: " + r1.getAltura());
		System.out.println("Raio Circulo: " + c1.getRaio());
		System.out.println("=================================");
		System.out.println("Perimetro Quadrado: " + q1.calculoPerimetro());
		System.out.println("Perimetro Retangulo: " + r1.calculoPerimetro());
		System.out.println("Perimetro Circulo: " + c1.calculoPerimetro());
		System.out.println("=================================");
		System.out.println("Área Quadrado: " + q1.calculoArea());
		System.out.println("Área Reatângulo: " + r1.calculoArea());
		System.out.println("Área Circulo: " + c1.calculoArea());

	}

}

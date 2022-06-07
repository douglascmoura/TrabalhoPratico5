package trabalhopratico;
public class Retangulo extends Quadrilatero {
	
	private float base;
	private float altura;
	
	public Retangulo(float b, float a) {
		lado1 = b;
		lado2 = a;
		lado3 = b;
		lado4 = a;
		this.base = b;
		this.altura = a;
	}
	public float calculoArea() {
		return base*altura;
	}
	public float calculoPerimetro() {
		return lado1 + lado2 + lado3 + lado4; 
	}
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
	
	
}

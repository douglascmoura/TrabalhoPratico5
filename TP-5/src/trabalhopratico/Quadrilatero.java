package trabalhopratico;
public abstract class Quadrilatero {
	
	public float lado1;
	public float lado2;
	public float lado3;
	public float lado4;
	
	public float calculoPerimetro(float p) {
		p = lado1 + lado2 + lado3 + lado4;
		return p;
	}

}

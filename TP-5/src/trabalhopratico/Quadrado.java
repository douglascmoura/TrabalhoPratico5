package trabalhopratico;
public class Quadrado extends Quadrilatero {
	
	private float lado;
	
	public Quadrado(float l) {
		this.setLado(l);
	}

	public float getLado() {
		return lado;
	}
	private void setLado(float lado) {
		this.lado = lado;
	}
	
	public float calculoArea() {
		return lado*lado;
	}
	public float calculoPerimetro() {
		return 4*lado;
	}
	

}

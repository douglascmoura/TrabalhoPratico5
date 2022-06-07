package trabalhopratico;
public class Circulo implements FormaGeometrica {
	
	private float raio;
	
	public Circulo() {
		this.raio = 1;
	}
	public Circulo(float r) {
		this.raio = r;
	}
	
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	///////////////////////////////////////////////////
	public float calculoPerimetro() {
		return 2*(3.14f)*this.getRaio();
	}
	public float calculoArea() {
		return (3.14f)*this.getRaio()*2;
	}
	
	
	
	
	
}

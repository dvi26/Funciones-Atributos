package e4;

public class Cilindro {
	double radioBase;
	double altura;

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}

	public Cilindro() {
	}

	public double volumen() {
		return Math.PI * radioBase * radioBase * altura;
	}

	public double area() {
		return ((Math.PI * 2 * radioBase * altura) + (Math.PI * 2 * radioBase * radioBase));
	}
}

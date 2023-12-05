package e3;

public class Circulo {
	double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo() {
	}

	public double circunferencia() {
		return 2 * Math.PI * radio;
	}

	public double area() {
		return radio * radio * Math.PI;
	}
}

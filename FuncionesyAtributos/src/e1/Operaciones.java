package e1;

public class Operaciones {
	double num1;
	double num2;

	public Operaciones() {

	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		double suma = num1 + num2;
		return suma;

	}

	public double resta() {
		double resta = num1 - num2;
		return resta;

	}

	public double multiplicacion() {
		double multiplicacion = num1 * num2;
		return multiplicacion;

	}

	public double division() {
		double division = num1 / num2;
		return division;
	}

	public double maximo() {
		double maximo = num1 > num2 ? num1 : num2;
		return maximo;

	}

	public double minimo() {
		double maximo = num1 > num2 ? num2 : num1;
		return maximo;
	}
}

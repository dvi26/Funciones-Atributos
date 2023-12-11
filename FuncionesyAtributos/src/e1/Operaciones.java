package e1;

public class Operaciones {
	double num1;
	double num2;
	//Inicializo las variables num1 y num2

	public Operaciones() {
//Constructor vacio
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		//Constructor objeto
	}

	public double suma() {
		double suma = num1 + num2;
		return suma;
		//Funcion que devuelve la suma

	}

	public double resta() {
		double resta = num1 - num2;
		return resta;
		//Funcion que devuelve la resta

	}

	public double multiplicacion() {
		double multiplicacion = num1 * num2;
		return multiplicacion;
		//Funcion que devuelve la multiplicacion
	}

	public double division() {
		double division = num1 / num2;
		return division;
		//Funcion que devuelve la division
	}

	public double maximo() {
		double maximo = num1 > num2 ? num1 : num2;
		return maximo;
		//Funcion que devuelve el maximo

	}

	public double minimo() {
		double maximo = num1 > num2 ? num2 : num1;
		return maximo;
		//Funcion que devuelve el minimo
	}
}

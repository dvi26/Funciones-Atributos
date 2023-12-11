package e3;

public class Circulo {
	double radio;
	//Inicializo la variable radio

	public Circulo(double radio) {
		this.radio = radio;
		//Constructor objeto
	}

	public Circulo() {
		//Constructor vacio
	}

	public double circunferencia() {
		return 2 * Math.PI * radio;
		//Funcion que devuelve la circunferencia del circulo
	}

	public double area() {
		return radio * radio * Math.PI;
		//Funcion que devuelve el area 
	}
}

package e2;

public class Rectangulo {
	double alto;
	double ancho;
	//Inicializo las variables del alto y el ancho

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
		//Constructor objeto
	}

	public Rectangulo() {
//Constructor vacio
	}

	public double perimetro() {
		return 2 * alto + 2 * ancho;
		//Funcion que devuelve el perimetro
	}

	public double area() {
		return alto * ancho;
		//Funcion que devuelve el area
	}
}

package e4;

public class Cilindro {
	double radioBase;
	double altura;
	//Creo las variables radioBase y altura

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
		//Constructor objeto 
	}

	public Cilindro() {
		//Constructor vacio
	}

	public double volumen() {
		return Math.PI * radioBase * radioBase * altura;
		//Funcion que devuelve el valor del volumen
	}

	public double area() {
		return ((Math.PI * 2 * radioBase * altura) + (Math.PI * 2 * radioBase * radioBase));
		//Funcion que devuelve el valor del area-
	}
}

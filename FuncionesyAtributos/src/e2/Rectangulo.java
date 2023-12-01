package e2;

public class Rectangulo {
double alto;
double ancho;
public Rectangulo(double alto, double ancho) {
	this.alto = alto;
	this.ancho = ancho;
}
public Rectangulo() {
	
}
public double perimetro() {
	return 2*alto+2*ancho;
}
public double area() {
return alto*ancho;
}
}

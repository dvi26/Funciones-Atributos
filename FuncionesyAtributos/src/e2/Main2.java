package e2;

import java.util.Scanner;

public class Main2 {
	static Scanner sc = new Scanner(System.in);
	//Scanner para todo el codigo
	public static void main(String[] args) {
		int opc;
		//Variable para la opcion a introducir
		opc = menu();
		//Opc = menu que llama a la funcion menu
		while (opc != 0) {
			//Bucle para que mientras que la opcion no sea 0, siga
			double alto, ancho;
			//Variables para el alto y el ancho
			alto = pideAlto();
			//Llamo a la funcion pideAlto
			ancho = pideAncho();
			//Llamo a la funcion pideAncho
			Rectangulo op = new Rectangulo(alto, ancho);
			//Creo objeto para poder llamar a las fucniones no estaticas de la otra clase
			switch (opc) {
			case 1 -> System.out.println(op.perimetro());
			case 2 -> System.out.println(op.area());
			}
			//Switch que comprueba el valor de la opc y hace el system out con la operacion de la otra clase correspondiente
			opc = menu();
			//Llama al menu otra vez
		}
		sc.close();
		//Cierro el scanner
	}

	public static int menu() {
		//Funcion que mostrará el menu y devolverá el valor del numero al llamarla en el main
		int num;
		//Variable para el num a introducir
		System.out.println("1.Perímetro");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		//System outs con el menu
		num = sc.nextInt();
		//Num scanner para introducirlo con el teclado
		return num;
		//Devuelve el valor del num
	}

	public static double pideAncho() {
		//Funcion que preguntará y devolverá el ancho al ser llamada en el main
		double ancho;
		//Variable para el ancho
		System.out.println("Introduza el ancho");
		//System out que pregunta por el ancho
		ancho = sc.nextDouble();
		//Ancho scanner para introducirlo con el teclado
		return ancho;
		//Devuelve el ancho
	}

	public static double pideAlto() {
		//Funcion que preguntará y devolverá el alto al ser llamada en el main
		double alto;
		//Variable para el alto
		System.out.println("Introduza el alto");
		//System out que pregunta por el alto
		alto = sc.nextDouble();
		//Alto scanner para introducirlo con el teclado
		return alto;
		//Devuelve el valor del alto
	}
}

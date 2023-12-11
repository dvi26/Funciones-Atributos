package e4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);
	//Scanner para todo el codigo
	public static void main(String[] args) {
		System.out.println("Introduzca el radio");
		//System out que pide el radio
		double radio = pideRadioBase();
		//Creo variable radio con el valor de lo que devuelva la funcion pideRadioBase
		System.out.println("Introduzca la altura");
		//System out que pide la altura
		double altura = altura();
		//Creo variable altura con el valor de lo que devuelva la funcion altura
		Cilindro op = new Cilindro(radio, altura);
		//Creo objeto para poder llamar a las funciones no estáticas de la otra clase
		int opc = menu();
		//Variable opc con el valor de lo que devuelva la funcion menu
		if (opc != 0) {
			//Si opc no es igual que 0 hace el switch
			switch (opc) {
			case 1 -> System.out.println(op.volumen());
			case 2 -> System.out.println(op.area());
			//Switch que comprueba el valor de opc, y hace un system out con el valor que devuelva la funcion de la otra clase correspondiente
			}
		}
	}

	public static int menu() {
		//Funcion menu que muestra el menu, pide y devuelve el valor de un numero (opc)
		int num;
		//Variable num a introducir
		System.out.println("1.Volumen");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		//System outs del menu
		num = sc.nextInt();
		//Num scanner para introducirlo con el teclado
		return num;
		//Devuelve el valor de num
	}

	public static double pideRadioBase() {
		//Funcion que pide el radio y lo devuelve al ser llamada en el main 
		double radio;
		//Variable radio
		radio = sc.nextDouble();
		//Scanner radio para introducirlo con el teclado
		return radio;
		//Devuelve el valor de radio
	}

	public static double altura() {
		//Funcion que pide la altura y la devuelve al ser llamada en el main
		double altura = 0;
		//Variable altura
		//
		try {
			altura = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido erroneo");
		} finally {
			sc.nextLine();
		}
		return altura;
	}
}

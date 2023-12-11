package e3;

import java.util.Scanner;

public class Main3 {
	static Scanner sc = new Scanner(System.in);
	//Scanner para todo el codigo
	public static void main(String[] args) {
		int opc = menu();
		//Variable para la opcion a introducir con el valor de lo que devuela la funcion menu
		double radio;
		//Variable para el radio
		while (opc != 0) {
			//Bucle para que mientras que la opcion no sea 0, siga
			radio = pideRadio();
			//LLama a la funcion pideRadio para darle el valor a radio de lo que devuelva
			Circulo op = new Circulo(radio);
			//Creo objeto para poder llamar a las funciones de la otra clase no estáticas
			switch (opc) {
			case 1 -> System.out.println(op.circunferencia());
			case 2 -> System.out.println(op.area());
			}
			//Switch que depende de lo que valga opc haga el system out con la operacion de la otra clase correspondiente
			opc = menu();
			//LLamo a el menu otra vez, ya que no se ha salido (0)
		}
		sc.close();
		//Cierro el scanner
	}

	public static int menu() {
		//Funcion menu que mostrará el menu, pedirá y devolverá el valor del numero al ser llamada en el main
		int num;
		//Variable num
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		//System outs del menu
		num = sc.nextInt();
		//Num scanner para introducirlo con el teclado
		return num;
		//Devuelvo el valor de num
	}

	public static double pideRadio() {
		//Funcion que pedirá y devolverá el valor introducido del radio al ser llamada en el main
		double radio;
		//Variable del radio
		System.out.println("Introduzca el radio");
		//System out que pregunta por el radio
		radio = sc.nextDouble();
		//Radio scanner para introducirlo con el teclado
		return radio;
		//Devuelve el valor de radio
	}
}
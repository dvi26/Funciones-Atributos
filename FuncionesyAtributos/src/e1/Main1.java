package e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);
	//Scanner para todo el codigo

	public static void main(String[] args) {
		int num = menu();
		//Inicializo la variable num que guardará el número resultante de la funcion menu().
		while (num != 0) {
			//Bucle mientras que num no sea 0
			double n1 = pideNumero();
			double n2 = pideNumero();
			//Inicializo ambas variables n1 y n2 dandole primero el valor a n1 de lo que devuelve la funcion pideNumero,una vez dado el primer valor,hace lo mismo para n2.
			Operaciones op = new Operaciones(n1, n2);
			//Creo un objeto para poder llamar a las funciones no estáticas
			switch (num) {
			case 1 -> System.out.println(op.suma());
			case 2 -> System.out.println(op.resta());
			case 3 -> System.out.println(op.multiplicacion());
			case 4 -> System.out.println(op.division());
			case 5 -> System.out.println(op.maximo());
			case 6 -> System.out.println(op.minimo());
			//Switch que comprueba el valor del num y hace el system out con la operacion de la otra clase correspondiente
			}
			num = menu();
			//Vuelve a pedir el menu
		}
		sc.close();
		//Cierro el scanner
	}

	public static int menu() {
		//Funcion menu que mostrará los system outs del menu , pide un numero y lo devuelve
		int num;
		//Variable num
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
		System.out.println("0.Salir");
		//System outs del menu
		num = sc.nextInt();
		//Num scanner para escribirlo con el teclado
		return num;
		//Devuelve el valor de num
	}

	public static double pideNumero() {
		//Funcion pideNumero que pide el numero a introducir y lo devuelve
		double n1 = 0;
		//Inicializo la variable n1
		boolean cond = true;
		//Condicion para que el bucle sea infinito meintras no sea false
		do {
			try {
				System.out.println("Introduza un número");
				//System out para preguntar por el numero
				n1 = sc.nextDouble();
				//n1 scanner para introducir el numero
				cond = false;
				//Si el numero se introduce correctamente, sale del bucle, al ser la condicion false
			} catch (InputMismatchException e) {
				//Try catch para pillar las excepciones por error al no ser int
				System.out.println("El número introducido es erróneo");
				//Si hay una excepcion dice que el numero es incorrecto

			} finally {
				sc.nextLine();
				//Finally que hace siempre el next line para limpiar el scanner
			}
		} while (cond);
		// While con la condicion para que si es true, siga haciendo el bucle (preguntando el numero)
		return n1;
		//Devuelve el valor de n1

	}

}

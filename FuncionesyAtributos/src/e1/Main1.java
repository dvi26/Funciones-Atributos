package e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = menu();
		//Inicializco la variable num que guardará el número resultante de la funcion menu().
		while (num != 0) {
			//Bucle mientras que num no sea 0
			double n1 = pideNumero();
			double n2 = pideNumero();
			//Inicializo ambas variables dandole primero el valor a n1 del resultante de 
			Operaciones op = new Operaciones(n1, n2);
			switch (num) {
			case 1 -> System.out.println(op.suma());
			case 2 -> System.out.println(op.resta());
			case 3 -> System.out.println(op.multiplicacion());
			case 4 -> System.out.println(op.division());
			case 5 -> System.out.println(op.maximo());
			case 6 -> System.out.println(op.minimo());
			}
			num = menu();
		}
		sc.close();
	}

	public static int menu() {
		int num;
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("5.Máximo");
		System.out.println("6.Mínimo");
		System.out.println("0.Salir");
		num = sc.nextInt();
		return num;
	}

	public static double pideNumero() {
		double n1 = 0;
		boolean cond = true;
		do {
			try {
				System.out.println("Introduza un número");
				n1 = sc.nextDouble();
				cond = false;
			} catch (InputMismatchException e) {
				System.out.println("El número introducido es erróneo");

			} finally {
				sc.nextLine();
			}
		} while (cond);
		return n1;

	}

}

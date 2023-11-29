package e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int num=menu();
		double n1=pideNumero();
		double n2=pideNumero();
		Operaciones op = new Operaciones(n1,n2);
		switch (num) {
		case 1 -> op.suma();
		case 2 -> op.resta();
		case 3 -> op.multiplicacion();
		case 4 -> op.division();
		case 5 -> op.maximo();
		case 6 -> op.minimo();
		}
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
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		return num;
	}

	public static double pideNumero() {
		double n1 = 0;
		boolean cond = true;
		Scanner sc = new Scanner(System.in);
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
		} while (cond = true);
		return n1;

	}

}

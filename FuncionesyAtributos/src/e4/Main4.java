package e4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca el radio");
		double radio = pideRadioBase();
		System.out.println("Introduzca la altura");
		double altura = altura();
		Cilindro op = new Cilindro(radio, altura);
		int opc = menu();
		if (opc != 0) {
			switch (opc) {
			case 1 -> System.out.println(op.volumen());
			case 2 -> System.out.println(op.area());
			}
		}
	}

	public static int menu() {
		int num;
		System.out.println("1.Volumen");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		num = sc.nextInt();
		return num;
	}

	public static double pideRadioBase() {
		double radio;
		radio = sc.nextDouble();
		return radio;
	}

	public static double altura() {
		double altura = 0;
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

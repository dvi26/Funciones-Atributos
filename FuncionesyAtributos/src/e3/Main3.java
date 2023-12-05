package e3;

import java.util.Scanner;

public class Main3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = menu();
		double radio;
		while (opc != 0) {
			radio = pideRadio();
			Circulo op = new Circulo(radio);
			switch (opc) {
			case 1 -> System.out.println(op.circunferencia());
			case 2 -> System.out.println(op.area());
			}
			opc = menu();
		}
		sc.close();
	}

	public static int menu() {
		int num;
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		num = sc.nextInt();
		return num;
	}

	public static double pideRadio() {
		double radio;
		System.out.println("Introduzca el radio");
		radio = sc.nextDouble();
		return radio;
	}
}
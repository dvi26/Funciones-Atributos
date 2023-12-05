package e2;

import java.util.Scanner;

public class Main2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		opc = menu();
		while (opc != 0) {
			double alto, ancho;
			alto = pideAlto();
			ancho = pideAncho();
			Rectangulo op = new Rectangulo(alto, ancho);
			switch (opc) {
			case 1 -> System.out.println(op.perimetro());
			case 2 -> System.out.println(op.area());
			}
			opc = menu();
		}
		sc.close();
	}

	public static int menu() {
		int num;
		System.out.println("1.Perímetro");
		System.out.println("2.Area");
		System.out.println("0.Salir");
		num = sc.nextInt();
		return num;
	}

	public static double pideAncho() {
		double ancho;
		System.out.println("Introduza el ancho");
		ancho = sc.nextDouble();
		return ancho;
	}

	public static double pideAlto() {
		double alto;
		System.out.println("Introduza el alto");
		alto = sc.nextDouble();
		return alto;
	}
}

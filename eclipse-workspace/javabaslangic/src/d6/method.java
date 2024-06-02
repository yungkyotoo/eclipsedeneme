package d6;

import java.util.Scanner;

public class method {
//girilen iki sayi birbirine esit mi degil mi

	public static void main(String[] args) {

		//esit1();
		if (esit2()) {
			System.out.println("Esit");

		} else {
			System.out.println("Esit degiller");
		}

	}

	public static void esit1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayiyi seciniz: ");
		int a = scanner.nextInt();
		System.out.println("Ikinci sayiyi seciniz: ");
		int b = scanner.nextInt();
		if (a == b) {
			System.out.println("Esit");

		} else {
			System.out.println("Esit degiller");
		}

	}

	public static boolean esit2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayiyi seciniz: ");
		int a = scanner.nextInt();
		System.out.println("Ikinci sayiyi seciniz: ");
		int b = scanner.nextInt();
		boolean isequal = (a == b);
		return isequal;
	}

}

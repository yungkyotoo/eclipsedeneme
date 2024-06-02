package d8;

import java.util.Scanner;

public class ifelse {
	// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
	// calisan erkekse 65 yasindan buyukse emekli olabilir

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("cinsiyetinizi k veya e olarak giriniz:");
		char gender = scanner.next().charAt(0);
		if (gender=='k' || gender=='e') {
			System.out.println("yasinizi giriniz:");
			int yas = scanner.nextInt();
			emeklilik(gender, yas);
		}else {
			System.out.println("yanlis deger");
		}
		
	
	}

	public static void emeklilik(char gender, int age) {

		if (gender == 'k') {
			if (age >= 60) {
				System.out.println("emekli olabilir");
			} else {
				System.out.println("emekli olmaniza kalan yil:" + (60 - age));
			}

		} else if (gender == 'e') {
			if (age >= 65) {
				System.out.println("emekli olabilir");
			} else {
				System.out.println("emekli olmaniza kalan yil:" + (65 - age));
			}

		}
		
		

		
	}

}

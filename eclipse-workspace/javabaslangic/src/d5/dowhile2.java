package d5;

import java.util.Iterator;
import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		// kullanicidan sayi iste asal sayi mi degil mi onu bul
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int counter = 0;
		for (int i = 1; i <= a; i++) {
			
				
			if (counter>2) {	
				System.out.println("asal degil");break;
			}
			if (a % i == 0) {
				counter++;
			}
		}System.out.println(counter +"tane boleni var");

	}
}

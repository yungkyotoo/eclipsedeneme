package d5;

import java.util.Scanner;

public class break1 {
//kullanicidan 5 tane sayi alin kullanici cift sayi girdiginde donguden ciksin
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		for (int i = 1; i < 6; i++) {
			int a=scanner.nextInt();
			if (a%2==0) {
				System.out.println("Cift sayi girdiniz.");break;
			}
		}
	}
}

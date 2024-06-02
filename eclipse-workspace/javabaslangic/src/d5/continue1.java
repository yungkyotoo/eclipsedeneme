package d5;

import java.util.Scanner;

import javax.crypto.interfaces.DHPrivateKey;

public class continue1 {
//kullanicidan 5 tane sayi alin kullanici cift sayi girdiginde donguden ciksin
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=0;
		for (int i = 1; i < 6; i++) {
			 a=scanner.nextInt();
			if (a%2==0) {
				continue;
			}System.out.print("tek sayilar"+a);
		}
	}
}

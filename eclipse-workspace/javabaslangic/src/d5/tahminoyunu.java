package d5;

import java.util.Scanner;

public class tahminoyunu {

	public static void main(String[] args) {
		// kullanici rastgele olan sayiyi bilirse oyunu bitir
		Scanner scanner = new Scanner(System.in);

		int rand = (int) (Math.random() * 50);
		int tahmin = 0;
		System.out.println(rand);
		do {
			System.out.println("bir sayi tahmin ediniz ");
			tahmin = scanner.nextInt();
			if (Math.abs(tahmin-rand)<=10) {
				System.out.println("sicak");	
			
			
			}	
			
		} while (tahmin != rand);
		System.out.println("Tebrikler bildiniz");
	}
}

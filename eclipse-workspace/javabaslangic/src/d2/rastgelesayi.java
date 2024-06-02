package d2;

import java.util.Scanner;

public class rastgelesayi {
	//Math class'tan 1'den 100'e kadar rastgele bir sayı üretiniz.
    //ürettiğiniz sayı bardağın yüzde doluluk oranı olduğunu varsayınız.
    //Eğer kullanıcı %40 ve üzeri değerlere dolu derse ekrana optimist
    //%40 ve üzeri değerlere boş derse pesimist şeklinde ekrana yazdırın
public static void main(String[] args) {
	int rand=(int) (Math.random()*100+1);
	Scanner scanner=new Scanner(System.in);
	System.out.println("bardagin doluluk orani : % " +rand);
	if (rand>=40) {
		System.out.println("%40 uzerinde d/b ");
		String user=scanner.next();
		if (user.equals("dolu")) {
			System.out.println("Optimist");
		}else if (user.equals("bos")) {
			System.out.println("Pesimist");
		}else {
			System.out.println("Gecersiz deger.");
			System.exit(2);
		}
	}else {
		System.out.println("Deger %40in altinda.");
	}
	
}
}

package d2;

import java.util.Scanner;

public class sicaklik {
	//Girilen sıcaklık değerine göre havanının sıcak soğuk veya ılık olduğunu belirten kod print ediniz.
    //20'den altı soğuk 
    //20 ve 30 arası ılık
    //30 ve üzeri sıcak
    //Dikkat Kullanıcı eğer 60'derece üstü girerse veya -40 altı yanlış değer girdiniz şeklinde uyarı vermeli
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Sicaklik degeri giriniz: ");
	int a=scanner.nextInt();
	if (a>=30) {
		System.out.println("Sicak ");
	}else if (a>=20 && a<30) {
		System.out.println("Ilik ");
	}else {
		System.out.println("Soguk");
		
	}
}
}

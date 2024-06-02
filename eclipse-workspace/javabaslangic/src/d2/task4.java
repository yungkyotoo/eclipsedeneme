package d2;

import java.net.Socket;
import java.util.Scanner;

public class task4 {
	// Kullanıcının yaş bilgisini alarak oy kullanıp kullanmayacağı bilgisi veriniz


    //Kullanıcının gidiği sayının 20den büyük,küçük veya eşit olduğunu bulalım
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Yasinizi giriniz:");
		int a=scanner.nextInt();
		if (a>=18){
			System.out.println("Oy kullanabilir. ");	
		}else {
			System.out.println("Oy kullanamaz. ");
		}if (a>20) {
			System.out.println("20den buyuk.");
			
		}else if (a<20) {
			System.out.println("20den kucuk.");
			
			
		}else {
			System.out.println("20ye esit");
		}
			
		}
		
	}


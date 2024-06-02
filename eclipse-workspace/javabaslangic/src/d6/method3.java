package d6;

import java.util.Iterator;
import java.util.Scanner;



public class method3 {

	public static void main(String[] args) {
		//kullanicidan 2 sayi alin hangi islemi yapmak istiyorsam buna gore sonucu bulalim
		for (int i = 0; i <5; i++) {
			islem();
		}
	}
		
		
	
	public static void islem() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz:");
		int a=scanner.nextInt();
		System.out.println("Ikinci sayiyi giriniz:");
		int b=scanner.nextInt();
		System.out.println("Hangi islemi yapmak istersiniz.");
		char c=scanner.next().charAt(0);
		if (c=='+') {
			System.out.println(a+b);
		}else if (c=='-') {
			cikarma(a,b);
		}else if (c=='*') {
			int x=carpma(a,b);
			System.out.println(x);
		}else if (c=='/') {
			bolme(a,b);
			
		}else {
			System.out.println("Gecersiz islem");
		}
		{
			
		}
	}
	private static void bolme(float a, float b) {
		System.out.println(a/b);
		
	}
	private static int carpma(int a, int b) {
		return a*b;
	}
	private static void cikarma(int a, int b) {
		System.out.println(a-b);
		
	}
	
		
		
	
}

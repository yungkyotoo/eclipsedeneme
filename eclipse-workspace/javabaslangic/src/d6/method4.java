package d6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class method4 {
//kullanicidan sekil bilgisi alsin (kare, daire) ona gore cevre ve alan hesaplamasi yapsin
	static DecimalFormat df = new DecimalFormat("#.###");
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int r=0;
		System.out.println("Sekil seciniz.");
		String c=scanner.next();
		if (c.contains("dortgen")) {
			cevre(a,b);
			
			
		}else if (c.contains("daire")) {
			cevre(r);
		}
	}

	
	private static void cevre(int a, int b) {
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("Cevre: "+(2*(a+b)));
		alan(a,b);
	}private static void alan(int a, int b) {
		System.out.println("Alan: "+(a*b));
		
	}


	private static void cevre(int r) {
		r=scanner.nextInt();
		System.out.println("Cevre: "+(2*Math.PI*r));
		alan(r);
}


	private static void alan(int r) { 
	  double alan=(Math.PI*Math.pow(r, 2));
	  String a=df.format(alan);
		System.out.println("Alan: "+(a));
		
	}}

package d2;

import java.util.Scanner;

public class task3 {
	/*
    Math.abs(a)
    Girilen degerin mutlak degerini verir.

   Math.max(a, b)
   Girilen iki degerden buyuk olani verir.

   Math.min(a, b)
   Girilen iki degerden kucuk olani verir.

   Math.round(a)
   Girilen degerin en yakin tamsayiya yuvarlar.

   Math.sqrt(a)
   Girilen degerin karekokunu verir.

   Math.pow(a, b)
   Girilen a ve b degerini a uzeri b olarak verir.

   Math.ceil(a) 3.1 => 4
   Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

   Math.floor(a) 3.7 => 3
   Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
    */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a=Math.abs(scanner.nextDouble());
		System.out.println("Yas degeri " + a);
		double b=Math.max(a, 4);
		System.out.println("verilen sayilardan buyuk olani: " + b);
		System.out.println("a uzeri b: " +Math.round(Math.pow(a, b)));
	}
}

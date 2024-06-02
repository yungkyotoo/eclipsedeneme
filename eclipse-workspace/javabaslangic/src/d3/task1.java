package d3;

import java.util.Scanner;

public class task1 {
	//Kullanicidan uc sayi alip ortanca sayiyi bulun.
	//Math classini kullanin
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();
	int min=Math.min(a, Math.min(c, b));
	int max=Math.max(a, Math.max(c, b));
	if (a<max && a>min) {
		System.out.println("a= middle");
		
	}else if (b<max && b>min) {
		System.out.println("b= middle");
		
	}else {
		System.out.println("c= middle");
	}
}
}

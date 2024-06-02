package d4;

import java.util.Iterator;
import java.util.Scanner;

public class task4 {
	//Girilen iki sayı arasındaki tam sayıları print ediniz
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt(); //20
		int b=scanner.nextInt(); //10
		if (a>b) {
			for (int i=b;i<=a;i++) {
			System.out.print(i+" ");	
			}
				
			}
		else {
			for (int i=a;i<=b;i++) {
				System.out.print(i+" ");
			}
		}	
		}
	}


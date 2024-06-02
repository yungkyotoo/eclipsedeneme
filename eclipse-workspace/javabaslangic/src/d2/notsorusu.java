package d2;

import java.util.Scanner;

public class notsorusu {
	// TODO Auto-generated method stub
    //90-100 A
    //80-90 B
    //70-80 C
    //60-70 D
    //50-60 E
    //50-0 F
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Notunuzu giriniz: ");
		int a=scanner.nextInt();
		if (a>90){
			System.out.println("A ");
		}else if (a<=90 && a>80){
			System.out.println("B ");
		}else if (a<=80 && a>70) {
			System.out.println("C ");
		}else if (a<=70 && a>60) {
			System.out.println("D ");
		}else if (a<=60 && a>50) {
			System.out.println("E ");
		}else {
			System.out.println("F");
		}
			
		}
			
		 {
			
		
		
	}
}

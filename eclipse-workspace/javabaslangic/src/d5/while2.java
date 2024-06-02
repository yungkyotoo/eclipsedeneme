package d5;

import java.util.Scanner;

public class while2 {
//girilen sayinin carpim tablosunu olusturun
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int counter=1;
		while(counter<11) {
			System.out.println(a +"*"+counter+"="+(a*counter));
			counter++;
			
		}
	}
}

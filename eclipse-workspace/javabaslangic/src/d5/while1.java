package d5;

import java.util.Scanner;

public class while1 {
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sum=0;
	int counter=0;
	while (sum<=99) {
		int num=scanner.nextInt();
		sum+=num;counter++;
		
	}System.out.println("toplanan sayi adedi "+counter);
}
}

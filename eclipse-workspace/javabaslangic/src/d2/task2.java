package d2;

import java.util.Scanner;

public class task2 {
	/* Task->
    
Kullanicidan bir character girmesini isteyin ve
girilen karakteri ve ascii degerini yazin*
Ornek : Input  : a
Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
***/
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Karakter giriniz. ");
	String a=scanner.next();
	char b=a.charAt(0);
	char d=a.charAt(1);
	System.out.println(d+" " +b);
	int c=b;
	System.out.println("Karakterin ascii degeri: " + c);
	scanner.close();
}}
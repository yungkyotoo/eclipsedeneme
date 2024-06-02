package d4;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
	
	Scanner scanner=new Scanner(System.in);
	//Kullanıcıdan bir harf girmesi isteyin eğer v : very
					//i: important
					//p: person
					//diğerleri için geçersiz
	
	String str=scanner.next();
	int num=0;
	
	switch (str) {
	case "v": {
		System.out.println("very");
		num=scanner.nextInt();
		switch (num) {
		case 1: {
			
			System.out.println("Menu 1 : yaprak sarma");break;
		}
		case 2:{
			System.out.println("Menu 2 : salata");break;
			
		}
		default:
			System.out.println("çıkış");break;
			
		}break;}
	case "i": {
		System.out.println("important");
		num=scanner.nextInt();
		switch (num) {
		case 1: {
			
			System.out.println("Menu 1 : yaprak sarma");break;
		}
		case 2:{
			System.out.println("Menu 2 : salata");break;
			
		}
		default:
			System.out.println("çıkış");break;
		}break;}
	case "p": {
		System.out.println("person");
		num=scanner.nextInt();
		switch (num) {
		case 1: {
			
			System.out.println("Menu 1 : yaprak sarma");break;
		}
		case 2:{
			System.out.println("Menu 2 : salata");break;
			
		}
		default:
			System.out.println("çıkış");break;
	
	}}}

}}

	
	


	

	


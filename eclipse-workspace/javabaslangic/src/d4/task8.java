package d4;


import java.util.Scanner;

public class task8 {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();
	String ters="";
	for (int i=str.length()-1;i>=0;i--) {
		ters+=str.charAt(i);
	}
	System.out.println(ters);
	if (str.equals(ters)){
		System.out.print(" polyndrom");
		
	}else {
		System.out.println(" polyndrom degil");
	}
}
}

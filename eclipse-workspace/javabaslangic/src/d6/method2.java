package d6;

import java.util.Scanner;

public class method2 {
	
public static void main(String[] args) {
	//info diye method create edelim cagirdigimizda kullanicidan isim ve soyisim ve yasini alsin ve isim ve soyisimi ve yasini bize geri dondersin
	
	System.out.println(info("can", "mumcu", 22));
	System.out.println(info(null, null));
}
public static String info(String a,String b, int c) {
	Scanner scanner=new Scanner(System.in);
			a=scanner.next();
			b=scanner.next();
			c=scanner.nextInt();
			String full=(a+" "+b +" "+c);
			return full;
}
public static String info(String a,String b) {
	Scanner scanner=new Scanner(System.in);
			a=scanner.next();
			b=scanner.next();
			String full=(a+" "+b);
			return full;
}
}

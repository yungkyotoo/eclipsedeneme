package d3;

import java.util.Scanner;

public class task3 {
	//Kullanicidan isim ve soyisim alin ismin ilk harfi buyuk soyismin hepsi buyuk olucak sekilde yazdir
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Isim:"+name);
		name=name.substring(0, 1).toUpperCase()
				+name.substring(1,name.lastIndexOf(" ")).toLowerCase()
				+name.substring(name.lastIndexOf(" ")).toUpperCase();
		System.out.println("Isim soyisim:"+name);
	}
}
